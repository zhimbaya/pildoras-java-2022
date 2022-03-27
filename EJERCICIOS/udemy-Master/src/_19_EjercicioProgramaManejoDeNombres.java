import java.util.Locale;
import java.util.Scanner;

public class _19_EjercicioProgramaManejoDeNombres {
    public static void main(String[] args) {
        /*
        VLa tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

        Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como
        argumentos de línea de comandos.
        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero
        convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
        * Por ejemplo para Andres debe quedar como N.es
        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
        N.es_A.ia_E.pe
        * */

        Scanner scanner;
        String nombre;
        String resultado = "";
        String total = "";
        try {

            System.out.println("Introducir 3 nombres de amigos o familiares:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Introduce el " + (i+1) + "º nombre: ");
                scanner = new Scanner(System.in);
                nombre = scanner.nextLine();
                String sinEspacios = nombre.trim();

                String[] palabras = sinEspacios.split("");
                String letra = palabras[1];
                String letraMay = letra.toUpperCase();
                String letraUltima = sinEspacios.substring(sinEspacios.length() - 2);
                resultado += letraMay + "." + letraUltima.concat("_");

                total = resultado.substring(0, resultado.length() - 1);
            }
            System.out.println(total);

        } catch (Exception e) {
            System.out.println("Debe introducir algún dato.");
            main(args);
            System.exit(0);
        }

    }
}
