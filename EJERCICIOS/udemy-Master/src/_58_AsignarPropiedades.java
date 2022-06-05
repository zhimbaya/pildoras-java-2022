import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class _58_AsignarPropiedades {
    public static void main(String[] args) {

        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            //actualiza todas las propiedades
            System.setProperties(p);

            //Estatico
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(mi.propiedad.personalizada) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            System.out.println("--------- = ");

            //lista todas la propiedades
            System.getProperties().list(System.out);
        }catch (Exception e){
            System.err.println("No existe el archivo = " + e);
            System.exit(0);
        }
    }
}
