public class Estudiante {

    // Atrubutos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String facultad;

    // constructor de la clase: permite inicializar la clase
    public Estudiante(int id, String nombre, String apellido, int edad, String facultad) {
        this.id = id; // this es una autoreferencia a los atributos de la clase
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.facultad = facultad;
    }

    // metodos get y set (getters y setters)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
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

    public String toString() {
        return "Estudiante: { id:" + id +
                " nombre:" + nombre +
                " apellido:" + apellido +
                " edad:" + edad +
                " facultad:" + facultad + "}";
    }
}