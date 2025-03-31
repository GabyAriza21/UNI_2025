public class Efectivo extends Pago {
    private String descripcion;

    public Efectivo(double monto, String fecha, String descripcion) {
        super(monto, fecha);
        this.descripcion = descripcion;
    }

    public double pagar() {
        return monto * 1.20;
    }

    public String toString() {
        return "Efectivo { monto: " + monto + ", fecha: " + fecha + ", descripcion: " + descripcion + "}";
    }
}