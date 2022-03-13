public class _05_Caracteres {
    public static void main(String[] args) {
        //forma unicode
        char letra = '\u0040';
        System.out.println("letra = " + letra);
        System.out.println(Character.BYTES);
        System.out.println(Character.SIZE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

        char decimal = 64;
        System.out.println("decimal = " + decimal);

        String parrafo = "hola mundo";
        System.out.println("parrafo = " + parrafo);

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println(System.lineSeparator() + "hola");

        //booleanos
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);


    }
}
