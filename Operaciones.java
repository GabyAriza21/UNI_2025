public class Operaciones {
    float Numero1;
    float Numero2;

    public Operaciones() {
        Numero1 = 0;
        Numero2 = 0;
    }

    public Operaciones(float numero1, float numero2) {
        Numero1 = numero1;
        Numero2 = numero2;
    }

    public float suma() {
        return Numero1 + Numero2;
    }

    public float resta() {
        return Numero1 - Numero2;
    }

    public float multiplicacion() {
        return Numero1 * Numero2;
    }

    public float division() {
        return Numero1 / Numero2;
    }

}