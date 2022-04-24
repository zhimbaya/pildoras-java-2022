import java.util.Scanner;

public class _34_EjercicioGasolinera {
    /*
    * Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un
    * programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
        La medida o capacidad actual del estanque puede ser en tipo double, para una mejor
        precisión, pero tambien puede ser del tipo int.
        Si la capacidad actual es 70 litros: imprimir Estanque lleno
        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        Si está entre 40 y menor a 60: imprimir Estanque  3/4
        Si está entre 35 y menor a 40: imprimir Medio Estanque
        Si está entre 20 y menor a 35: imprimir Suficiente
        Si está entre 1 y menor a 20: imprimir Insuficiente
    * */
    public static void main(String[] args) {
        Scanner scanner;
        Double litros;
        try {
            System.out.println("Introducir los litros: ");
            scanner = new Scanner(System.in);
            litros = scanner.nextDouble();
            if (litros > 70D) {
                System.out.println("Esos litros sobrepasan la capacidad.");
            } else if (litros == 70D) {
                System.out.println("Estanque lleno");
            } else if (litros >= 60D && litros < 70D) {
                System.out.println("Estanque casi lleno");
            } else if (litros >= 40D && litros < 60D) {
                System.out.println("Estanque  3/4");
            } else if (litros >= 35D && litros < 40D) {
                System.out.println("Medio Estanque");
            } else if (litros >= 20D && litros < 35D) {
                System.out.println("Suficiente");
            } else if (litros >= 1D && litros < 20D) {
                System.out.println("Insuficiente");
            } else {
                System.out.println("Introducir los litro adecuados");
            }
        } catch (Exception e) {
            System.out.println("Error al introducir el número");
            main(args);
            System.exit(0);
        }
    }
}
