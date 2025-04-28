package Semana3_4;
import java.util.Arrays;

public class Arreglos9 {
    public static void main(String[] args) {
        int [] Numeros = {1, 0, 0, 4, 1, 3, 4, 0, 2, 1};
        Arrays.sort(Numeros); // ordena los numeros de mayor a menor
        int contador = 0; // cuenta cuentas veces se repite el numero
        int aux = Numeros[0]; //aqui se almacena el primer valor del arreglo ordenado
        
        //este if se repite hasta que los 0 se acaben en la secuencia de numeros organizados
        for (int i = 0; i < Numeros.length; i++) { // comienza en 0 mientras i se va incrementando uno en uno
          if (aux == Numeros[i]){ // esta revisando si la variable i es igual a lo de la posicion 0 del arreglo
            contador++; // si se cumple la condicion la variable contador se incrementa a uno
          } else { // cuando en la posicion i ya no esta el 0 sino un numero diferente se ejecuta el else
            System.out.println("El  numero " + aux + " se repite " + contador + " veces ");
            contador = 1;
            aux = Numeros[i]; 
          }
        }

        System.out.println("El numero " + aux + " se repite " + contador + " veces "); // incrementa las veces que se repite el ultimo numero

    }
}
