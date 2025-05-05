package Semana12;

public class PDFConverter extends Converter {

    private String rutarchivo;

    public PDFConverter(String document, String rutarchivo) {
        super(document);
        this.rutarchivo = rutarchivo;
    }

    public void makeLine() {
        System.out.println("makeLine PDF");
    }

    public void makeParagraph() {
        System.out.println("makeParagraph PDF");
    }

    public void makeTable() {
        System.out.println("makeTable PDF");
    }
}
