public class _18_StringMetodosArreglos {
    public static void main(String[] args) {
        

        String trabalenguas = "trabalenguas";
        //imprime la longitud
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        //NO puede imprimir caracter por caracter
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        //Se necesita un for
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo["+i+"] = " + arreglo[i]);
        }
        //Se necesita de un for y arreglo
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String [] arreglo2 = trabalenguas.split("a");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("arreglo2[i] = " + arreglo2[i]);
        }
        String archivo = "algún.archivo.jpeg";

        //para un grupo de caracteres o un caracter literal
        String [] arreglo3 = archivo.split("[.a]"); // \\.
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.println(arreglo3[i]);
        }
        System.out.println(arreglo3[arreglo3.length-1]);

    }
}
