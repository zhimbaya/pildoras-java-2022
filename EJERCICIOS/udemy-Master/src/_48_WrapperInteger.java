public class _48_WrapperInteger {
    public static void main(String[] args) {
        // deprecated
        //Integer intObjeto = new Integer();

        //FORMA EXPLICITA = BOXING
        Integer intObjeto = Integer.valueOf(32768);
        System.out.println("intObjeto = " + intObjeto);
        //IMPLICITA = AUTOBOXING
        Integer intObjeto2 = 32768;

        //explicita
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);
        //implicita
        int num = intObjeto;
        System.out.println("num = " + num);
        
        String valor = "76000";
        Integer valorObjeto = Integer.valueOf(valor);
        System.out.println("valorObjeto = " + valorObjeto);
        
        Short shortObjeto = intObjeto.shortValue(); //NO DA ERROR PERO HAY UNA PERDIDA DE INFORMACIÓN
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto); // HAY PERDIDA DE INFORMACIÓN

        //devuelve un primitivo  a partir de un String
        int primitivo = Integer.parseInt(valor);

    }
}
