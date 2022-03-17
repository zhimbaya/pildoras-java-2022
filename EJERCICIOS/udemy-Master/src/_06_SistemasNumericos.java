public class _06_SistemasNumericos {
    public static void main(String[] args) {
        int numDecimal = 500;
        System.out.println("numDecimal = " + numDecimal);
        System.out.println(Integer.toBinaryString(numDecimal));

        int numBinario = 0B111110100;
        System.out.println("numBinario = " + numBinario);
        System.out.println(Integer.toOctalString(numDecimal));

        int numOctal = 0764;
        System.out.println("numOctal = " + numOctal);
        System.out.println(Integer.toHexString(numDecimal));
        
        int numHex = 0x1f4;
        System.out.println("numHex = " + numHex);

    }
}
