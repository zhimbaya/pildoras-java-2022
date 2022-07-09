import java.util.Locale;
import java.util.Scanner;

public class _09_ArrayBuscarNombre {
    public static void main(String[] args) {
        String[] n = new String[4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.print("Ingrese un nombre: ");
            n[i] = s.next();
        }
        System.out.println("Ingrese un nombre a buscar");
        String nom = s.next();
        int i = 0;
        while (i < n.length && !n[i].equalsIgnoreCase(nom)) {
            i++;
        }

        if (i == n.length) {
            System.out.println("Nombre NO encontrado "+ n.length);
        }else if (n[i].toLowerCase().compareTo(nom.toLowerCase()) == 0){
            System.out.println("Encontrado en la posición: "+ i);
        }
    }
}
