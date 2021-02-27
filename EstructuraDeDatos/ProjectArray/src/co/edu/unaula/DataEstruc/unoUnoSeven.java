package co.edu.unaula.DataEstruc;

import java.util.Scanner;

public class unoUnoSeven {
    // R.A. que llene una matriz, de una matriz de N filas y M columnas, con números ingresados por el usuario,
    // luego muestre la cantidad de números pares e impares que hay por cada columna.
    public static void exerciseSeven() {

        Scanner input = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        int matrix[][];
        int positionColumn = 0;

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
            int numPairs = 0;
            int numOdd = 0;
            for (int y = 0; y < columns; y++) {
                if(matrix[x][y]%2 == 0) {
                   numPairs = numPairs + 1;
                }
                else {
                    numOdd = numOdd + 1;
                }
            }

            System.out.println("la cantidad de numeros pares en la columna " + positionColumn +  " es:" + numPairs + " \n");
            System.out.println("la cantidad de numeros impares en la columna " + positionColumn +  " es:" + numOdd + "  \n\n");
        }
    }
}
