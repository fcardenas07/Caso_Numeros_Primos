import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumerosPrimosTest {
    private int[] numeros;
    private boolean[] resultadosEsperados;

    @BeforeEach
    public void init() {
        numeros = new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 11, 13, 97};
        resultadosEsperados = new boolean[]{false, false, false, true, true, false, true, false, true, true, true, true};
    }

    @Test
    public void esPrimoTest() {
        for (int i = 0; i < numeros.length; i++) {
            boolean resultadoObtenido = NumerosPrimos.esPrimo(numeros[i]);
            assertEquals(resultadoObtenido, resultadosEsperados[i]);
        }
    }
}