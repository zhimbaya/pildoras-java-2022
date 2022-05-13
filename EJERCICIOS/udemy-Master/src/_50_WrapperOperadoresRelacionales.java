public class _50_WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        //127 compara como primitivo = valor

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? " + (num1 == num2)); //LA MISMA INSTANCIA

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? " + (num1 == num2)); //VA SER TRUE SOLO EN PRIMITIVOS QUE COMPARA VALORES Y NO INSTANCIAS

        System.out.println("Son el mismo objeto? " + (num1.equals(num2)));
        System.out.println("Son el mismo objeto? " + (num1.intValue() == num2.intValue()));

        num2 = 2000;
        boolean condicion = num1 > num2; //hace auto unboxing
        System.out.println(condicion);
        boolean condicion2 = num1.intValue() < num2.intValue(); //forma explicita
        System.out.println(condicion2);
    }
}
