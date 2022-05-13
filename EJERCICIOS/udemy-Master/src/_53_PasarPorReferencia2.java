public class _53_PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Diego");
        System.out.println("Iniciamos el main");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Finaliza el método main");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.setNombre("Armando");
        System.out.println("Finaliza el método test");
    }
}
class Persona{
    //lo recomendable es crear en otro archivo.
    //toda variable tiene que ser privada y utilizar los getter y setter
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
