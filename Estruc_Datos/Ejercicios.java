package Estruc_Datos;

public class Ejercicios {
    public static void main(String[] args) {
        // Sumar los elementos de un arreglo de enteros
        int[] arreglo = { 7, 10, 11, 15, 8 };
        int suma = 0; // variable entera simple: almacena el resultado de la suma

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("Suma: " + suma);

        System.out.println("-----------------------------------------");

        // Obtener el promedio de un arreglo de enteros
        int[] arreglo2 = { 25, 26, 78, 41, 10 };
        int suma2 = 0;

        for (int i = 0; i < arreglo2.length; i++) {
            suma2 += arreglo2[i];
        }
        double promedio = suma2 / arreglo2.length;
        System.out.println("promedio: " + promedio);

        System.out.println("-------------------------------------------");

        // Obtener los numeros repetidos de un arreglo de enteros
        int[] arreglo3 = { 11, 34, 11, 22, 34 };

        System.out.println("Los repetidos son: ");

        for (int i = 0; i < arreglo3.length; i++) {
            for (int j = i + 1; j < arreglo3.length; j++) {
                if (arreglo3[i] == arreglo3[j]) {
                    System.out.println(arreglo3[i]);
                    break;
                }
            }
        }
        System.out.println("-------------------------------------------");

        // Obtener el mayor y el menor de un arreglo de enteros
        int[] arreglo4 = { 1, 4, 6, 3, 8, 9, 6, 17 };
        int mayor = arreglo4 [0];
        int menor = arreglo4 [0];

        for (int i = 0; i < arreglo4.length; i++) {
            if (arreglo4[i] > mayor) {
                mayor = arreglo4[i];
            }
            if (arreglo4[i] < menor) {
                menor = arreglo4[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
