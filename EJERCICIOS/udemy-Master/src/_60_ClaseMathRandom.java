import java.util.Random;

public class _60_ClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo","rojo","verde","blanco","negro"};
        double random =  Math.random();
        System.out.println("random = " + random);
        
        random *= colores.length;
        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("colores = " + colores[(int)random]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(10);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}