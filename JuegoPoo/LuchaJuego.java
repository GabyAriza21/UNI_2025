package JuegoPoo;

import java.util.Scanner;

public class LuchaJuego {
    private Personaje helado1;
    private Personaje helado2;

    public LuchaJuego(Personaje helado1, Personaje helado2) {
        this.helado1 = helado1;
        this.helado2 = helado2;
    }

    public void iniciarPelea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡La pelea ha comenzado entre " + helado1.getNombre() + " y " + helado2.getNombre() + "!");

        while (helado1.estaVivo() && helado2.estaVivo()) {
            System.out.println("Turno de " + helado1.getNombre() + ":");
            helado1.atacar(helado2);
            System.out
                    .println(helado2.getNombre() + " tiene " + helado2.getPuntosVida() + " puntos de vida restantes.");

            if (!helado2.estaVivo()) {
                System.out.println(helado2.getNombre() + " ha sido derrotado!");
                System.out.println(helado1.getNombre() + " ha ganado!");
                break;
            }

            System.out.println("Turno de " + helado2.getNombre() + ":");
            helado2.atacar(helado1);
            System.out
                    .println(helado1.getNombre() + " tiene " + helado1.getPuntosVida() + " puntos de vida restantes.");

            if (!helado1.estaVivo()) {
                System.out.println(helado1.getNombre() + " ha sido derrotado!");
                System.out.println(helado2.getNombre() + " ha ganado!");
                break;
            }
        }
    }

    public void turno(Personaje enemigo, Personaje atacado) {
        System.out.println("Turno de " + enemigo.getNombre() + ":");
        enemigo.atacar(atacado);
        System.out.println(atacado.getNombre() + " tiene " + atacado.getPuntosVida() + " puntos de vida restantes.");

        if (!atacado.estaVivo()) {
            System.out.println(atacado.getNombre() + " ha sido derrotado!");
            System.out.println(enemigo.getNombre() + " ha ganado!");
        }
    }
}
