import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class _10_DetalleFactura_2 {
    public static void main(String[] args) {

        Double sumaFactura = 0.0;
        Double impuestoFactura = 0.0;
        Double totalFactura = 0.0;
        Scanner precio1;

        System.out.println("Introducir el nombre de Factura");
        Scanner scanner = new Scanner(System.in);
        String nombreFactura = scanner.nextLine().toUpperCase();

        try {
            //MEJORA CON UN FOR
            int num = 2;
            Double precio1Double = 0.0;

            for (int i = 1; i <= 2; i++) {
                System.out.println("Introducir el precio " + i);
                precio1 = new Scanner(System.in);
                precio1Double = precio1.nextDouble();
                if (precio1Double < 0) {
                    System.out.println("Solo números positivos.");
                }else {
                    sumaFactura += precio1Double;
                }
            }
            impuestoFactura = sumaFactura * 0.19D;
            totalFactura += sumaFactura + impuestoFactura;
            //MEJORA CON UN SOLO OUTPUT
            String imprimir = "-----------------------\n"
                    + LocalDateTime.now() + "\n"
                    + "-----------------------\n"
                    + "La factura------* " + nombreFactura + "\n"
                    + "Importe bruto...$ " + sumaFactura + "\n"
                    + "Impuesto........$ " + impuestoFactura + "\n"
                    + "El total--------$ " + totalFactura;
            System.out.println(imprimir);

        } catch (Exception e) {
            System.out.println("Introducir un número, OK");
            main(args);
            System.exit(0);
        }
    }
}
