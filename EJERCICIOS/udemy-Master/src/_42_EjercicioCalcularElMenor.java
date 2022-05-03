import java.io.Serializable;
import java.util.Scanner;

public class _42_EjercicioCalcularElMenor {
    public static void main(String[] args) {
        //El desafío es buscar el número menor de mínimo 10 valores enteros.
        int num = 0;
        int min = Integer.MAX_VALUE;
        try {
            //
            for (int i = 0; i < 2; i++) {
                System.out.println("Ingresar el " + (i + 1) + "º número.");
                Scanner scan = new Scanner(System.in);
                num = scan.nextInt();
                //if (num > mayor) mayor = num;
                min = (num < min) ? num : min;
            }
            System.out.println("El menor de los números es = " + min);
            
            //
            int[] numeros = {1, 2, 33, 4, 5, 6, 7, 8, 9, 10};
            for (int numero : numeros) {
                if (numero < min) {
                    min = numero;
                }
            }
            System.out.println("El menor del array es: " + min);
            
            //
            for (int i = 0; i < 4; i++) {
                System.out.println("Ingresar el " + (i + 1) + "º número.");
                Scanner scan = new Scanner(System.in);
                num = scan.nextInt();
                int[] arrayNums = new int[10];
                for (int j = 0; j < arrayNums.length; j++) {
                    arrayNums[j] = num;
                }
                for (int arrayNum : arrayNums) {
                    if (arrayNum < min) {
                        min = arrayNum;
                    }
                }
            }
            System.out.println("El menor de los números es = " + min);

        } catch (Exception e) {
            System.out.println("existe un error = " + e);
            main(args);
            System.exit(0);
        }


    }
}
