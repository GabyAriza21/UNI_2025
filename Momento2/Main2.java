package Momento2;

public class Main2 {
    public static void main(String[] args) {
        Equipaje equipaje[] = new Equipaje[4];

        equipaje[0] = new Bodega(300.0, 5.0); // pesadito
        equipaje[1] = new Bodega(50.0, 1.0); // pequeñito
        equipaje[2] = new Cabina(); // valores defecto
        equipaje[3] = new Cabina(500); // precio base solamente

        PrecioTotal prueba = new PrecioTotal(equipaje);
        prueba.mostrarTotales();
    }
}
