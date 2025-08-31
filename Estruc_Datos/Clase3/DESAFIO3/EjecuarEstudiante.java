package Estruc_Datos.Clase3.DESAFIO3;

public class EjecuarEstudiante {
    public static void main(String[] args) {
        Estudiante[] E = new Estudiante[3];

        E[0] = new Estudiante("Gaby", true, 4.5);
        E[1] = new Estudiante("Linda", true, 3.8);
        E[1] = new Estudiante("paul", true, 2.9);
    }

    // busqueda estudiante por nombre 
    Estudiante estudianteEncontrado = buscarEstudiante(E, "Linda");
    if (estudianteEncontrado != null){
        System.out.println("Estudiante");
    }
 
    //metodo que busca estudiante por nombre
    public static void buscarEstudiante(Estudiante[] estudiantes, String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Estudiante encontrado: " + estudiante);
            } else {
                System.out.println("Estudiante no encontrado");
            }
        }

    }

}
