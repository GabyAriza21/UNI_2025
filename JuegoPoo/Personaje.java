package JuegoPoo;

import java.util.Random;

public class Personaje {
    private String nombre;
    private int puntosVida;
    private int DANIO_MAX = 30;
    private int DANIO_MIN = 10;
    private Topping topping;

    // constructor incluyendo el topping
    public Personaje(String nombre, int puntosVida,int DANIO_MAX, int DANIO_MIN, Topping topping){
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.DANIO_MAX = 30;
        this.DANIO_MIN = 10; 
        this.topping = topping;
        
    }

    // metodo para atacar al enemigo
    public void atacar(Personaje enemigo){
        Random random = new Random();
        int danioBase = random.nextInt((DANIO_MAX - DANIO_MIN) + 1 )+ DANIO_MIN; // genera un numero aleatorio entre 10 y 30
        int danioTotal = danioBase;

        // si el personaje tiene un topping se le agrega el daño extra
        if(topping != null){
            danioTotal += topping.getDanioExtra();
            System.out.println("El topping " + topping.getNombre() + " ha añadido " + topping.getDanioExtra() + " puntos de daño.");
        }

        enemigo.recibirDanio(danioTotal);
        System.out.println("El personaje " + this.nombre + " ha atacado a " + enemigo.getNombre() + " causando " + danioTotal + " puntos de daño.");
    }

    // mettodo para recibir el danio
    public void recibirDanio(int danioTotal){
        this.puntosVida -= danioTotal;
        // si los puntos de vida son menores a 0, se ajustan a 0
        if(this.puntosVida < 0){
            this.puntosVida = 0;
        }
    }
    
    // metodo que verifica si sigue vivio el personaje
    public boolean estaVivo(){
        return puntosVida > 0;
    }
    
    //metodos para acceder al nombre y los puntos de vida
    public String getNombre(){
        return nombre;
    }

    public int getPuntosVida(){
        return puntosVida;
    }
    
}
