package co.edu.unaula.DataEstruc;

import java.util.Scanner;

public class unoUnoTres {
    //R.A. que rellene una matriz de N filas y M columnas con la suma de sus índices
    // (Es decir matriz[1][1] = 1+1 = 2, matriz [3][2] = 3 + 2 = 5).
    //El algoritmo mostrará la matriz resultante por pantalla.
    //Nota: N y M son valores que el usuario debe ingresar

    public static void exerciseThree() {

        Scanner input = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        int matrix[][];
        double accumulator = 0;

        System.out.println("Ingrese el numero de filas de la matriz");
        rows = input.nextInt();

        System.out.println("Ingrese el numero de columnas de la matriz");
        columns = input.nextInt();

        matrix = new int[rows][columns];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                System.out.printf("ingrese el valor de la fila %d y la  columna %d: ", x, y);
                matrix[x][y] = input.nextInt();
            }
        }

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                accumulator =  x + y;
            }
            System.out.println("el valor del indice " + x + " es:" + accumulator);
            accumulator = 0;
        }

    }
}
