package co.edu.unaula.estructuradedatos;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long TInicio, TFin, tiempo;           //Para determinar el tiempo
        TInicio = System.currentTimeMillis(); //de ejecución
        Scanner input = new Scanner(System.in);
        String matrixPokemon[][] = new String[2][7];
        String matrixPerson[][] = new String[2][5];
        String matrixDatosTmp[][] = new String[1][6];

        for (int x = 0; x < matrixPokemon.length; x++) {
            for (int y = 0; y < matrixPokemon[x].length; y++) {
                switch (y) {
                    case 0:
                        if (x != 0){
                            matrixPokemon[x][y] = (x-1) + "P";
                        } else if (x == 0){
                            matrixPokemon[x][y] = "Identificador";
                        }
                        break;
                    case 1 :
                        if (x == 0){
                            matrixPokemon[x][y] = "Pokemon";
                        } else {
                            System.out.printf("ingrese el Pokemon: " + " \n");
                            matrixPokemon[x][y] = input.next();
                        }
                        break;
                    case 2:
                        if (x == 0){
                            matrixPokemon[x][y] = "Tipo";
                        } else {
                            System.out.printf("ingrese el Tipo: "+ " \n");
                            matrixPokemon[x][y] = input.next();
                        }
                        break;
                    case 3:
                        if (x == 0){
                            matrixPokemon[x][y] = "Ataque";
                        } else {
                            System.out.printf("ingrese el Ataque: " + " \n");
                            try {
                                matrixPokemon[x][y] = Integer.toString(input.nextInt());
                            } catch (Exception e) {
                                System.out.println("El dato ingresado es incorrecto debe ser de tipo entero");
                                exit(0);
                            }
                        }
                        break;
                    case 4:
                        if (x == 0){
                            matrixPokemon[x][y] = "Defensa";
                        } else {
                            System.out.printf("ingrese la Defensa: " + " \n");
                            try {
                                matrixPokemon[x][y] = Integer.toString(input.nextInt());
                            } catch (Exception e) {
                                System.out.println("El dato ingresado es incorrecto debe ser de tipo entero");
                                exit(0);
                            }
                        }
                        break;
                    case 5:
                        if (x == 0){
                            matrixPokemon[x][y] = "Desventaja";
                        } else {
                            System.out.printf("ingrese la Desventaja: " + " \n");
                            matrixPokemon[x][y] = input.next();
                        }
                        break;
                    case 6:
                        if (x == 0){
                            matrixPokemon[x][y] = "Ventaja";
                        } else {
                            System.out.printf("ingrese la Ventaja: " + " \n");
                            matrixPokemon[x][y] = input.next();
                        }
                }
            }
        }
        printMatriz(matrixPokemon);

        System.out.printf("ingrese su cedula: "+ " \n");
        try {
            matrixDatosTmp[0][0] = String.valueOf(input.nextInt());
        } catch (Exception e) {
            System.out.println("El dato ingresado es incorrecto debe ser de tipo entero");
            exit(0);
        }

        for (int x = 1; x < matrixPokemon.length; x++) {
            matrixDatosTmp[0][1] = matrixDatosTmp[0][0].substring(matrixDatosTmp[0][0].length() - 1);
            matrixDatosTmp[0][1] += "P";
            for (int y = 0; y < matrixPokemon[x].length; y++) {
                if(matrixPokemon[x][y].equals(matrixDatosTmp[0][1])) {
                    matrixDatosTmp[0][2] = matrixPokemon[x][3];
                    matrixDatosTmp[0][3] = matrixPokemon[x][4];
                    matrixDatosTmp[0][4] = matrixPokemon[x][5];
                    matrixDatosTmp[0][5] = matrixPokemon[x][6];
                    break;
                }
            }
        }

        for (int x = 0; x < matrixPerson.length; x++) {
            for (int y = 0; y < matrixPerson[x].length; y++) {
                switch (y) {
                    case 0 :
                        if(x == 0){
                            matrixPerson[x][y] = "Cédula";
                        } else {
                            matrixPerson[x][y] = matrixDatosTmp[0][0];
                        }
                        break;
                    case 1 :
                        if(x == 0){
                            matrixPerson[x][y] = "identificador";
                        } else {

                            matrixPerson[x][y] = matrixDatosTmp[0][1];
                        }
                        break;
                    case 2:
                        if(x == 0){
                            matrixPerson[x][y] = "Resultado";
                        } else {
                            if(Integer.parseInt(matrixDatosTmp[0][3]) > Integer.parseInt(matrixDatosTmp[0][2])){
                                matrixPerson[x][y] = Double.toString(Integer.parseInt(matrixDatosTmp[0][3]) - (Math.pow(Integer.parseInt(matrixDatosTmp[0][2]), 2)));
                            } else {
                                matrixPerson[x][y] = Double.toString(Integer.parseInt(matrixDatosTmp[0][3]) - (Math.pow(Integer.parseInt(matrixDatosTmp[0][2]), 4)));
                            }

                        }
                        break;
                    case 3:
                        if(x == 0){
                            matrixPerson[x][y] = "Desventaja";
                        } else {
                            matrixPerson[x][y] = matrixDatosTmp[0][4];
                        }
                        break;
                    case 4:
                        if(x == 0){
                            matrixPerson[x][y] = "Ventaja";
                        } else {
                            matrixPerson[x][y] = matrixDatosTmp[0][5];
                        }

                }
            }
        }
        printMatriz(matrixPerson);
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
    }

    static void printMatriz(String[][] matriz){
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}
