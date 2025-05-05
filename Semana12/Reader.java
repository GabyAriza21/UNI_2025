package Semana12;

public class Reader {
    
    private String element;
    private Converter converter;

    public Reader(String element, Converter converter) {
        this.element = element;
        this.converter = converter;
    }

    public String getElement() {
        return element;
    }

    public void parseInput(){
        switch (element) {
            case "line":
                converter.makeLine();
                break;
            case "paragraph":
                converter.makeParagraph();
                break;
            case "table":
                converter.makeTable();
                break;
            default:
                System.out.println("Unknown element");
        }
    }

}
