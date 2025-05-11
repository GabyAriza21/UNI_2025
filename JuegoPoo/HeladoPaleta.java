package JuegoPoo;

public class HeladoPaleta extends Personaje {
    private String tipoCono;

    public HeladoPaleta(String nombre, int puntosVida, String tipoCono, Topping topping) {
        super(nombre, puntosVida, 30, 10, topping);
        this.tipoCono = tipoCono;
    }

    public void atacar(Personaje enemigo){
        System.out.println("El helado " + getNombre() + " ataca con su cono de tipo " + tipoCono + "!");
        super.atacar(enemigo);
    }
        
}
