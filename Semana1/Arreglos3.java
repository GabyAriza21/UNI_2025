public class Arreglos3 {
    public static void main(String[] args) {
        //ejercicio número 1
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int par = 0;
        int impar = 0;

        for (int num : numeros){
            if (num % 2 == 0){
                par += num;   
            }else {
            impar += num;
        }
        }
        System.out.println("Suma de números pares: " + par);
        System.out.println("Suma números impares: " + impar);

        System.out.println("------------------------------------");

    }
} 
