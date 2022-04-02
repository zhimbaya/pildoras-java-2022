import java.util.Scanner;

public class _29_OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n1 = s.nextInt();

        System.out.println("Ingrese segundo número: ");
        int n2 = s.nextInt();

        System.out.println("Ingrese tercer número: ");
        int n3 = s.nextInt();

        max = (n1 > n2) ? n1 : n2;
        max = (max > n3) ? max : n3;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("El mayor número es = " + max);


    }
}
