package Estruc_Datos.Clase3;

public class EjecutarLibro {
    public static void main(String[] args) {
        Libro[] L = new Libro[5];

        L[0] = new Libro("100 años de soledad", "Gabriel Garcia Marquez", 50000);
        L[1] = new Libro("El amor en los tiempos del colera", "Gabriel Garcia Marquez", 60000);
        L[2] = new Libro("Cien años de perdon", "Isabel Allende", 40000);
        L[3] = new Libro("La casa de los espiritus", "Isabel Allende", 45000);
        L[4] = new Libro("El principito", "Antoine de Saint", 30000);

        // muestra todos los libros del arreglo
        System.out.println("Lista libros:");
        for (Libro libro : L) { // bucle for-each: recorre todo el arreglo
            System.out.println(libro); // llama al metodo toString()
        }

        // muestra el precio total de los libros
        int total = calcularPrecioTotal(L);
        System.out.println("El precio total de los libros es: " + total);

        // filtra los libros por precio mayor a 45000
        System.out.println("Libros con precio mayor a 45000:");
        Libro[] resultado = filtrarPorPrecio(L, 45000);
        for (Libro libro : resultado) {
            System.out.println(libro);
        }

        // ordena los libros por precio (menor a mayor)
        ordenarPorPrecio(L);
        System.out.println("Libros ordenados por precio (menor a mayor):");
        for (Libro libro : L) {
            System.out.println(libro);
        }
    }

    // metodo que calcula el precio total de los libros 
    public static int calcularPrecioTotal(Libro[] libros) {
        int suma = 0; // donde se acumula el total
        for (int i = 0; i < libros.length; i++) { // recorre la lista de libros
            suma += libros[i].getPrecio(); // suma el precio de cada libro
        }
        return suma;
    }

    //metodo que filtra los libros por precio mayor a un valor dado 
    public static Libro[] filtrarPorPrecio(Libro[] libros, int valor) {
        int contador = 0;
        for (Libro libro : libros) {
            if (libro.getPrecio() > valor) {
                contador++;
            }
        }

        Libro[] filtrados = new Libro[contador];
        int i = 0;
        for (Libro libro : libros) {
            if (libro.getPrecio() > valor) {
                filtrados[i] = libro;
                i++;
            }
        }

        return filtrados;
    }

    //metodo que ordena los libros por precio (menor a mayor) ordenamiento de burbuja
    public static void ordenarPorPrecio(Libro[] libros) {
        int n = libros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (libros[j].getPrecio() > libros[j + 1].getPrecio()) {
                    // Intercambiar
                    Libro temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                }
            }
        }
    }
}
