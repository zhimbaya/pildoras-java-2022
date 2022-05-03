import java.util.Scanner;

public class _42_EjercicioCalcularElMenor2 {
    public static void main(String[] args) {
        //El desafío es buscar el número menor de mínimo 10 valores enteros.
        /*
        * Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
        * usando la clase Scanner ingresar la cantidad de números a comparar,
        * luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
        Calcular el menor número e imprimir el valor.
        Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir "
        * el numero menor es igual o mayor que 10!".*/

        int num;
        int min = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);

        try {
            //
            System.out.println("Ingrese la cantidad de números a comparar: ");
            int n = scan.nextInt();
            if (n < 10) {
                System.out.println("Error: Debe comparar al menos 10 números enteros!");
            } else {

                for (int i = 0; i < n; i++) {
                    System.out.println("Ingresar el " + (i + 1) + "º número.");
                    num = scan.nextInt();
                    min = (num < min) ? num : min;

                }
                System.out.println("El menor de los números es = " + min);

                if (min < 10) {
                    System.out.println("El número menor es menor que 10!");
                } else {
                    System.out.println("El número menor es igual o mayor que 10!");
                }
            }
        } catch (Exception e) {
            System.out.println("existe un error = " + e);
            main(args);
            System.exit(0);
        }
    }
}
