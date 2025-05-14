package JuegoPoo;

public class HeladoPaleta extends Personaje {

    //inicializa un HeladoPaleta con nombre, puntos de vida y topping
    public HeladoPaleta(String nombre, int puntosVida, String tipoCono, Topping topping) {
        super(nombre, puntosVida, 30, 10, topping);
    }

    //ataque, mostrando un mensaje antes de hacer el ataque
    public void atacar(Personaje enemigo){
        System.out.println("El helado " + getNombre() + " ataca!");
        super.atacar(enemigo);
    }
        
}
