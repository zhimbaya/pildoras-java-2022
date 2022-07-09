public class _02_EjemploArraysBurbujaClase {
    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if ( ((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) < 0 ) {
                    Object auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64gb", "Samsung galaxy", "Disco duro ssd", "Asus Notebook", "Macbook air"};
        int total = productos.length;

        sortBurbuja(productos);
        //Collections.reverse(Arrays.asList(productos));
        for (int i = 0; i < total; i++) {
            System.out.println("productos[" + i + "] = " + productos[i]);
        }

    }
}
