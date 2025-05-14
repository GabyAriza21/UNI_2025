package JuegoPoo;

public class Main2 {
    public static void main(String[] args) {
        
        Topping topping3 = new Topping("Coco rayado", 57);
        Topping topping4 = new Topping("Salsa de pistacho", 20);


        HeladoCono helado1 = new HeladoCono("Helado de fresa", 100, topping3);
        HeladoCono helado2 = new HeladoCono("Helado de yogurth", 100, topping4);

        helado1.activarEscudo();
        LuchaJuego lucha = new LuchaJuego(helado1, helado2);

        lucha.iniciarPelea();
    }
}
