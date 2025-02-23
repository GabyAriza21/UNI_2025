public class Arreglos4 {
    public static void main(String[] args) {
        double [] alquiler = {1000.0, 2000.0, 3000.0};
        double [] gananciaPorcentaje = {25.0, 50.0, 100.0};
        
        System.out.println("Ganancias por vivienda: ");
        for (int i = 0; i < alquiler.length; i++){
        double ganancia = alquiler[i] * (gananciaPorcentaje[i] / 100);
        System.out.println("Vivienda " + (i + 1) + ":  " + ganancia);
    }    
  }
}
