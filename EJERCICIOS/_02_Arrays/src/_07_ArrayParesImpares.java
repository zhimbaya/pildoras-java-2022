import java.util.Scanner;

public class _07_ArrayParesImpares {
    public static void main(String[] args) {
        int[] numeros, pares, impares;
        int totalpares = 0, totalimpares = 0;

        numeros = new int[5];
        System.out.println("Ingresar 5 enteros");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                totalpares++;
            } else {
                totalimpares++;
            }
        }

        pares = new int[totalpares];
        impares = new int[totalimpares];
        int j = 0;
        int k = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[j++] = numeros[i];
            } else {
                impares[k++] = numeros[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.println("pares[" + i + "] = " + impares[i]);
        }
    }
}
