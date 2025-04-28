package Composicion_y_Agregacion.Trabajo;

import java.util.Arrays;

public class Pedido {

    //atributos
     private Cliente cliente; //cliente que hace el pedido
     private Producto[] producto; // los productos que se piden
     private Dato fecha; //fecha del pedio
     private int numeroTarjetaCredito; // numero de tarjeta de credito usada para el pago

     //constructor
     public Pedido(Cliente cliente, Producto producto[], Dato fecha, int numeroTarjetaCredito){
        this.cliente = cliente; // inicializa el atributo cliente
        this.producto = producto; // inicializa el atributo producto
        this.fecha = fecha; // inicializa el atributo fecha
        this.numeroTarjetaCredito = numeroTarjetaCredito; // inicializa el atributo numeroTarjetaCredito
     }
    
     public String toString(){
        return "Pedido{ cliente: " + cliente.toString() +
        ", fecha: " + fecha.toString() +
        ", numeroTarjetaCredito: " + numeroTarjetaCredito +
        ", productos: " + Arrays.toString(producto) + " }"; // imprime el cliente, fecha, numero de tarjeta de credito y los productos

     }
}
