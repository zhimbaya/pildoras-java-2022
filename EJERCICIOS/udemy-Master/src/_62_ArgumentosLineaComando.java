public class _62_ArgumentosLineaComando {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Debes introducir un argumento");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos = " + i + " : " + args[i]);
        }

    }
}
