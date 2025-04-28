package Momento2;
public class PrecioTotal {
    // Atributos
    private double TotalPrecios;
    private double totalBodega;
    private double totalcabina;
    private Equipaje[] equipajes;

    // Constructor
    public PrecioTotal(Equipaje[] equipajes) {
        this.equipajes = equipajes;
    }

    public void calcularTotales() {
        for (Equipaje equipaje : equipajes) {
            double precio = equipaje.calcularPrecio();
            TotalPrecios += precio;

            if (equipaje instanceof Bodega) {
                totalBodega += precio;
            } else if (equipaje instanceof Cabina) {
                totalcabina += precio;
            }
        }
    }

    public void mostrarTotales() {
        calcularTotales();
        System.out.println("Total de precios: " + TotalPrecios);
        System.out.println("Total de precios de Bodega: " + totalBodega);
        System.out.println("Total de precios de Cabina: " + totalcabina);
    }
}
