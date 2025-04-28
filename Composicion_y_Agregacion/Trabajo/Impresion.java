package Composicion_y_Agregacion.Trabajo;

public class Impresion extends Producto{
    //Atributos 
    private String color; //color de la impresion 
    private Foto foto; // Foto unida a la impresion (composicion)

    //Constructor 
    public Impresion(int numero, String color, Foto foto){
        super(numero); // Llama al constructor de la clase producto
        this.color = color; // inicializa el atributo color
        this.foto = foto; // inicializa el atributo foto
    }
    public String toString(){
        return "Impresion{ color: " + color + ", " + super.toString() + ", " + foto.toString() + " }"; // imprime el color, numero y foto asociada
    }
}
