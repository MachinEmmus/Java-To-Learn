package co.edu.unaula.DataEstruc;

import java.util.Scanner;

public class unoUnoEight {

    public static void exerciseSEight() {

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
            int numMulti = 0;
            int numDontMulti = 0;
            int numAccumulator = 0;
            int resto;
            for (int y = 0; y < columns; y++) {
                resto = numAccumulator%matrix[x][y];
                numAccumulator = matrix[x][y];
                if (resto == 0) {
                    numMulti = numMulti + 1;
                } else {
                    numDontMulti = numDontMulti + 1;
                }
            }

            System.out.println("la cantidad de numeros multiplos en la columna " + positionColumn + " es:" + numMulti + " \n");
            System.out.println("la cantidad de numeros no multiplos en la columna " + positionColumn + " es:" + numDontMulti + "  \n\n");
        }
    }
}
