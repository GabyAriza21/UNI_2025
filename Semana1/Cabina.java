public class Cabina extends Equipaje {
    // Atributos
    private double precioFinal;

    // Constantes
    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private final static int TIEMPO = 2;

    // Constructores
    public Cabina(double peso, double tamanio, double precioFinal) {
        super(peso, tamanio, precioFinal);
        this.precioFinal = precioFinal;
    }

    // Metodos
    public double calcularPrecio() {
        // Calculos
        return precioFinal; 
    }
    public String toString() {
        return "Cabina { peso: " + getPeso() +
                ", tamanio: " + getTamanio() +
                ", precioFinal: " + precioFinal + "}";
    }
}
