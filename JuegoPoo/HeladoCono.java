package JuegoPoo;

public class HeladoCono extends Personaje {
    private boolean escudo;

    public HeladoCono(String nombre, int puntosVida, String tipoCono, Topping topping){
        super(nombre, puntosVida, 30, 10, topping);
        this.escudo = false;
    }

    public void activarEscudo(){
        this.escudo = true;
        System.out.println("El helado " + getNombre() + " ha activado su escudo!");
    }

    public void desactivarEscudo(){
        this.escudo = false;
        System.out.println("El helado " + getNombre() + " ha desactivado su escudo!");
    }
    
    @Override
    public void recibirDanio(int danioTotal){
        if(escudo){
            System.out.println("El helado " + getNombre() + " ha bloqueado el daño con su escudo!");
            return;
        }
        super.recibirDanio(danioTotal);
    }
}
