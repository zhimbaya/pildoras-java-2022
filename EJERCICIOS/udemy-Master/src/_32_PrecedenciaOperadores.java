public class _32_PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        System.out.println("OPERADORES DE ASIGNACION");

        System.out.println("++ -- + - !");
        System.out.println(" () ");
        System.out.println(" */% ");
        System.out.println(" +- ");
        System.out.println(" > >= < <= instance of ");
        System.out.println(" == != ");
        System.out.println(" && ");
        System.out.println(" || ");
        System.out.println(" ()?: ");
        System.out.println(" = += -= *= /= %= ");
        System.out.println("");

        double promedio = i + j + k / 3d;
        System.out.println("promedio = " + promedio);
        
        promedio = i + j + k / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10;
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        
    }
}
