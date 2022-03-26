public class _11_EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Hola Java");

        //compara si son el mismo objeto
        boolean esigual = curso == curso2;
        System.out.println("esigual = " + esigual);

        //comparar el valor
        esigual = curso.equals(curso2);
        System.out.println("esigual = " + esigual);
        
        String curso3 = "Programación Java";
        esigual = curso == curso3;
        System.out.println("esigual2 = " + esigual);

    }
}
