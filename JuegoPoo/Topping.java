package JuegoPoo;

public class Topping {
    private String nombre;
    private int danioExtra;

    public Topping(String nombre, int danioExtra) {
        this.nombre = nombre;
        this.danioExtra = danioExtra;
    }

    public int getDanioExtra() {
        return danioExtra;
    }

    public String getNombre(){
        return nombre;
    }
}
