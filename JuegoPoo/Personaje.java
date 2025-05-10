package JuegoPoo;

import java.util.Random;

public class Personaje {
    private String nombre;
    private int puntosVida;
    private int DANIO_MAX = 30;
    private int DANIO_MIN = 10;
    private Topping topping;

    public Personaje(String nombre, int puntosVida, int DANIO_MAX, int DANIO_MIN, Topping topping){
        this.nombre = nombre;
        this.puntosVida = puntosVida; 
        this.DANIO_MAX = DANIO_MAX;
        this.DANIO_MIN = DANIO_MIN;
        this.topping = topping;
        
    }

    public void atacar(Personaje enemigo){
        Random random = new Random();
        int danioBase = random.nextInt((DANIO_MAX - DANIO_MIN) + 1 )+ DANIO_MIN; // genera un numero aleatorio entre 10 y 30
        int danioTotal = danioBase + topping.getDanioExtra();
        enemigo.recibirDanio(danioTotal);
    }

    public void recibirDanio(int danioTotal){
        this.puntosVida -= danioTotal;
        if(this.puntosVida < 0){
            this.puntosVida = 0;
        }
    }
    
    public boolean estaVivo(){
        return puntosVida > 0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPuntosVida(){
        return puntosVida;
    }
    
}
