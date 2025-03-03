import java.util.Random;

public class Arreglos12 {
    public static void main(String[] args) {
         int [] numeros = new int [5];
        Random random = new Random(); 

        //definir numeros aleatorios entre 50
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = random.nextInt(50) + 1 ;
    }

    
    }
}