package Momento2;
public class Cabina extends Equipaje {

    // Constantes
    private final static int TIEMPO = 2;

    // Constructores
    public Cabina(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Cabina(double precioBase) {
        super(precioBase);
    }

    public Cabina() {
        super();
    }

    // Metodos
    public double calcularPrecio() {
        return getPrecioBase() + (getPeso() * getTamanio() * TIEMPO);

    }

    public String toString() {
        return "Cabina { peso: " + getPeso() +
                ", tamanio: " + getTamanio() +
                ", precioBase: " + getPrecioBase() +
                ", precioFinal: " + calcularPrecio() + "}";
    }
}
