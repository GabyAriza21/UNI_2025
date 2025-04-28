package Composicion_y_Agregacion;
public class Evaluacion {

    // atributos
    private String tipo;
    private double nota;

    // constructor
    public Evaluacion(String tipo, double nota) {
        this.tipo = tipo;
        this.nota = nota;
    }
    public void mostrarInfo() {
        System.out.println("Evaluacion: " + tipo);
        System.out.println("Nota: " + nota);
    }
    
}