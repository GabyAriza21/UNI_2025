package Semana3_4;
public class Arreglos2 {
    public static void main(String[] args) {
        // ejercicio2
        // se tienen N empleados de una compañia y se ha ideado llenar un
        // arreglo lineal A con sueldos de los empleados, un arreglo B con las
        // asignaciones tottales de cada empleado, un arreglo C con las deducciones 
        // de cada uno. Crear un arreglo T que contenga el neto a pagar a cada empleado
        // (neto a pagar = sueldo + asignaciones - deducciones)

        // todos los arreglos deben ser del mismo tamaño 
        // sueldo empleados
        double [] A = {1000.0, 1344.0, 3456.0}; //double es para los numeros decimales
        // asignaciones
        double [] B = {100.0, 250.0, 420.0};
        // deducciones
        double [] C = {20.0, 30.0, 10.0};

        // Arreglo que alamacena el neto a pagar a cada empleado. ej a.length -> 3
        double[] T = new double[A.length];
        // asignacion de la formula a cada posicion del arreglo T 
        for (int i = 0; i < T.length; i++) {
            T[i] = A[i] + B[i] - C[i];
        }
        //mostrar el neto a pagar de los empleados
        for (int i = 0; i < T.length; i++){
            System.out.println("T[" + "]=" + T[i]);
        }
    }
}