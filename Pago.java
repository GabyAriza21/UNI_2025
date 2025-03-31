public class Pago {

    public double monto;
    public String fecha;

    public Pago (double monto, String fecha) {
             this.monto = monto;
             this.fecha = fecha;
     }

     public double pagar () {
             return 0.0;
     }

     public String toString () {
             return "pago { monto : " + monto + ", fecha: " + fecha + "}";
      }
}
     
     