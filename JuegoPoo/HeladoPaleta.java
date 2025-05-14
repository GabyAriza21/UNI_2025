package JuegoPoo;

public class HeladoPaleta extends Personaje {

    public HeladoPaleta(String nombre, int puntosVida, String tipoCono, Topping topping) {
        super(nombre, puntosVida, 30, 10, topping);
    }

    public void atacar(Personaje enemigo){
        System.out.println("El helado " + getNombre() + " ataca!");
        super.atacar(enemigo);
    }
        
}
