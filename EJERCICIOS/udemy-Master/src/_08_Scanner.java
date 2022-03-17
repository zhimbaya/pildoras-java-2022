import java.util.InputMismatchException;
import java.util.Scanner;

public class _08_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        // lo comentamos porque lo captura directamente
        //String numStr = scanner.nextLine();

        int numDecimal = 0;
        try {
            numDecimal = scanner.nextInt(); //Integer.parseInt(numStr);

            //el tipo de error cambia
        } catch (InputMismatchException e) {
            System.out.println("Error deber ingresar un número entero:");
            //vuelve a llamar de forma recursiva pasando los argumentos de MAIN
            main(args);
            //sale del código
            System.exit(0);
        }

        System.out.println("numDecimal = " + numDecimal);
        System.out.println(Integer.toBinaryString(numDecimal));

        int numBinario = 0B111110100;
        System.out.println("numBinario = " + numBinario);
        System.out.println(Integer.toOctalString(numDecimal));

        int numOctal = 0764;
        System.out.println("numOctal = " + numOctal);
        System.out.println(Integer.toHexString(numDecimal));

        int numHex = 0x1f4;
        System.out.println("numHex = " + numHex);

        System.out.println("Resultado: \n");
        String mensaje = Integer.toBinaryString(numDecimal);
        mensaje += "\n" + Integer.toOctalString(numDecimal);
        mensaje += "\n" + Integer.toHexString(numDecimal);

        System.out.println(mensaje);

    }
}
