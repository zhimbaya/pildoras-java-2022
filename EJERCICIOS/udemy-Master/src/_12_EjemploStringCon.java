public class _12_EjemploStringCon {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Diego Simbaña";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int num1 = 5;
        int num2 = 6;

        //precedencia de operadores
        System.out.println(detalle + num1 + num2);
        System.out.println(detalle + (num1 + num2));
        System.out.println(num1 + num2 + detalle);


        //String detalle2 = curso.concat(profesor);
        //String detalle2 = curso.concat(" ".concat(profesor));
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println(detalle2);
    }
}
