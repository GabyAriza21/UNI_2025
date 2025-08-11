package Estruc_Datos;

import java.util.Arrays;

public class EjecutarEstudiante {
    public static void main(String[] args) {

        // creacion de los objetos
        Estudiante objEst1 = new Estudiante(909876, "juanito", "perez", "ingenieiria");
        Estudiante objEst2 = new Estudiante(909877, "juanita", "perea", "ingenieiria");
        Estudiante objEst3 = new Estudiante(909878, "sarita", "prado", "ingenieiria");

        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");

        // crear arreglo de objetos
        // int[] a = new int[5]
        Estudiante est[] = new Estudiante[5]; // arreglo de objetos

        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;

        // forma2

        est[3] = new Estudiante(789654, "juli", "torres", "derecho");
        est[4] = new Estudiante(789655, "toño", "zuluaga", "Contaduria");

        System.out.println(Arrays.toString(est));

        System.out.println("--------------------------------------------");

        for (Estudiante estudiante : est) {
            System.out.println(estudiante);
        }

        System.out.println("--------------------------------------------");
        for (int i = 0; i < est.length; i++) {
            System.out.println(est[i]);

        }
    }
}
