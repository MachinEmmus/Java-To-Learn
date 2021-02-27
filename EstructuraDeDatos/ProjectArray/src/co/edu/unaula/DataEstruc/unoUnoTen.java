package co.edu.unaula.DataEstruc;

import java.util.Scanner;

public class unoUnoTen {

    public static void exerciseTen() {

        Scanner input = new Scanner(System.in);
        int rows = 1;
        int columns = 6;
        String matrix[][] = new String[rows][columns];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                switch (y) {
                    case 0 :
                        System.out.printf("ingrese el nombre del estudiante %d: ", x);
                        matrix[x][y] = input.next();
                        break;
                    case 1 :
                        System.out.printf("ingrese la nota del 20 del estuidante %d: ", x);
                        matrix[x][y] = input.next();
                        break;
                    case 2:
                        System.out.printf("ingrese la nota del 8 del estuidante %d: ", x);
                        matrix[x][y] = input.next();
                        break;
                    case 3:
                        System.out.printf("ingrese la nota del 25 del estuidante %d: ", x);
                        matrix[x][y] = input.next();
                        break;
                    case 4:
                        System.out.printf("ingrese la nota del 33 del estuidante %d: ", x);
                        matrix[x][y] = input.next();
                        break;
                    case 5:
                        System.out.printf("ingrese la nota del 14 del estuidante %d: "+ " \n", x );
                        matrix[x][y] = input.next();
                        break;
                }
            }
        }

        for (int x = 0; x < rows; x++) {
            String nameStudent = "";
            int note1 = 0;
            int note2 = 0;
            int note3 = 0;
            int note4 = 0;
            int note5 = 0;
            int noteDefinitive = 0;
            for (int y = 0; y < columns; y++) {
                switch (y) {
                    case 0 :
                        nameStudent = matrix[x][y];
                        break;
                    case 1 :
                        note1 = Integer.parseInt(matrix[x][y])  * 20;
                        break;
                    case 2:
                        note2 = Integer.parseInt(matrix[x][y])  * 8;
                        break;
                    case 3:
                        note3= Integer.parseInt(matrix[x][y])  * 25;
                        break;
                    case 4:
                        note4 = Integer.parseInt(matrix[x][y])  * 33;
                        break;
                    case 5:
                        note5 = Integer.parseInt(matrix[x][y])  * 14;
                        break;
                }
            }

            noteDefinitive = (note1 + note2 + note3 + note4 + note5)/100;
            if(noteDefinitive >= 3) {
                System.out.printf("la nota definitiva del estudiante " + nameStudent + " es: " + noteDefinitive  +" y aprobo la materia" +" \n");
            } else {
                System.out.printf("la nota definitiva del estudiante " + nameStudent + " es: " + noteDefinitive  +" y no aprobo la materia" +" \n");
            }

        }

    }
}
