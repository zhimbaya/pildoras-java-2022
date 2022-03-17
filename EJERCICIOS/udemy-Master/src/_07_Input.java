import javax.swing.*;

public class _07_Input {
    public static void main(String[] args) {

        String numStr = JOptionPane.showInputDialog(null, "Ingrese un número");

        int numDecimal = 0;
        try {
            numDecimal = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
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

        String mensaje = Integer.toBinaryString(numDecimal);
        mensaje += "\n" + Integer.toOctalString(numDecimal);
        mensaje += "\n" + Integer.toHexString(numDecimal);

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
