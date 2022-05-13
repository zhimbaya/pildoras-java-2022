public class _49_AutoboxingInteger {
    public static void main(String[] args) {

        //autoboxing
        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10}; //forma explicita e implicita
        
        int suma = 0;
        for(Integer i : enteros){
            if (i.intValue() % 2 == 0) { //auto unboxing, forma explicita
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
        suma = 0;
        for(Integer i : enteros){ //auto unboxing, forma automática o implicita
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
