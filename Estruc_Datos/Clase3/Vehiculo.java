package Estruc_Datos.Clase3;

public class Vehiculo { 
    private String chasis;
    private String marca;
    private int modelo;
    private boolean matriculado;

    public Vehiculo(String chasis, String marca, int modelo, boolean matriculado){
        this.chasis = chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.matriculado = matriculado;
    }
    public String toString() {
        return "Vehiculo { chasis: " + chasis +
                " Marca: " + marca +
                " Modelo: " + modelo +
                " Matriculado: " + matriculado + "}";
    }
}

