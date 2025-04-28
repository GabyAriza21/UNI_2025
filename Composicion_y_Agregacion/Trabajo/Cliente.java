package Composicion_y_Agregacion.Trabajo;

public class Cliente {

    private int cedula;
    private String nombre;

    public Cliente(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String toString(){
        return "Cliente{" +
                "cedula: " + cedula +
                ", nombre: '" + nombre + "}";
    }
}
