import java.util.Random;

public class Arreglos8 {
    public static void main(String[] args) {
        // ejercicio 8 
        // elaborar un programa que lea 30 numeros y que imprima el umero mayor,
        // menor y el numero de veces que se repiten ambos
        
        // dar opcion a ingresar la cantidad de numeros
        int [] numeros = new int [30];
        
        //definir numeros aleatorios entre 10 y 60
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(80)+ 1 ; 
        }
         // definir contadores
          int mayor = 0;
          int menor = 0;

        // definir los numeros mayor y menor 
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < mayor) {
                mayor = numeros[i];
            } 
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            }
            // mostrar los numeros generados 
            System.out.println("Numeros generados: ");
            for (int num : numeros) {
                System.out.println(num + " ");
            }
            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
               

    }

}
