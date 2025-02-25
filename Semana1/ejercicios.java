import java.util.Arrays;

public class ejercicios {
    public static void main(String[] args) {
        // ejercicio 11
        // creacion arreglo A de enteros de n elementos con un arreglo que estara
        // comprendido
        // declaracion del arreglo del tamaño n

        int n = (int) (Math.random() * (30 - 15)) + 15;
        int[] a = new int[n];

        // Estructura para llenar el arreglo con números aleatorios entre x - y
        // llenar el arreglo con numeros comprendidos entre 20 y -20
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (20 + 20)) - 20;
        }
         //mostrar el arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.print("|" + a[i]);
        }
        System.out.println();

        // se va a recorrer el arreglo para determinar cuantos numeros son positivos,
        // negativos y 0
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                contadorPositivos++;
            } else if (a[i] < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }
        // CREAR LOS TRES ARREGLOS QUE ALMACENARA LOS NUMEROS POSITIVOS, NEGTAIVOS Y 0
        int[] positivos = new int[contadorPositivos];
        int[] negativos = new int[contadorNegativos];
        int[] ceros = new int[contadorCeros];

        // guarar los elementos que corresponden a cada arreglo
        int j = 0;
        int k = 0;
        int q = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positivos[j] = a[i];
                j++;
            } else if (a[i] < 0) {
                negativos[k] = a[i];
                k++;
            } else {
                ceros[q] = a[i];
                q++;
            }

        }
        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
        System.out.println(Arrays.toString(ceros));
    }
}
