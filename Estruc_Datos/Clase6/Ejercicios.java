package Estruc_Datos.Clase6;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class Ejercicios {
    public static void main(String[] args) {

        System.out.println("--- Ejercicio 1: Recuento de votos ---");

        Stack<Integer> votos = new Stack<>();

        votos.push(1);
        votos.push(1);
        votos.push(-1);
        votos.push(-1);
        votos.push(1);

        System.out.println("Lista de votos: " + votos);

        int recuentoVotos = 0;

        while (!votos.isEmpty()) {
            recuentoVotos += votos.pop();
        }

        System.out.println("Recuento de votos: " + recuentoVotos);

        System.out.println("--- Ejercicio 2: Pan similar ---");

        Queue<String> pan1 = new ArrayDeque<>();

        pan1.add("pan multigrano");
        pan1.add("jamon");
        pan1.add("aguacate");
        pan1.add("pan multigrano");

        System.out.println("pan 1: " + pan1);

        Queue<String> pan2 = new ArrayDeque<>();

        pan2.add("pan masa madre");
        pan2.add("queso");
        pan2.add("carne");
        pan2.add("pan masa madre");

        System.out.println("pan 2: " + pan2);

        String tapaPan1 = pan1.peek();
        String tapaPan2 = pan2.peek();

        String colaPan1 = null;
        for (String ingrediente : pan1) {
            colaPan1 = ingrediente;
        }

        String colaPan2 = null;
        for (String ingrediente : pan2) {
            colaPan2 = ingrediente;
        }

        if(Objects.equals(tapaPan1, tapaPan2) && Objects.equals(colaPan1, colaPan2)){
            System.out.println("Los panes son similares.");
            } else {
            System.out.println("Los panes no son similares.");
        }
    }

}
