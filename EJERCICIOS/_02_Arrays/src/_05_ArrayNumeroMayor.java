import java.util.Scanner;

public class _05_ArrayNumeroMayor {
    public static void main(String[] args) {
        int[] a = new int[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar 5 números enteros");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("a[" + max + "] = " + a[max]);
    }
}
