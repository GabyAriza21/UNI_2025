package Composicion_y_Agregacion.Trabajo;

public class Producto {
    //atributos
    private int numero; // numero con el que se identifica el producto

    //constructor
    public Producto(int numero){
        this.numero = numero; // inicializa el numero del producto
    }

    //metodos
    public int getnumero(){
        return numero; // devuelve el numero del producto
    }

    public String toString(){
        return "Producto{ numero: " + numero + " }"; // imprime el numero del producto 
    }
}
