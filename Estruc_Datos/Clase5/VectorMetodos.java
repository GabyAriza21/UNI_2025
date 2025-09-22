package Estruc_Datos.Clase5;

import java.util.Stack;
import java.util.Vector;

public class VectorMetodos {
    public static void main(String[] args) {
        
        //metodo add -> añade un elemento al final del vector
        Vector<String> frutas = new Vector<>(); //define el Vector de tipo texto

        //añade la frutas al vector -> primero en entrar, primero en salir  
        frutas.add("banano"); 
        frutas.add("fresa");
        frutas.add("manzana");

        //muestra el vector lleno 
        System.out.println(frutas);

        frutas.add("papaya");

        System.out.println(frutas);

        //agregar un elemento en la posicion indicada
        frutas.add(2,"maracuya");
        
        System.out.println(frutas);

        System.out.println("----------Stack----------");

        //metodo add en un stack 
        Stack<String> frutas2 = new Stack<>(); 

        //añade frutas al stack
        frutas2.push("kiwi");
        frutas2.push("mango");

        System.out.println(frutas2);

        frutas2.add("sandia");

        System.out.println(frutas2);

        frutas2.add(2,"ciruela");
        
        System.out.println(frutas2);


        





    }
    
}
