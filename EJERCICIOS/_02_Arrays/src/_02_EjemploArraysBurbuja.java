public class _02_EjemploArraysBurbuja {
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64gb", "Samsung galaxy", "Disco duro ssd", "Asus Notebook", "Macbook air"};
        int total = productos.length;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
            }
        }

        //Collections.reverse(Arrays.asList(productos));
        for (int i = 0; i < total; i++) {
            System.out.println("productos[" + i + "] = " + productos[i]);
        }

    }
}
