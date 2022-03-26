import java.util.Locale;

public class _15_StringValidad {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        if (esNulo == false) {
            System.out.println(curso.toUpperCase()); // salta la excepción.
        }
        //System.out.println("Bienvenidos al curso: ".concat(curso)); // salta la exception, no se puede concatenar un String nulo.
        System.out.println("Bienvenidos al curso: "+ curso); //se ejecuta pero aparece NULL.
        if (esNulo){
            curso = " ";
        }
        System.out.println("Bienvenido al curso ".concat(curso));

        boolean esVacio = curso.length() == 0;
        if (!esVacio){
            System.out.println("Bienvenido al curso... ".concat(curso));
        }

        boolean esVacio2 = curso.isEmpty();
        System.out.println(esVacio2);
        if (!esVacio2) {
            System.out.println(curso.toUpperCase()); // salta la excepción.
            System.out.println("Bienvenido al curso... ".concat(curso));
        }

        //es mejor y mas estricta para validar. //JDK 11
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
    }
}
