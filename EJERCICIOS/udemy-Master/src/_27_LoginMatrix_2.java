import java.util.Scanner;

public class _27_LoginMatrix_2 {
    public static void main(String[] args) {

        String[] usernames = {"diego", "admin"};
        String[] passwords = {"12345", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.nextLine();

        System.out.println("Ingrese el password");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            /*
            if ((usernames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(p))) {
                esAutenticado = true;
                break;
            }
             */

            //CON TERNARIO
            esAutenticado = (usernames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(p)) ? true : esAutenticado;

        }
        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("username o password es incorrecto");
            System.out.println("Lo siento, requiere autenticación");
        }
        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") : "username o password es incorrecto. \n Lo siento, requiere autenticación";
        System.out.println("mensaje = " + mensaje);

        //main(arg);
        System.exit(0);
    }
}
