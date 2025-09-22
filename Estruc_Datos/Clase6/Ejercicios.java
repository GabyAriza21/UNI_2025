package Estruc_Datos.Clase6;

import java.util.Stack;

public class Ejercicios {
    public static void main(String[] args) {

        Stack<Integer> votos = new Stack<>();

        votos.push(1);
        votos.push(1);
        votos.push(-1);
        votos.push(-1);
        votos.push(1);

        System.out.println("Lista de votos: " + votos);

        int recuentoVotos = 0;

        while(!votos.isEmpty()){
           recuentoVotos += votos.pop();  
        }

        System.out.println("Recuento de votos: " + recuentoVotos);






        
    }
    
}
