
// Esta clase permite leer la entrada de datos por teclado
import java.util.Scanner;

public class parkingNow {
    public static void main(String[] args) {

        // Creacion objeto Scanner, llamado leer que permite
        // leer los datos ingresados por teclado
        Scanner leer = new Scanner(System.in);

        // Creación de un arreglo (parqueadero) de 20 posiciones
        String[] motos = { "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_",
                "_", "_" };

        // creacion variable continuar de tipo boolean
        // para conrolar el bucle del menu
        boolean continuar = true;

        // Creacion variable opcion, que almacena la eleccion que
        // el ususario hace en el menu
        int opcion = 0;

        // Creacion bucle Do-While para mostrar el menu hasta que el usuario
        // ingrese la opcion de salir
        do {

            // Mostrar el menu y Pedir al usuario que opción del menú desea.
            System.out.println(" Digite la opción que desea...\n" +
                    "1. Registro de Motos.\n" +
                    "2. Cobro parquedero.\n" +
                    "3. Salir");

            // la opcion que el usuario ingrese se almacena en esta variable
            opcion = leer.nextInt();

            // Dependiendo de lo que el usuario elija,
            // swich ejecuta la opcion correspondiente
            switch (opcion) {
                case 1:

                    // Aqui se recorre el arreglo motos y muestra su contenido
                    // en una sola linea
                    for (int i = 0; i < motos.length; i++) {
                        System.out.print(motos[i] + " ");
                    }

                    System.out.println();

                    // Se le pide al usuario que dijite la posicion
                    // en la que desea parquear la moto
                    System.out.println("Digite la posición que desea parquear la moto");
                    int posicion = leer.nextInt();

                    // validar que el usuario no digite números menores a cero ni mayores que 20
                    if (posicion < 0 || posicion > 20) {
                        System.out.println("La posición que digitó esta por fuera de los rangos");
                        break;
                    }

                    // Se valida si la posicion esta vacia y se asignar la moto a la posición
                    // digitada por el usuario
                    if (motos[posicion - 1].equals("_")) {
                        motos[posicion - 1] = "M";
                        System.out.println("Su moto ha sido asignada a la posicion # " + posicion);
                    } else {
                        System.out.println("Espacio no disponible");
                    }

                    // Mostrar el parqueadero actualizado
                    for (int i = 0; i < motos.length; i++) {
                        System.out.print(motos[i] + " ");
                    }

                    break;
                case 2:

                    // Se le pide al usuario ingresar el tiempo que su mot estuvo estacionada
                    System.out.println("Ingrese el tiempo en parqueadero: ");
                    int tiempo = leer.nextInt();

                    // Se da un condicional, dependiendo del valor ingresado por el usuario
                    // se mostrara un mensaje con el valor a pagar
                    if (tiempo <= 30) {
                        System.out.println("El valor a pagar es %0.");
                    } else if (tiempo >= 31 && tiempo <= 60) {
                        System.out.println("El valor a pagar es de $800.");
                    } else {
                        System.out.println("El valor a pagar es de $2000.");
                    }
                    break;

                // Aqui se da lugar a que si el usuario ingresa un numero diferente de 1 y 2,
                // el continuar se cambia a false, lo que termina el bucle y sale del programa
                default:
                    continuar = false;
                    break;
            }

        } while (continuar);

        leer.close();

    }
}
