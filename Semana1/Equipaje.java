public class Equipaje {
    // Constantes
    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;
    // Atributos
    private double peso;
    private double tamanio;
    private double precioBase;

    // Constructores
    public Equipaje(double peso, double tamanio, double precioBase) {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = PRECIO_BASE;
    }

    // Metodos
    public double calcularPrecio() {
        return precioBase;
    }

    // getters/setters de ser necesarios
    public double getPeso() {
        return peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String toString() {
        return "Equipaje { peso:" + peso +
                " tamanio: " + tamanio +
                " precioBase: " + precioBase + "}";
    }
}

