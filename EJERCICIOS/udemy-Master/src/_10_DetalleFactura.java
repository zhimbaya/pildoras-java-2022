import java.util.Locale;
import java.util.Scanner;

public class _10_DetalleFactura {
    public static void main(String[] args) {

        Double sumaFactura = 0.0;
        Double impuestoFactura = 0.0;
        Double totalFactura = 0.0;

        System.out.println("Introducir el nombre de Factura");
        Scanner scanner = new Scanner(System.in);
        String nombreFactura = scanner.nextLine().toUpperCase();

        Scanner precio1;
        Scanner precio2;

        try {
            System.out.println("Introducir el primer precio");
            precio1 = new Scanner(System.in);
            Double precio1Double = precio1.nextDouble();

            System.out.println("Introducir el segundo precio");
            precio2 = new Scanner(System.in);
            Double precio2Double = precio2.nextDouble();

            if (precio1Double <= 0 || precio2Double <=0) {
                System.out.println("No se aceptan números negativos");
                main(args);
            }else{
            sumaFactura = precio1Double + precio2Double;
            impuestoFactura = sumaFactura * 0.19D;
            totalFactura += sumaFactura + impuestoFactura;

            System.out.println("La factura------* " + nombreFactura);
            System.out.println("Importe bruto...$ " + sumaFactura);
            System.out.println("Impuesto........$ " + impuestoFactura);
            System.out.println("El total--------$ " + totalFactura);
            }
        } catch (Exception e) {
            System.out.println("Introducir un número, OK");
            main(args);
            System.exit(0);
        }
    }
}
