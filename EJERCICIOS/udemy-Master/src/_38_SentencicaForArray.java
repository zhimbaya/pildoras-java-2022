import javax.swing.*;
import java.util.Locale;

public class _38_SentencicaForArray {
    public static void main(String[] args) {

        String[] nombres = {"Diego", "David", "Juan", "Sonia", "Maria", "Pepe", "Pepa"};

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].toLowerCase().contains("DIEGO".toLowerCase()) || nombres[i].equalsIgnoreCase("pepa")) {
                continue;
            }
            System.out.println(i + " .- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo pepe o maria");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null, "no existe en el sistema");
        }

    }
}
