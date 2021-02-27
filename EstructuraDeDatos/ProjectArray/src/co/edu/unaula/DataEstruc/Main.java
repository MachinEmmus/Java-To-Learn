package co.edu.unaula.DataEstruc;

import java.util.Scanner;

//public class Main {
    public class Main {
        public static void main(String[] args) {
            long TInicio, TFin, tiempo;           //Para determinar el tiempo
            TInicio = System.currentTimeMillis(); //de ejecución
            parcialUno ejercicio = new parcialUno();
            ejercicio.fillRowAndColumnsZero();
            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
        }
    }
//}
