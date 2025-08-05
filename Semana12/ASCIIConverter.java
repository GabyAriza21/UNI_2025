package Semana12;

public class ASCIIConverter extends Converter {

    private String ruta;

    public ASCIIConverter(String document, String ruta) {
        super(document);
        this.ruta = ruta;
    }

    public void makeLine(){
        System.out.println("makeLine ASCII");
         
    }

    public void makeParagraph(){
        System.out.println("makeParagraph ASCII");
    }

    public void makeTable(){
        System.out.println("makeTable ASCII");
    }



    
}
