public class _40_SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + " j = " + j + "] ");
            }
        }
        System.out.println("\n===================== ");
        bucle2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break bucle2;
                }
                System.out.print("[i = " + i + " j = " + j + "] ");
            }
        }
        System.out.println("\n===================== ");

        int i = 0;
        bucle3:
        while (i < 5) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break bucle3;
                }
                System.out.print("[i = " + i + " j = " + j + "] ");
            }
            i++;
        }
        System.out.println("\n===================== ");
        bucle4:
        for (int d = 1; d <= 7; d++) {
            int h = 1;
            while (h <=8 ) {
                if (d == 6 || d == 7) {
                    System.out.println("Día " + d + " :descanso de fin de semana!");
                    continue bucle4;
                }
                System.out.println("Día " + d + " , trabajando a las " + h + "hrs.");
                h++;
            }
        }

    }
}
