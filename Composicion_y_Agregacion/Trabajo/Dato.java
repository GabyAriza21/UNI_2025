package Composicion_y_Agregacion.Trabajo;

public class Dato {
    private int dia; // dia del mes
    private int mes; // mes del año
    private int anio; // año

    //constructor
    public Dato(int dia, int mes, int anio){
        this.dia = dia; // inicializa el atributo dia
        this.mes = mes; // inicializa el atributo mes
        this.anio = anio; // inicializa el atributo anio
    }

    public String toString(){
        return "Dato{ dia: " + dia + ", mes: " + mes + ", anio: " + anio + " }";
    
    }
}
