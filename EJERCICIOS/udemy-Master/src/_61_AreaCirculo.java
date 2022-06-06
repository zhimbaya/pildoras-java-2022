import java.util.Scanner;

public class _61_AreaCirculo {
    public static void main(String[] args) {
        //Calcular el área de un circulo
        //Pedir el radio de un círculo y calcular su área. utilizar la formula:
        //area = PI*r² (Constante PI multiplicado por el radio al cuadrado).

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introducir el radio del círculo");
            double r = scanner.nextDouble();
            double area = Math.PI * Math.pow(r,2);
            System.out.printf("El área del círculo es = %.2f ", area);

        }catch (Exception e){
            System.err.println("Se ha producido un error = " + e);
            main(args);
            System.exit(0);
        }
    }
}
