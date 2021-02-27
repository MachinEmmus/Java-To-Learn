package co.edu.unaula.estructuradedatos;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int filas = 0;
        int columnas = 0;
        int grant = 0;
        System.out.println("Ingrese por favor la cantidad de filas de su matriz");
        filas = sc.nextInt();
        System.out.println("Ingrese por favor la cantidad de columnas de su matriz");
        columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];

        int x;
        int y;
        for(x = 0; x < matriz.length; ++x) {
            for(y = 0; y < matriz[x].length; ++y) {
                System.out.println("Ingrese el valor de la matriz en la posición " + x + " " + y);
                matriz[x][y] = sc.nextInt();
            }
        }

        for(x = 0; x < matriz.length; ++x) {
            System.out.println();

            for(y = 0; y < matriz[x].length - 1; ++y) {
                if (matriz[x][y] > matriz[x][y + 1]) {
                    grant = matriz[x][y];
                } else {
                    grant = matriz[x][y + 1];
                }
            }

            System.out.println("El número mas grande de la fila " + (x + 1) + " es: " + grant);
        }
    }
}

