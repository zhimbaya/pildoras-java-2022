public class _53_PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        //siempre se pasa por valor
        //clases wrapper son inmutables INTEGER, FLOAT, STRING ..._53_PasarPorValor
        System.out.println("Iniciamos el main con i  = " + i);
        
        //invoca al metodo test
        test(i);
        System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = " + i);
    }

    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
