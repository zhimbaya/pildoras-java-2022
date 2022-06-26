import java.util.Arrays;

public class _01_EjemploArraysFor {
    public static void main(String[] args) {

        String[] productos = new String[5];
        int total = productos.length;

        productos[0] = "kingston pendrive 64gb";
        productos[1] = "Samsung galaxy";
        productos[2] = "Disco duro ssd";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";

        Arrays.sort(productos);

        for (int i = 0; i < total; i++) {
            System.out.println("productos[i] = " + productos[i]);
        }

        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }
        int i = 0;
        while (i < total) {
            System.out.println("productos [" + i + "] = " + productos[i]);
            i++;
        }
        int j = 0;

        do {
            System.out.println("productos [" + j + "] = " + productos[j]);
            j++;
        } while (j < total);

        int[] numeros = new int[10];
        System.out.println("==== CON FOR ====");
        for (int k = 0; k < numeros.length; k++) {
            numeros[k] = k * 3;
        }
        for (int k = 0; k < numeros.length; k++) {
            System.out.println("numeros " + i + " = " + numeros[k]);
        }

        System.out.println("==== CON FOR INVERSO ====");

        for (int k = numeros.length - 1; k >= 0; k--) {
            System.out.println("numeros = " + numeros[k]);
        }
        for (int k = 0; k < total; k++) {
            System.out.println("productos = " + (total - 1 - k) + " " + productos[(total - 1) - k]);
        }

    }
}
