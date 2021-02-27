package co.edu.unaula.DataEstruc;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class unoUnoUno {

/* Realice un algoritmo (R.A) que pregunta a un usuario por una cantidad de filas y una cantidad de columnas. Con este
dato debe inicializar una matriz; a continuación, debe solicitar que le ingresen números para llenar esa matriz.
Una vez la matriz esté llena determine cuál es el número mayor y el número menor de cada fila. Muestre en pantalla
estos valores indicando a qué fila pertenecen.*/

    public static void exerciseOne() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz");
        int rows = input.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        int columns = input.nextInt();
        int matrix[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("ingrese el valor de la fila %d y la  columna %d: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            int major = 0;
            int minor = 9999;
            System.out.printf("El valor mayor y menor de la fila %d es:\r\n", i);
            for (int j = 0; j < columns; j++) {
                if (major < matrix[i][j]) {
                    major = matrix[i][j];
                }
                if (minor > matrix[i][j]) {
                    minor = matrix[i][j];
                }
            }
            System.out.println("Mayor:" + major);
            System.out.println("Menor:" + minor);
        }
    }
}
