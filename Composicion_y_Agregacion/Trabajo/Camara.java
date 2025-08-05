package Composicion_y_Agregacion.Trabajo;

public class Camara extends Producto{

    //atributos
    private String marca; //marca de la camara
    private String modelo; //modelo de la camara
    
    //constructor
    public Camara(int numero, String marca, String modelo){
        super(numero); // Llama al constructor de la clase producto
        this.marca = marca; // inicializa el atributo marca
        this.modelo = modelo; // inicializa el atributo modelo
}

public String toString(){
        return "Camara{ marca: " + marca + ", modelo: " + modelo + ", " + super.toString() + " }"; // imprime la marca, modelo y numero de la camara
    }
}