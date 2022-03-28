import javax.swing.*;

public class _20_Operadores {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("(i + j) = " +  (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));
        
        int multi = i * j;
        System.out.println("multi = " + multi);
        
        int divi = i / j;
        System.out.println("divi = " + divi);
        
        double div = (double) i / j;
        System.out.println("div = " + div);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (num % 2 == 0) {
            System.out.println("Es par");
        }else{
            System.out.println("Es Impar");
        }
    }
}
