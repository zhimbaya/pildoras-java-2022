public class _04_Primitivos {
    static float numFloat2;
    public static void main(String[] args) {
        //PRIMITIVOS
        byte numByte = 127;
        System.out.println("numByte = " + numByte);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short numShort = 32767;
        System.out.println("numShort = " + numShort);
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        int numInt = 2147483647;
        System.out.println("numInt = " + numInt);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        long numLog = 9223372036854775807L;
        System.out.println("numLog = " + numLog);
        System.out.println(Long.BYTES);
        System.out.println(Long.SIZE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        Double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println(Double.BYTES);
        System.out.println(Double.SIZE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        
        var numVar = 34323423423L;
        System.out.println("numVar = " + numVar);

        //VALOR POR DEFECTO DE UN PRIMITIVO.
        //TIENE QUE SE STATIC Y SER UN ATRIBUTO DE LA CLASE.
        System.out.println("numFloat = " + numFloat2);
    }
}
