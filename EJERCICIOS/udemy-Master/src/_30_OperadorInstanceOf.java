public class _30_OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String ... que tal!";
        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("Es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("b1 = " + b1);

        b1 = num instanceof Number; //Number Boolean Short
        System.out.println("b1 = " + b1);


    }
}
