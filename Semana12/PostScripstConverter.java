package Semana12;

public class PostScripstConverter extends Converter {

    private String rutarchivo;

    public PostScripstConverter(String document, String rutarchivo) {
        super(document);
        this.rutarchivo = rutarchivo;
    }

    public void makeLine() {
        System.out.println("makeLine PostScripst");
    }
    
    public void makeParagraph() {
        System.out.println("makeParagraph PostScripst");
    }

    public void makeTable() {
        System.out.println("makeTable PostScripst");
    }
}
