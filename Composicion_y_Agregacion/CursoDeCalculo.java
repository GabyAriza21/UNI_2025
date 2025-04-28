package Composicion_y_Agregacion;

public class CursoDeCalculo {
    private Evaluacion quiz;
    private Evaluacion parcial;
    private Evaluacion taller;

    public CursoDeCalculo() {
        quiz = new Evaluacion("Quiz", 20);
        parcial = new Evaluacion("Parcial", 40);
        taller = new Evaluacion("Taller", 40);
    }

    public void mostrarEvaluaciones() {
        System.out.println("Evaluaciones del curso:");
        quiz.mostrarInfo();
        parcial.mostrarInfo();
        taller.mostrarInfo();
    }
    
}
