import java.lang.reflect.Array;
import java.util.Arrays;

public class _01_EjemploArrays {
    public static void main(String[] args) {
        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 3L;
        numeros[3] = 7;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        String[] productos = new String[5];
        productos[0] = "Kingston pendrive 64gb";
        productos[1] = "Samsung galaxy";
        productos[2] = "Disco duro ssd";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";

        Arrays.sort(productos);
        String prod1 = productos[0];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);

    }
}
