public class _13_StringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Diego Simbaña";

        //curso sigue siendo inmutable
        //MAS EFICIENTE.
        String resultado = curso.concat(profesor); // es otra instancia
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        //no son el mismo objeto
        System.out.println(curso == resultado);

        //expresion landa
        String result2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("result2 = " + result2);

        String mayusc = resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        System.out.println("mayusc = " + mayusc);
        
    }
}
