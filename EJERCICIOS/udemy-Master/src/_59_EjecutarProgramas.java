public class _59_EjecutarProgramas {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("Windows")) {
                proceso = rt.exec("notepad");
            }else if(System.getProperty("os.name").startsWith("Mac")){
                proceso = rt.exec("open -a firefox");
            }else if(System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")  ){
                proceso = rt.exec("gedit");
            }
            else{
                proceso=rt.exec("gedit");
            }
            proceso.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconocido");
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
