public class Arreglos2 {
    public static void main(String[] args) {
        //ejercicio 2
        int [] grupo1 = {14,18,20,25};
        int [] grupo2 = {30,23,18,19};

        int edadMax = grupo1.length > 0 ? grupo1[0] : (grupo2.length > 0 ? grupo2[0] : 0);
        for (int edad : grupo1) {
            if (edad > edadMax) {
                edadMax = edad;
            }
        }
        for (int edad : grupo2) {
            if (edad > edadMax) {
                edadMax = edad;
            }
        }
        System.out.println("La mayor edad es: " + edadMax);
    }
}
