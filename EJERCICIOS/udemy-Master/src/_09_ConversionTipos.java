public class _09_ConversionTipos {
    public static void main(String[] args) {

        //Conversión a Entero.
        String numStr = "50";
        int numInt = Integer.parseInt(numStr);
        System.out.println("numInt = " + numInt);

        String realStr ="98765.43e-3";
        double realDou = Double.parseDouble(realStr);
        System.out.println("realDou = " + realDou);

        String numboo = "true";
        boolean realBoo = Boolean.parseBoolean(numboo);
        System.out.println("realBoo = " + realBoo);

        //Conversión a String
        int otroNumInt = 100;
        System.out.println("otroNumInt = " + otroNumInt);
        
        String otroNumStr = Integer.toString(otroNumInt);
        System.out.println("otroNumStr = " + otroNumStr);
        //suma
        otroNumStr = String.valueOf(otroNumInt+10);
        //concatena
        otroNumStr = String.valueOf(otroNumStr+10);
        System.out.println("otroNumStr = " + otroNumStr);
        
        double  otroRealDou = 1.2345e2;
        String otroRealStr = Double.toString(otroRealDou);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.2345e2f);
        //otroRealStr = String.valueOf(otroRealDou);
        System.out.println("otroRealStr = " + otroRealStr);
        
        //Casting
        int i = 10000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char c = (char) i;
        System.out.println("c = " + c);
        long g = (long) i;
        System.out.println("g = " + g);


    }
}
