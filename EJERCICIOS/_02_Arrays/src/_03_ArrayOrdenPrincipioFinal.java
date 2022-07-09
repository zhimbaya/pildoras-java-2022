public class _03_ArrayOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int longitud = numeros.length;
        int[] a = new int[10];

        for (int i = 0; i < longitud; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < longitud - i; i++) {
            System.out.print(numeros[i] + " "); //DESDE ARRIBA
            System.out.println(numeros[longitud - 1 - i]); //DESDE ABAJO
        }

        int aux = 0;
        for (int i = 0; i < longitud - i; i++) {
            a[aux++] = numeros[i]; //POSICION 0
            a[aux++] = numeros[longitud - 1 - i]; //POSICION 1
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }


    }
}
