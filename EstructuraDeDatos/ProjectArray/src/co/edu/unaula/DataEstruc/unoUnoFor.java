package co.edu.unaula.DataEstruc;

import java.util.Scanner;

public class unoUnoFor {
    // R.A. que llene una matriz, de una matriz de N filas y M columnas, con números ingresados por el usuario,
    // luego muestra la suma de cada fila. Nota: N y M son valores que el usuario debe ingresar


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
                accumulator = accumulator + matrix[x][y];
            }
            System.out.println("el valor acumulado de la fila " + x + " es:" + accumulator);
            accumulator = 0;
        }
    }
}
