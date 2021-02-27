package co.edu.unaula.estructuradedatos;
import  java.util.Scanner;

public class Punto2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] matriz = new String[5][2];
        String ans = "";
        double suma = 0.0D;

        int x;
        int y;
        for(x = 0; x < matriz.length; ++x) {
            for(y = 0; y < matriz[x].length; ++y) {
                if (y < 1) {
                    System.out.println("Ingrese Por favor su nombre y apellido");
                    ans = sc.nextLine();
                    matriz[x][y] = ans;
                } else {
                    System.out.println("Ingrese Por favor su promedio");
                    ans = sc.nextLine();
                    matriz[x][y] = ans;
                }
            }
        }

        for(x = 0; x < matriz.length; ++x) {
            for(y = 1; y < matriz[x].length; ++y) {
                suma += Double.parseDouble(matriz[x][y]);
            }
        }

        System.out.println("El promedio de todos los estudiantes es igual a: " + suma / (double)matriz.length);
    }
}
