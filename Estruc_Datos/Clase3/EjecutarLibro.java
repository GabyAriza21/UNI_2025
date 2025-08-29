package Estruc_Datos.Clase3;

public class EjecutarLibro {
    public static void main(String[] args) {
        Libro[] L = new Libro[5];

        L[0] = new Libro("100 años de soledad", "Gabriel Garcia Marquez", 50000);
        L[1] = new Libro("El amor en los tiempos del colera", "Gabriel Garcia Marquez", 60000);
        L[2] = new Libro("Cien años de perdon", "Isabel Allende", 40000);
        L[3] = new Libro("La casa de los espiritus", "Isabel Allende", 45000);
        L[4] = new Libro("El principito", "Antoine de Saint", 30000);

        System.out.println("Lista libros:");
        for (Libro libro : L) {
            System.out.println(libro);
        }

        int total = calcularPrecioTotal(L);
        System.out.println("El precio total de los libros es: " + total);

        System.out.println("Libros con precio mayor a 45000:");
        Libro[] resultado = filtrarPorPrecio(L, 45000);
        for (Libro libro : resultado) {
            System.out.println(libro);
        }

        ordenarPorPrecio(L);
        System.out.println("Libros ordenados por precio (menor a mayor):");
        for (Libro libro : L) {
            System.out.println(libro);
        }
    }

    public static int calcularPrecioTotal(Libro[] libros) {
        int suma = 0;
        for (int i = 0; i < libros.length; i++) {
            suma += libros[i].getPrecio();
        }
        return suma;
    }

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
