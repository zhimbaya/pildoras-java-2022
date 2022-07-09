import java.util.Scanner;

public class _08_ArrayNotasAlumnos {
    public static void main(String[] args) {
        double[] matematicas, historia, lenguaje;

        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;

        matematicas = new double[7];
        historia = new double[7];
        lenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar 7 notas para matemáticas");
        for (int i = 0; i < matematicas.length; i++) {
            matematicas[i] = s.nextDouble();
        }
        System.out.println("Ingresar 7 notas para historia");
        for (int i = 0; i < historia.length; i++) {
            historia[i] = s.nextDouble();
        }
        System.out.println("Ingresar 7 notas para lenguaje");
        for (int i = 0; i < lenguaje.length; i++) {
            lenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += matematicas[i];
            sumNotasHistoria += historia[i];
            sumNotasLenguaje += lenguaje[i];
        }

        double mediaMatematicas = sumNotasMatematicas / matematicas.length;
        double mediaHistoria = sumNotasHistoria / historia.length;
        double mediaLenguaje = sumNotasLenguaje / lenguaje.length;

        System.out.println("Media de Matemáticas: " + mediaMatematicas);
        System.out.println("Media de Historia: " + mediaHistoria);
        System.out.println("Media de Lenguaje: " + mediaLenguaje);
        System.out.println("Media de Curso: " + (mediaHistoria + mediaLenguaje + mediaMatematicas) / 3);

        System.out.println("Ingrese el ID del alumno (0 - 6): ");
        int id = s.nextInt();
        double mediaAlumno = (matematicas[id] + historia[id] + lenguaje[id]) / 3;
        System.out.println("Media del Alumno " + id + " : " + mediaAlumno);

    }
}
