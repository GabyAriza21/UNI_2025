public class Arreglos5 {
    public static void main(String[] args) {
        int [] A = {13, 5 ,2 , 10, 34, 55, 60, 21, 11, 24, 46};

        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int num : A){
            if (num % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        int [] pares = new int[contadorPares];
        int [] impares = new int[contadorImpares];

        int indexPares = 0;
        int indexImpares = 0;

        for (int num : A) {
            if (num % 2 == 0) {
                pares[indexPares++] = num;
            } else {
                impares[indexImpares++] = num;
            }
        }
        System.out.println("Números pares: ");
        for (int num : pares){
            System.out.print(num + " ");   
        }
        System.out.println("Numeros impares: ");
        for(int num : impares){
            System.out.print(num + " ");
        }
    }
}
