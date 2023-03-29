import java.util.Arrays;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        int dimension = ingresarNumero();
        int[] vector = new int[dimension];

        llenarVector(vector);
        mostrarVector(vector);

        int cantidadPrimos = contarNumerosPrimos(vector);
    }

    private static int contarNumerosPrimos(int[] vector) {
        int contadorPrimos = 0;
        for (int numero : vector) {
            if (esPrimo(numero)) {
                contadorPrimos++;
            }
        }
        return contadorPrimos;
    }

    private static boolean esPrimo(int numero) {
        if (numero < 2) return false;

        for (int i = 2; i < numero / 2 ; i++) {
            if (numero % i == 0) return false;
        }

        return true;
    }

    private static void mostrarVector(int[] vector) {
        System.out.println(Arrays.toString(vector));
    }

    private static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numeroAleatorio();
        }
    }

    private static int numeroAleatorio() {
        return (int) (Math.random() * 100 + 1);
    }

    private static int ingresarNumero() {
        Scanner teclado = new Scanner(System.in);
        try {
            return validarNumero(teclado.nextInt());
        } catch (Exception e) {
            System.out.println("Ingrese un numero valido");
            return ingresarNumero();
        }

    }

    private static int validarNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Ingrese un numero mayor a cero");
            return ingresarNumero();
        }
        return numero;
    }
}
