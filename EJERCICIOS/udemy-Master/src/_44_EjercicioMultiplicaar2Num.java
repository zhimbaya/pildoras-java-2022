import java.util.Scanner;

public class _44_EjercicioMultiplicaar2Num {
    public static void main(String[] args) {
        /*
         * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
         * pero sin usar el símbolo de multiplicación (*).
         * Puede utilizar una sentencia for para realizar la multiplicación y
         * tener en cuenta los unarios, donde menos por menos es positivo.
         * */
        try {
            System.out.println("Introducir el 1er número: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println("Introducir el 2do número: ");
            int m = scanner.nextInt();
            int resultado = 0;
            if (n <= 0 && m >= 0) {
                for (int i = 0; i < m; i++) {
                    resultado += n;
                }
            } else {
                m = -m;
                for (int i = 0; i < m; i++) {
                    resultado += -n;
                }
            }
            System.out.println("La multiplicación de " + n + " * " + m + " = " + resultado);
        } catch (Exception e) {
            System.out.println("Error del tipo " + e);
            main(args);
            System.exit(0);
        }
    }
}
