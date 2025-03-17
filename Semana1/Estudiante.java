public class Estudiante {

    // Atrubutos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String facultad;

    //constructor de la clase: permite inicializar la clase
    public Estudiante(int id, String nombre, String apellido, int edad, String faultad){
        this.id = id; //this es una autoreferencia a los atributos de la clase
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.facultad = facultad;
    }

    // metodos
    public void matricularCursos(String curso) {
        System.out.println("Curso: " + curso + "matriculado");
    }

    public String verificarCreditos(int creditos) {
        String cad = "";
        if (creditos < 10) {
            cad = "No puede matricular menos de 10 creditos";
        } else {
            cad = "Sus creditos cumplen lo requerido";
        }
        return cad;
    }
}