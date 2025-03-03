import java.util.Scanner;

public class parkingNow{
    public static void main(String[] args) {
    boolean [] Puestos = new boolean[20];

    for (int i = 0; i < Puestos.length; i++){
        Puestos[i] = false;
    }
    // mostrar disponibilidad de los puestos 
    System.out.println("Estado puestos moto: ");
    for (int i = 0; i < Puestos.length; i++){
        if (Puestos[i]){
            System.out.println("Puesto " + (i + 1)+ " : ocupado"); // (i toma el valor dependiendo del elemento del arreglo de Puestos)
        } else {
            System.out.println("Puesto " + (i + 1)+ " : disponible");
        }

        //ocupar puestos con las motos 
        System.out.println("Puestso ocuados: ");
        Scanner leer = new Scanner(System.in);
    }
    }
}
    