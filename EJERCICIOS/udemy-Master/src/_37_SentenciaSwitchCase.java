public class _37_SentenciaSwitchCase {
    public static void main(String[] args) {
        int num = 3;
        switch (num){
            case 0:
                System.out.println("El num es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break;
            case 2:
                System.out.println("El num es dos");
                break;
            case 3:
                System.out.println("El num es tres");
                break;
            default:
                System.out.println("Número desconocido");
        }

        String nombre = "diego";
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "diego":
            case "pepe":
                System.out.println("Hola " + nombre);
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
