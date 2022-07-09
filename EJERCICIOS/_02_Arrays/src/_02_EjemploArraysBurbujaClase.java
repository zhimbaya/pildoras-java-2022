public class _02_EjemploArraysBurbujaClase {
    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if ( ((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) < 0 ) { //CAMBIANDO EL SIGNO LO ORDENAMOS DE FORMA DESCENDENTE
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

        Integer[] numeros = new Integer[4];
        int total2 = numeros.length;

        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 3L;
        numeros[3] = 7;

        sortBurbuja(numeros);

        for (int i = 0; i < total2; i++) {
            System.out.println("números[" + i + "] = " + numeros[i]);
        }

    }
}
