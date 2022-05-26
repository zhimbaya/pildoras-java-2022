import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _57_EjercicioCalcularEdad {
    public static void main(String[] args) {
        //Calcular edad ingresando la fecha de nacimiento de una persona.
        /*
        Para esta tarea se pide ingresar una fecha de nacimiento en
        formato string, convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
        Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante,
        también se pueden apoyar de google que hay varios ejemplos.
         */

        System.out.println("Ingresar una fecha de Nacimiento:");
        Scanner scanner = new Scanner(System.in);
        String fechaString = scanner.nextLine();

        Date fechaObj = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fechaDate = formato.parse(fechaString);
            System.out.println(formato.format(fechaDate));
            long edad = (fechaObj.getTime() - fechaDate.getTime()) / 1000 / 60 / 60 / 24;
            int anos = Double.valueOf(edad / 365.25d).intValue();
            System.out.println(anos);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
