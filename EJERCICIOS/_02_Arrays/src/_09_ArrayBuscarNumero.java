import java.util.Scanner;

public class _09_ArrayBuscarNumero {
    public static void main(String[] args) {
        int[] n = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.print("Ingrese un numero: ");
            n[i] = s.nextInt();
        }
        System.out.println("Ingrese un número a buscar");
        int num = s.nextInt();
        int i = 0;
        while (i < n.length && n[i] != num) {
            i++;
        }

        if (i == n.length) {
            System.out.println("Número NO encontrado "+ n.length);
        }else if (n[i] == num){
            System.out.println("Encontrado en la posición: "+ i);
        }
    }
}
