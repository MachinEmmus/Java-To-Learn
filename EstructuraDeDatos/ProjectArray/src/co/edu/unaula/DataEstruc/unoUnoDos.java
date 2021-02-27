package co.edu.unaula.DataEstruc;

import java.util.Scanner;

public class unoUnoDos {

    //R.A. que permita a un usuario ingresar su nombre y su edad al finalizar de ingresar todos los usuarios
    //(1.600 en total) calcule la edad promedio y muestre esta edad en pantalla.

    public static void exerciseTwo() {
        Scanner input = new Scanner(System.in);
        int rows = 1600;
        int columns = 2;
        double accumulator = 0;
        double average = 0;
        String arrayPerson[][] = new String[rows][columns];

        for (int x=0; x < arrayPerson.length; x++) {
            for (int y=0; y < arrayPerson[x].length; y++) {
                if( x == 0 && y == 0 || x == 0 && y == 1) {
                    switch (y) {
                        case 0 :
                            System.out.printf("ingrese su nombre: %d %d ", x, y);
                            arrayPerson[x][y] = input.next();
                            break;
                        case 1 :
                            System.out.printf("ingrese su edad: %d %d ", x, y);
                            arrayPerson[x][y] = input.next();
                    }
                } else {
                    switch (y) {
                        case 0 :
                            int  numArray = x + y;
                            arrayPerson[x][y] = ("pepito number " + numArray);
                            break;
                        case 1 :
                            double numX= (int) (Math.random()*90)+1;
                            arrayPerson[x][y] = String.valueOf(numX);
                    }

                }
            }

        }

        for (int x = 0; x < rows; x++) {

            for (int y = 0; y < columns; y++) {
                switch (y) {
                    case 0 :

                        break;
                    case 1 :
                        accumulator = accumulator + (Integer.parseInt(arrayPerson[x][y]));
                }

            }
            average = accumulator/columns;
            System.out.printf("la edad promedio de esta vaina es: " + average);
        }

    }

}
