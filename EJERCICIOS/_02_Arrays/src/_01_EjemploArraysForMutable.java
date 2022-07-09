import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_EjemploArraysForMutable {
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64gb","Samsung galaxy", "Disco duro ssd","Asus Notebook","Macbook air"};
        int total = productos.length;

        Arrays.sort(productos);
        int total2 = productos.length;

        for (int i = 0; i < total2; i++) { //total/2 -> hasta el punto medio.
            String actual = productos[i];
            String inverso = productos[total - 1 - i];
            productos[total - 1 - i] = actual;
            productos[i] = inverso;
            total2--;
        }
        //Collections.reverse(Arrays.asList(productos));
        for (int i = 0; i < total; i++) {
            System.out.println("productos[" + i + "] = " + productos[i]);
        }

    }
}
