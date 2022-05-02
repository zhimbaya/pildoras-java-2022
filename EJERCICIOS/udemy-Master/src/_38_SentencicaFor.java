public class _38_SentencicaFor {
    public static void main(String[] args) {
        //lo ideal
        for (int i = 0; i < 5; i++) {
            System.out.println("i : " + i);
        }

        //se puede hacer esto
        int j = 0;
        for (; ; ) {
            if (j < 5) {
                break;
            }
            j++;
            System.out.println("j = " + j);
        }

        for (int i = 0; i <= 10; i++) {
            if (!(i % 2 == 0)) {
                continue;
            }
            System.out.println("i == " + i);
        }
    }
}
