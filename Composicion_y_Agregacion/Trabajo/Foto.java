package Composicion_y_Agregacion.Trabajo;

public class Foto {

    private String fichero; 

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void print(){
        System.out.println("Imprimiendo foto: " + fichero);
    }
}
