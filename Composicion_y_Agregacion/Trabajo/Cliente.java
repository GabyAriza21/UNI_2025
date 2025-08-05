package Composicion_y_Agregacion.Trabajo;

public class Cliente {
    //atributos
    private String cedula; //cedula del cliente
    private String nombre; // nombre del cliente

    //constructor
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula; // inicializa el atributo cedula
        this.nombre = nombre; // inicializa el atributo nombre
    }

    // metodos 
    public String getNombre(){ 
        return nombre; // entrega el nombre del cliente
    }
    
    public String toString(){
        return "Cliente{" +
                "cedula: " + cedula +
                ", nombre: '" + nombre + "}";
    }
}
