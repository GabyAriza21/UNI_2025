package JuegoPoo;

public class main {
    public static void main(String[] args) {
        Topping topping1 = new Topping("Chispas de chocolate", 5);
        Topping topping2 = new Topping("Caramelo", 3);



        HeladoCono heladoCono = new HeladoCono("Helado Cono", 100, "Cono de galleta", topping1);
        HeladoPaleta heladoPaleta = new HeladoPaleta("Helado Paleta", 100, "Paleta de chocolate", topping2);
        heladoCono.activarEscudo();

        LuchaJuego luchaJuego = new LuchaJuego(heladoCono, heladoPaleta);
        luchaJuego.iniciarPelea();

    }
}
        