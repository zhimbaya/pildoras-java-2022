public class _03_Hola {
    public static void main(String[] args) {
        //agregar el idioma en NATURAL LENGUAGES
        String saludar = "HOla mundo desde java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase: " + saludar.toUpperCase());

        int num = 10;
        boolean valor = true;
        int num2 = 5;
        if (valor) {
            System.out.println("numero: " + num);
            num2 = 10;
        }
        System.out.println("numero 2 = " + num2);

        //con las nuevas versiones de java.
        var num3 = 15;

        String nombre = "Randy";
        if (num > 15) {
            System.out.println("Diego");
        }
        System.out.println(nombre);
        //comentario en linea
        /* comentario en bloque
         *
         * */

    }
}
