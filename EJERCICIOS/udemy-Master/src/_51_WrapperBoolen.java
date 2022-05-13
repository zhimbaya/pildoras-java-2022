public class _51_WrapperBoolen {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean2 = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean == objBoolean2 = " + (objBoolean == objBoolean2)); //COMPARA POR VALOR
        System.out.println("objBoolean == objBoolean2 = " + (objBoolean.equals(objBoolean2)));
        System.out.println("objBoolean == objBoolean2 = " + (objBoolean2 == objBoolean3));
        System.out.println("objBoolean == objBoolean2 = " + (objBoolean == objBoolean3));

        boolean primiBoolean2 = objBoolean2.booleanValue();
        System.out.println("primiBoolean2 = " + primiBoolean2);
    }
}
