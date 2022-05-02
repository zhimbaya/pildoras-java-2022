public class _40_SentenciaForeach {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 5, 6, 7, 12, 45};
        for (int num : numeros) {
            System.out.println("num = " + num);

        }

        String[] nombres = {"Diego", "David", "Juan", "Sonia", "Maria", "Pepe", "Pepa"};
        for (String nombre: nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}
