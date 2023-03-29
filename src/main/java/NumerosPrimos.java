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
        int[] vectorPrimos = new int[cantidadPrimos];

        copiarVectores(vector, vectorPrimos);
        System.out.println("Numeros primos: ");
        mostrarVector(vectorPrimos);
    }

    public static void copiarVectores(int[] vector, int[] vectorPrimos) {
        int indice = 0;
        for (int numero : vector) {
            if (esPrimo(numero)) {
                vectorPrimos[indice] = numero;
                indice++;
            }
        }
    }

    public static int contarNumerosPrimos(int[] vector) {
        int contadorPrimos = 0;
        for (int numero : vector) {
            if (esPrimo(numero)) {
                contadorPrimos++;
            }
        }
        return contadorPrimos;
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;

        for (int i = 2; i <= numero / 2 ; i++) {
            if (numero % i == 0) return false;
        }

        return true;
    }

    public static void mostrarVector(int[] vector) {
        System.out.println(Arrays.toString(vector));
    }

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numeroAleatorio();
        }
    }

    public static int numeroAleatorio() {
        return (int) (Math.random() * 100 + 1);
    }

    public static int ingresarNumero() {
        Scanner teclado = new Scanner(System.in);
        try {
            return validarNumero(teclado.nextInt());
        } catch (Exception e) {
            System.out.println("Ingrese un numero valido");
            return ingresarNumero();
        }

    }

    public static int validarNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Ingrese un numero mayor a cero");
            return ingresarNumero();
        }
        return numero;
    }
}
