package Estruc_Datos.Clase4;

public class Casillero {
    private int numCasillero;
    private boolean disponible;
    private Paquete paquete; // Atributo para almacenar el paquete (composición)

    public Casillero(int numCasillero) {
        this.numCasillero = numCasillero;
        this.disponible = true; // por defecto esta libre
        this.paquete = null; // inicialmente no hay paquete
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void asignarPaquete(Paquete paquete) {
        if (disponible) {
            this.paquete = paquete;
            this.disponible = false;
        } else {
            System.out.println("Casillero " + numCasillero + " ocupado.");
        }
    }

    public void liberarCasillero() {
        this.paquete = null;
        this.disponible = true;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public int getnumCasillero() {
        return numCasillero;
    }

    public String toString() {
        if (disponible) {
            return "[Casillero " + numCasillero + ": Libre }";
        } else {
            return "Casillero " + numCasillero + ": Ocupado -> " + paquete + " ]";
        }
    }
}
