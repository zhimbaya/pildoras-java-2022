public class _41_SentenciasBucleEtiquetaBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres toman trigo en un trigal";
        int max = frase.length();
        int contador = 0;
        char letra = 'g';
        for (int i = 0; i < max; i++) {
            if (frase.charAt(i) != letra) {
                continue;
            }
            contador++;
        }
        System.out.println("Se ha encontrado " + contador + " veces la letra " + letra);
        System.out.println("\n::::::::::::::::::::::::::::::");


        String travalengua = "trigo tres tristes tigres toman trigo en un trigaltrigo";
        String palabra = "trigo";
        int maxfrase2 = travalengua.length();
        int maxpalabra = palabra.length();
        int resultado = 0;

        bucle:
        for (int i = 0; i <= maxfrase2; i++) {
            int k = i;
            for (int j = 0; j < maxpalabra; j++) {
                if (travalengua.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue bucle;
                }
            }
            resultado++;
            i = i + maxpalabra;
        }
        System.out.println("Se ha encontrado " + resultado + " veces la palabra " + palabra);


    }
}
