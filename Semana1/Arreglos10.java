import java.util.Arrays;
import java.util.Random;

public class Arreglos10 {
    public static void main(String[] args) {
        int [] numeros = new int [8];
        Random random = new Random(); 
        int [] sumaOpuestos = new int[8];
        int n = numeros.length; 
        
        //definir numeros aleatorios entre 10 
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1 ;
    }
     for (int i = 0; i < numeros.length; i++){
         sumaOpuestos[i] = numeros[i] + numeros[n - 1 - i];
     }
     System.out.println("Arreglo original: " + Arrays.toString(numeros));
     System.out.println("Arreglo suma opuestos : " + Arrays.toString(sumaOpuestos));
}
}