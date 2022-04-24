import java.util.Scanner;

public class _33_EjercicioNumeros {
    public static void main(String[] args) {

        Scanner scanner;
        Integer n1,n2;

        try {
            scanner = new Scanner(System.in);
            System.out.println("---ORDENAR DE MAYOR A MENOR---");
            System.out.println("Introducir el primer número:");
            n1 = scanner.nextInt();
            System.out.println("Introducir el segundo número:");
            n2 = scanner.nextInt();

            System.out.println("Ordenado de mayor a menor");
            if (n1 > n2) System.out.println(n1 + " - " + n2);
            else System.out.println(n2 + " - " + n1);

        } catch (Exception e) {
            System.out.println("Error = " + e);
            main(args);
            System.exit(0);
        }

    }
}
