public class _60_ClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 2.4);
        System.out.println("max = " + max);
        
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(4.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(4.6);
        System.out.println("piso = " + piso);

        double entero = Math.round(4.6);
        System.out.println("entero = " + entero);

        double pi = Math.PI;
        System.out.println("pi = " + pi);
        
        double ex = Math.exp(1);
        System.out.println("ex = " + ex);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double pow = Math.pow(10,3);
        System.out.println("pow = " + pow);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);
        
        double grados = Math.toDegrees(1.57);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(grados);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90) ="+ Math.sin(90.00));
        System.out.println("cos(90) ="+ Math.cos(90.00));

        radianes = Math.toRadians(180.0);
        System.out.println("radianes = " + Math.cos(radianes));



    }

}
