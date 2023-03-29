import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumerosPrimosTest {
    private int[] numeros;
    private boolean[] resultadosEsperados;

    @BeforeEach
    public void init() {
        numeros = new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 11, 13, 97, 479001599};
        resultadosEsperados = new boolean[]{true, false, false, true, true, false, true, false, true, true, true, true, true};
    }

    @Test
    public void esPrimoTest() {
        boolean[] resultadosObtenidos = new boolean[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            resultadosObtenidos[i] = NumerosPrimos.esPrimo(numeros[i]);

        }
        assertArrayEquals(resultadosEsperados, resultadosObtenidos);
    }
}