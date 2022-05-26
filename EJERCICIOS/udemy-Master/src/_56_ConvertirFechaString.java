import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _56_ConvertirFechaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con el formato yyyy-mm-dd:");
        try {
            Date fecha = formato.parse(scanner.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("fecha = " + formato.format(fecha));

            Date fecha2 = new Date();
            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es después actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es anterior que actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha del usuario es igual que actual");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario es después actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha del usuario es anterior que actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha del usuario es igual que actual");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
