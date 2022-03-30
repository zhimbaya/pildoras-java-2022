import java.util.Scanner;

public class _28_OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si se cumple VERDADERO : si no secumple FALSO

        String variable = 7 == 7 ? "Sí es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas entre 2 y 7:");
        matematicas = scanner.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2 y 7:");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2 y 7:");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;

        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        /*
        if (promedio >= 5.49) {
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        }

         */

    }
}
