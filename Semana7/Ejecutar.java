package Semana7;
public class Ejecutar {
    public static void main(String[] args) {
        // creacion del objeto (instanciar (operador new) el objeto)
        // llave que accede a la clase Estudiante
        // se da vida con la clase Estudiante
        // accede a los metodos de la clase Estudiante
        Estudiante objEst1 = new Estudiante(1, "Gabriela", "Astorquiza", 18, "Ingenieria");
        Estudiante objEst2 = new Estudiante(2, "Juan", "Perez", 20, "Ingenieria");

        System.out.println(objEst1); // toSting
        System.out.println(objEst2);

        // modificar la edad del estudiante
        objEst1.setEdad(19);
        System.out.println(objEst1);
    }
}