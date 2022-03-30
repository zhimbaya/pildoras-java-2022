import java.util.Scanner;

public class _27_LoginMatrix {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "diego";
        passwords[0] = "12345";
        usernames[1] = "admin";
        passwords[1] = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.nextLine();

        System.out.println("Ingrese el password");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {

            if ((usernames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(p))) {
                esAutenticado = true;
                break;
            }

        }
        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("username o password es incorrecto");
            System.out.println("Lo siento, requiere autenticación");
        }
        //main(arg);
        System.exit(0);
    }
}
