package Composicion_y_Agregacion;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1234567892, 1000.0); 

        Cliente cliente = new Cliente (1031650195, "Gaby");

        System.out.println(cuenta);
        System.out.println(cliente);

        Banco banco = new Banco(1,"Mi primer ahorro", cuenta);
        System.out.println(banco);

        banco.mostrarCliente(cliente);
    }

}
