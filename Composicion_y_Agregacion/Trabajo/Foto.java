package Composicion_y_Agregacion.Trabajo;

public class Foto {

    //atributos
    private String fichero; // nombre del ficero de la foto

    //constructor
    public Foto(String fichero) { 
        this.fichero = fichero; // inicializa el atributo fichero
    }

    //metodos
    public void print(){
        System.out.println("Imprimiendo foto: " + fichero); //imprime la foto
    }

    public String toString(){
        return "Foto{" +
                "fichero: " + fichero + "}"; // imprime el nombre del fichero
    }
}
