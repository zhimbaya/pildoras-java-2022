import java.util.Scanner;

public class _06_ArrayDetectarOrden {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar 5 enteros");
        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                descendente = true;
            }
            if (n[i] < n[i + 1]) {
                ascendente = true;
            }
        }

        if (descendente == true && ascendente == true) {
            System.out.println("Array desordenado");
        }
        if (descendente == false && ascendente == false) {
            System.out.println("Array todos son iguales");
        }
        if (descendente == true && ascendente == false) {
            System.out.println("Array descendente");
        }
        if (descendente == false && ascendente == true) {
            System.out.println("Array ascendente");
        }

    }
}
