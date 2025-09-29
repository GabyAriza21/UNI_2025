package Estruc_Datos.Clase6;

import java.util.ArrayDeque;
import java.util.LinkedList;
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

        if (Objects.equals(tapaPan1, tapaPan2) && Objects.equals(colaPan1, colaPan2)) {
            System.out.println("Los panes son similares.");
        } else {
            System.out.println("Los panes no son similares.");
        }

        System.out.println("--- Ejercicio 3: Cuadrados y cubos ---");

        Queue<Integer> raices = new LinkedList<>();

        raices.add(45);
        raices.add(10);

        System.out.println("Cola de Raices: " + raices);

        int primero = raices.remove();
        int segundo = raices.remove();

        double raizCuadrada = 1;
        for (double i = 1; i * i <= primero; i++) {
            raizCuadrada = i;
        }

        double raizCubica = 1;
        for (double i = 1; i * i * i <= segundo; i++) {
            raizCubica = i;
        }

        System.out.println("Raiz cuadrada: " + raizCuadrada);
        System.out.println("Raiz cubica: " + raizCubica);

        if (raizCuadrada == raizCubica) {
            System.out.println("Las raices son iguales");
        } else {
            System.out.println("Las raices son diferentes");
        }

        System.out.println("--- Ejercicio 4: formateo numero telefonico ---");

        Queue<Integer> numeroTelefonico = new LinkedList<>();

        numeroTelefonico.add(3);
        numeroTelefonico.add(2);
        numeroTelefonico.add(0);
        numeroTelefonico.add(2);
        numeroTelefonico.add(2);
        numeroTelefonico.add(7);
        numeroTelefonico.add(7);
        numeroTelefonico.add(5);
        numeroTelefonico.add(5);
        numeroTelefonico.add(0);

        System.out.println("Numero telefonico: " + numeroTelefonico);

        String numeroFormateado = "(" + numeroTelefonico.poll() + numeroTelefonico.poll() + numeroTelefonico.poll()
                + ")"
                + numeroTelefonico.poll() + numeroTelefonico.poll() + numeroTelefonico.poll() + "-"
                + numeroTelefonico.poll() + numeroTelefonico.poll() + numeroTelefonico.poll() + numeroTelefonico.poll();

        System.out.println("Numero formateado: " + numeroFormateado);

        System.out.println("--- Ejercicio 5: encontrar el segundo numero mas grande ---");

        Queue<Integer> num = new LinkedList<>();

        num.add(10);
        num.add(15);
        num.add(16);
        num.add(21);
        num.add(32);

        System.out.println("Cola de numeros: " + num);

        int max = 0;

        for (int n : num) {
            if (n > max) {
                max = n;
            }
        }

        num.remove(max);

        int segundoMax = 0;

        for (int n : num) {
            if (n > segundoMax) {
                segundoMax = n;
            }
        }

        System.out.println("El segundo numero mas grande es: " + segundoMax);
        System.out.println("El primer numero mas grande es: " + max);

        System.out.println("--- Ejercicio 6: sociedad sectera ---");

        Queue<String> nombres = new LinkedList<>();

        nombres.add("Ana");
        nombres.add("Gabriela");
        nombres.add("Claudia");

        System.out.println("Cola de nombres: " + nombres);

        char[] inicialesMayus = new char[nombres.size()];
        int i = 0;
        for (String nombre : nombres) {
            inicialesMayus[i++] = nombre.charAt(0);
        }

            for (int j = 0; j < inicialesMayus.length - 1; j++) {
                for (int k = 0; k < inicialesMayus.length - 1 - j; k++) {
                    if (inicialesMayus[k] > inicialesMayus[k + 1]) {
                        char temp = inicialesMayus[k];
                        inicialesMayus[k] = inicialesMayus[k + 1];
                        inicialesMayus[k + 1] = temp;
                    }
                }
            }

            String sociedad = "";
            for (char c : inicialesMayus) {
                sociedad += c;
            }

            System.out.println("Sociedad secreta: " + sociedad);

            System.out.println("--- Ejercicio 7: cadenas de 4 letras --- ");
            
        }
    }

