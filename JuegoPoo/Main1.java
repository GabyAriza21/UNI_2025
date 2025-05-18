package JuegoPoo;

public class Main1 {
    public static void main(String[] args) {
        
        // se crean los toppings para cada helado
        Topping topping1 = new Topping("Chispas de chocolate", 5);
        Topping topping2 = new Topping("Mango", 10);

        
         HeladoCono helado1 = new HeladoCono("Helado de chocolate", 100, topping1);
         HeladoPaleta helado2 = new HeladoPaleta("helado de mango biche", 100, topping2);

         LuchaJuego lucha = new LuchaJuego(helado1, helado2);
         lucha.iniciarPelea(); 


    }
}
