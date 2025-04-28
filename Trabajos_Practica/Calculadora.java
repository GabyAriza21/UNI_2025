package Trabajos_Practica;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        float Numero1 = 1;
        float Numero2 = 1;
        int operacion = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número: ");
        Numero1 = sc.nextFloat();
        System.out.println("Segundo número: ");
        Numero2 = sc.nextFloat();
        System.out.println("Operación: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir");
        operacion = sc.nextInt();

        Operaciones operaciones = new Operaciones(Numero1, Numero2);
        float resul = 0;
        switch (operacion){
            case 1:
                resul = operaciones.suma();
                System.out.println("La suma es: " + resul);
                break;
            case 2:
            resul = operaciones.resta();
            System.out.println("La resta es: " + resul);
                break;
            case 3:
            resul = operaciones.multiplicacion();
            System.out.println("La multiplicación es: " + resul);
                break;
            case 4:
                if (Numero2 != 0) {
                    resul = operaciones.division();
                System.out.println("La divison es: " + resul);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                sc.close();
        }
    }

}
