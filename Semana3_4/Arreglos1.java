package Semana3_4;
import java.util.Scanner;

public class Arreglos1 {
    public static void main(String[] args) {
        // Ejercicio 1
        // Se tiene un arreglo lineal de n números, Hallar la suma 
        //  los n números (n es ingresado por el usuario)

        // solicitar variable n por teclado 
        Scanner leer = new Scanner(System.in); //da lugar para leer los datos que el usuario dijite a traves del teclado 
        System.out.println("Por favor ingrese la cantidad de numeros: "); // muestra el mensaje
        int n = leer.nextInt(); // sirve para leer los datos enteros que el usuario dijite a traves del teclado 
        int [] b = new int [n]; // declara u arreglo que almacenara valores de tipo entero y contendra n cantidad de elemntos

        // llenar el arreglo con numero entre 10 y 30
        for (int i = 0; i < b.length; i++){ // cotexto en notas de keep 
            b[i] = (int) (Math.random() * (30 + 10)) +10;
        }

        // mostrar elementos del arrgelo b
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]); // b[0]=12, b[1]=67....
        }

        // msumar los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < b.length; i++) {
            suma = suma + b[i]; // variable que almacena valor numerico, toma el valor actual de la suma y se le suma el valor agregado b en i, b[i] es un numero almacenado en el arreglo i
        }
        System.out.println("La suma total de los " + n + " elemento del arreglo es: " + suma);
        leer.close();

    }
    
}
