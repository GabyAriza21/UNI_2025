package Estruc_Datos.Clase3;

public class EjecutarLibro {
    public static void main(String[] args){
        Libro[] L = new Libro[5];

        L[0] = new Libro("100 años de soledad", "Gabriel Garcia Marquez", 50000);
        L[1] = new Libro("El amor en los tiempos del colera", "Gabriel Garcia Marquez", 60000);
        L[2] = new Libro("Cien años de perdon", "Isabel Allende", 40000); 
        L[3] = new Libro("La casa de los espiritus", "Isabel Allende", 45000);
        L[4] = new Libro("El principito", "Antoine de Saint", 30000);
        
    }
}
