package Semana12;

public class EjecutarConverter {
    public static void main(String[] args) {
        Converter ASCII = new ASCIIConverter("Libro", "c:libros");
        Converter PostScript = new PostScripstConverter("Libro", "c:libros");
        Converter PDF = new PDFConverter("Libro", "c:libros");

        Reader Lector = new Reader("line", PDF);
        
        Lector.parseInput();


    }


        
    
}
