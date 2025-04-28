package Semana3_4;
public class Arreglos5 {
    public static void main(String[] args) {
        double [] precios = {15.1, 16.7, 17.8};
        int [] cantCompradas = {1, 2, 3};
        String [] descripciones = {"Producto A", "Producto B", "Producto C"};

        double totalGeneral = 0;
        double gastoMax = 0;
        String productoGastoMax = "";
        
        System.out.println("Total gastado por producto: ");
        for (int i = 0; i < precios.length; i++) {
            double total = precios[i]*cantCompradas[i];
            totalGeneral += total;

            System.out.println(descripciones[i] + ": " + total);

            if (total > gastoMax) {
                gastoMax = total;
                productoGastoMax = descripciones[i];
            }
        }
        
        System.out.println("Total general de todas las compras: " + totalGeneral);
        System.out.println("Producto con mayor gasto: "+ productoGastoMax + " (" + gastoMax + ")");
    }
}
