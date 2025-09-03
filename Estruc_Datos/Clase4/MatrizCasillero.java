package Estruc_Datos.Clase4;

public class MatrizCasillero {
    private Casillero[][] casilleros;

    public MatrizCasillero(int filas, int columnas){
        casilleros = new Casillero[filas][columnas];
        int contador = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casilleros[i][j] = new Casillero(contador++);
            }
        }
    }

    public void consultarCasillero(int numCasillero) {
    for (int i = 0; i < casilleros.length; i++) {
        for (int j = 0; j < casilleros[i].length; j++) {
            if (casilleros[i][j].getnumCasillero() == numCasillero) {
                System.out.println(casilleros[i][j]);
                return;
            }
        }
    }
    System.out.println("Casillero " + numCasillero + " no encontrado.");
}

    public String mostrarCasilleros() {
        String cad = "";
        for (int i = 0; i < casilleros.length; i++) {
            for (int j = 0; j < casilleros[i].length; j++) {
                if (casilleros[i][j].isDisponible()){
                    cad += "[I] "; // I de libre
                } else {
                    cad += "[O] "; // O de ocupado
                }
            }
            cad += "\n";
        }
        return cad;
    }

    public void registrarPaquete(Paquete p) {
        for (int i = 0; i < casilleros.length; i++) {
            for (int j = 0; j < casilleros[i].length; j++) {
                if (casilleros[i][j].isDisponible()) {
                    casilleros[i][j].asignarPaquete(p);
                    System.out.println("Paquete asignado al casillero " + casilleros[i][j].getnumCasillero());
                    return;
                }
            }
        }
        System.out.println("No hay casilleros disponibles.");
    }

    public void liberarCasillero(int numCasillero) {
        for (int i = 0; i < casilleros.length; i++) {
            for (int j = 0; j < casilleros[i].length; j++) {
                if (casilleros[i][j].getnumCasillero() == numCasillero) {
                    casilleros[i][j].liberarCasillero();
                    System.out.println("Casillero " + numCasillero + " liberado.");
                    return;
                }
            }
        }
        System.out.println("Casillero " + numCasillero + " no encontrado.");
    }
}
