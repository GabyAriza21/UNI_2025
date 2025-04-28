public class EjecutarHerencia {
    public static void main(String[] args) {
        Pago pago1 = new Efectivo(1200.0, "lunes", "pago en efectivo");
        Pago pago2 = new TarjetaCredito(610.0, "martes", 123456);

        System.out.println(pago1.pagar());
        System.out.println(pago2.pagar());
    }
}

