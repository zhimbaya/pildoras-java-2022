import java.util.Locale;

public class _16_StringMetodos {
    public static void main(String[] args) {
        String nombre = "Diego";
        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.equals("Diego"));
        System.out.println(nombre.equals("diego"));
        System.out.println(nombre.compareTo("Diego"));
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(1));
        System.out.println(nombre.charAt(nombre.length() - 1));
        System.out.println(nombre.substring(1));
        System.out.println(nombre.substring(1, 3));
        System.out.println(nombre.substring(1, nombre.length() - 1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\"A\") = " + trabalenguas.replace("a", "A"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf('z'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas = " .trim());
    }
}
