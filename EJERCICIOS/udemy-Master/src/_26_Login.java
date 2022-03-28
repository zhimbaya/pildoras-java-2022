import java.util.Scanner;

public class _26_Login {
    public static void main(String[] args) {
        String username = "diego";
        String password = "12345";
        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.nextLine();

        System.out.println("Ingrese el password");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        if ((username.equalsIgnoreCase(u) && password.equalsIgnoreCase(p)) || (username2.equalsIgnoreCase(u) && password2.equalsIgnoreCase(p))) {
            esAutenticado = true;

        }else{
            System.out.println("username o password es incorrecto");
        }
        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Lo siento, requiere autenticación");
        }
        //main(arg);
        System.exit(0);
    }
}
