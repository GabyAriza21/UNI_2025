package Estruc_Datos;

public class Ejercicios {
    public static void main(String[] args) {
        //Sumar los elementos de un arreglo de enteros   
        int[] arreglo = {7, 10, 11, 15, 8};
        int suma = 0; // variable entera simple: almacena el resultado de la suma

        for(int i = 0; i < arreglo.length; i++) {
           suma += arreglo[i];
        }
        System.out.println("Suma: " + suma);

        System.out.println("-----------------------------------------");

        //Obtener el promedio de un arreglo de enteros
        int[] arreglo2 = {25, 26, 78, 41, 10};
        int suma2 = 0; 

        for(int i = 0; i < arreglo2.length; i++) {
          suma2 += arreglo2[i];  
        }
        double promedio = suma2/arreglo2.length;
        System.out.println("promedio: " +  promedio);

        




    }
}

