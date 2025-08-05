package Estruc_Datos;

public class Ejercicios {
    public static void main(String[] args) {
        //Sumar los elementos de un arreglo de enteros   
        int[] arreglo = {7, 10, 11, 15, 8};
        int suma = 0;

        for(int i = 0; i < arreglo.length; i++) {
           suma += arreglo[i];
        }
        System.out.println("Suma: " + suma);
    }
}


    
