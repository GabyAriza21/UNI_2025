package JuegoPoo;

public class HeladoCono extends Personaje {
    private boolean escudo;

    //inicializa un HeladoCono con nombre, puntos de vida, topping y escudo desactivado
    public HeladoCono(String nombre, int puntosVida, Topping topping){
        super(nombre, puntosVida, 30, 10, topping);
        this.escudo = false;
    }

    //activa el escudo
    public void activarEscudo(){
        this.escudo = true;
        System.out.println("El helado " + getNombre() + " ha activado su escudo!");
    }

    //desactiva el escudo
    public void desactivarEscudo(){
        this.escudo = false;
        System.out.println("El helado " + getNombre() + " ha desactivado su escudo!");
    }
    
    //(sobreescrito para recibir daño) en caso de que el escudo este activado, bloquea el daño
    @Override
    public void recibirDanio(int danioTotal){
        if(escudo){
            System.out.println("El helado " + getNombre() + " ha bloqueado el daño con su escudo!");
            return;
        }
        super.recibirDanio(danioTotal);
    }
}
