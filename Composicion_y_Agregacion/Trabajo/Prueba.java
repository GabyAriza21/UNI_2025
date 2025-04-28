package Composicion_y_Agregacion.Trabajo;

public class Prueba {
    public static void main(String[] args) {

        Foto foto1 = new Foto("playa.jpg");
        Foto foto2 = new Foto("montaña.jpg");

        // Crear objetos Producto
        Impresion impresion1 = new Impresion(1, "Color", foto1);
        Camara camara1 = new Camara(2, "Canon", "EOS 4000D");
        Impresion impresion2 = new Impresion(3, "Blanco y negro", foto2);

        // Crear array de productos
        Producto[] productos = {impresion1, camara1, impresion2};

        // Crear objeto Cliente
        Cliente cliente = new Cliente("1326547820", "marta");

        // Crear objeto Dato (fecha)
        Dato fecha = new Dato(28, 4, 2025); // ejemplo: 28/04/2025

        // Crear objeto Pedido
        Pedido pedido = new Pedido(cliente, productos, fecha, 12345678);

        // Imprimir el pedido
        System.out.println(pedido);
    } 
    
}
