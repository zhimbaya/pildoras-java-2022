import javax.swing.*;

public class _35_EjercicioNombre {
    /*
    Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
    Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o
    amigos usando la clase JOptionPane y método showInputDialog().
    Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
    (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
    Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con
    el indice cero accedemos al nombre de la persona.
    Restricción no usar loops en el desarrollo de la tarea.
    Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
     */
    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;
        String[] arraynombre1, arraynombre2, arraynombre3;

        try {
            nombre1 = JOptionPane.showInputDialog("Introduce el nombre 1 y apellido ", "Diego Armando");
            nombre2 = JOptionPane.showInputDialog(null, "Introducir el nombre 2 y apellido");
            nombre3 = JOptionPane.showInputDialog(null, "Introducir el nombre 3 y apellido");
            
            arraynombre1 = nombre1.split(" ");
            arraynombre2 = nombre2.split(" ");
            arraynombre3 = nombre3.split(" ");

            if (arraynombre1[0].length() > arraynombre2[0].length() && arraynombre1[0].length() > arraynombre3[0].length()) {
                JOptionPane.showMessageDialog(null, nombre1.toUpperCase() + " tiene el nombre más largo.");
            } else if (arraynombre2[0].length() > arraynombre1[0].length() && arraynombre2[0].length() > arraynombre3[0].length()) {
                JOptionPane.showMessageDialog(null, nombre2.toUpperCase() + " tiene el nombre más largo.");
            } else {
                JOptionPane.showMessageDialog(null, nombre3.toUpperCase() + " tiene el nombre más largo.");
            }

        } catch (Exception e) {
            System.out.println("Error al introducir los nombres.");
            main(args);
            System.exit(0);
        }

    }
}
