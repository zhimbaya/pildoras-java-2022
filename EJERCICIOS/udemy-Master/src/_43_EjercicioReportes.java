import java.util.Locale;
import java.util.Scanner;

public class _43_EjercicioReportes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado = 0, mediaCinco = 0, mediaCuatro = 0, sumaTotal = 0;
        int contadorUno = 0, contadorCinco = 0, contadorCuatro = 0;
        try {
            //Crear un sistema de reportes de notas de los alumnos
            /*
            Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en
            las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas
            inferiores a 4 y la cantidad de notas 1, además mostrar el promedio total.
            Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a
            una para realizar los cálculos (contadores, sumas).
            Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar
            un mensaje de error finalizando el programa.
             */
            System.out.println("NÚMERO DE NOTAS A INGRESAR (MÍNIMO 20)");
            int nNotas = scan.nextInt();
            if (nNotas < 20) {
                System.out.println("Tienes que ingresar 20 notas y no " + nNotas);
            } else {
                for (int i = 0; i < nNotas; i++) {
                    System.out.println("Introduce el " + (i + 1) + "º valor o nota.");
                    double nValor = scan.nextDouble();
                    if (nValor == 0) {
                        System.out.println("PROGRAMA FINALIZADO");
                        System.exit(0);
                    } else if (nValor >= 1 && nValor <= 7) {
                        if (nValor >= 5) {
                            mediaCinco += nValor;
                            contadorCinco += 1;
                        } else if (nValor > 1 && nValor < 5) {
                            mediaCuatro += nValor;
                            contadorCuatro += 1;
                        } else {
                            contadorUno += 1;
                        }
                        sumaTotal += nValor;
                    } else {
                        System.out.println("Dato incorrecto!".toUpperCase());
                    }
                }
                resultado = mediaCinco / contadorCinco;
                System.out.println("La media de notas mayor a 5 es : " + resultado);
                resultado = mediaCuatro / contadorCuatro;
                System.out.println("La media de notas menores que 4 es : " + resultado);
                System.out.println("Número de notas 1 = " + contadorUno);
                resultado = sumaTotal / nNotas;
                System.out.println("Promedio Total : " + resultado);
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
            main(args);
            System.exit(0);
        }
    }
}
