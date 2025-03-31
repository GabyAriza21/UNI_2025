public class TarjetaCredito extends Pago {
    private int numero;

    public TarjetaCredito (double monto, String fecha, int numero) {
        super (monto, fecha);
        this.numero = numero; 
    }

    public double pagar () {
        return monto * 1.30;
    }
    public String toString() {
        return "TarjetaCrédito: " + monto + ", fecha: " + fecha + ", número: " + numero + "}";
    }
}

