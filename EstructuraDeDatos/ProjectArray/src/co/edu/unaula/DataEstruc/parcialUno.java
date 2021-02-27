package co.edu.unaula.DataEstruc;

import java.util.Scanner;
import java.util.regex.*;

public class parcialUno {
    public Scanner input = new Scanner(System.in);
    String matrixPokemon[][];
    String matrixPerson[][];

    // Llenando matrices pokemon y personas con sus titulos
    public static  void fillRowAndColumnsZero() {
        parcialUno matrix = new parcialUno();

        matrix.matrixPokemon = new String[2][7];
        matrix.matrixPerson = new String[2][5];

        matrix.matrixPokemon [0][0] = "Identificador";
        matrix.matrixPokemon [0][1] = "Pokemon";
        matrix.matrixPokemon [0][2] = "Tipo";
        matrix.matrixPokemon [0][3] = "Ataque";
        matrix.matrixPokemon [0][4] = "Defensa";
        matrix.matrixPokemon [0][5] = "Desventaja";
        matrix.matrixPokemon [0][6] = "Ventaja";

        matrix.matrixPerson [0][0] = "Cedula";
        matrix.matrixPerson [0][1] = "Identificador";
        matrix.matrixPerson [0][2] = "Resultado";
        matrix.matrixPerson [0][3] = "Desventaja";
        matrix.matrixPerson [0][4] = "Ventaja";

        parcialUno getMethod = new parcialUno();
        getMethod.fillingArrays(matrix.matrixPokemon, matrix.matrixPerson);
    }

    // Llenar matriz pokemon validando datos;
    public static void fillingArrays (String matrixPokemon[][], String matrixPerson[][]) {
        parcialUno get = new parcialUno();
try {
    for(int x = 1; x < matrixPokemon.length; ++x) {
        matrixPokemon[x][0] = x - 1 + "P";
        for(int y = 1; y < matrixPokemon[x].length; ++y) {
switch (y) {
    case 1:
        System.out.printf("ingrese el Pokemon:  \n");
        String value = get.input.nextLine();
        if(validationStrings(value)) {
            matrixPokemon[x][y] = value;
        } else {
            System.out.println("El dato ingresado es incorrecto solo se permiten letras");
            System.exit(0);
        }
        break;

    case 2:
        System.out.printf("ingrese el tipo:  \n");
         value = get.input.nextLine();
        if(validationStrings(value)) {
            matrixPokemon[x][y] = value;
        } else {
            System.out.println("El dato ingresado es incorrecto solo se permiten letras");
            System.exit(0);
        }
        break;

    case 3:
        System.out.printf("ingrese el ataque:  \n");
        value = get.input.nextLine();
        if(validationInt(value)) {
            matrixPokemon[x][y] = value;
        } else {
            System.out.println("El dato ingresado es incorrecto solo se permiten números");
            System.exit(0);
        }
        break;

    case 4:
        System.out.printf("ingrese la defensa:  \n");
        value = get.input.nextLine();
        if(validationInt(value)) {
            matrixPokemon[x][y] = value;
        } else {
            System.out.println("El dato ingresado es incorrecto solo se permiten números");
            System.exit(0);
        }
        break;

    case 5:
        System.out.printf("ingrese la desventaja:  \n");
        value = get.input.nextLine();
        if(validationStrings(value)) {
            matrixPokemon[x][y] = value;
        } else {
            System.out.println("El dato ingresado es incorrecto solo se permiten letras");
            System.exit(0);
        }
        break;

    case 6:
        System.out.printf("ingrese la ventaja:  \n");
        value = get.input.nextLine();
        if(validationStrings(value)) {
            matrixPokemon[x][y] = value;
        } else {
            System.out.println("El dato ingresado es incorrecto solo se permiten letras");
            System.exit(0);
            }
        }
    }
}

    printMatriz(matrixPokemon);
    parcialUno getMethod = new parcialUno();
    getMethod.searchPersonAndPokemon(matrixPokemon, matrixPerson);
}
    catch (Exception e) {
    System.out.printf("algo a fallado en el programa el error detectado es: " + e);
    System.exit(0);
            }

    }

 // Validando Strings
     static boolean validationStrings(String value) {
         String regex = "^[A-Za-z]\\w{2,10}$";
         Pattern p = Pattern.compile(regex);

         if (value == null) {
             return false;
         }
         Matcher m = p.matcher(value);

         return m.matches();
     }

     // Validando int
    static boolean validationInt(String value) {
        String regex = "^(0|[1-9][0-9]*)$";
        Pattern p = Pattern.compile(regex);

        if (value == "") {
            return false;
        }
        Matcher m = p.matcher(value);

        return m.matches();
    }

    public static void searchPersonAndPokemon(String matrixPokemon[][], String matrixPerson[][]) {

        String defenPerson = "";
        String atackPerson = "";
        String venjaPerson = "";
        String desventajaPerson ="";
        String cCConvert = "";

        parcialUno get = new parcialUno();
        String Cc = "";
        System.out.printf("ingrese su cedula:  \n");
        String value = get.input.nextLine();
        if(validationInt(value)) {
            Cc = value;
        } else {
            System.out.println("El dato ingresado es incorrecto solo se permiten números");
            System.exit(0);
        }


try {
    for(int x = 0; x < matrixPokemon.length; ++x) {
         cCConvert = Cc.substring(Cc.length() - 1);
         cCConvert = cCConvert + "P";
        for(int y = 0; y < matrixPokemon[x].length; ++y) {
                if(cCConvert.equals(matrixPokemon[x][0])) {
                    switch (y) {
                        case 3:
                            atackPerson =  matrixPokemon[x][y];
                            break;
                        case 4:
                            defenPerson =  matrixPokemon[x][y];
                            break;
                        case 5:
                            desventajaPerson =  matrixPokemon[x][y];
                            break;
                        case 6:
                            venjaPerson =  matrixPokemon[x][y];
                    }
                }
            }
        }

    if(venjaPerson != "") {
        parcialUno getMethod = new parcialUno();
        getMethod.fillArrayPerson(value, cCConvert, atackPerson, defenPerson, venjaPerson, desventajaPerson, matrixPerson);
    } else {
        System.out.printf("la cedula ingresada no tiene datos asociados");
        System.exit(0);
    }


} catch (Exception e) {
    System.out.printf("algo a fallado en el programa el error detectado es: " + e);
    System.exit(0);
}

    }

    static  void fillArrayPerson(String cC, String identifier, String atack, String defend, String vetaja, String desventaja, String matrixPerson[][]) {
        try {
            for(int x = 1; x < matrixPerson.length; ++x) {
                for(int y = 0; y < matrixPerson[x].length; ++y) {
                    switch (y) {
                        case 0:
                            matrixPerson[x][y] = cC;
                            break;
                        case 1:
                            matrixPerson[x][y] = identifier;
                            break;
                        case 2:
                            if(Integer.parseInt(defend) > Integer.parseInt(atack)) {
                                matrixPerson[x][y] =  Double.toString((double)Integer.parseInt(defend) - Math.pow((double)Integer.parseInt(atack), 2.0D));
                            } else {
                                matrixPerson[x][y] =  Double.toString((double)Integer.parseInt(defend) - Math.pow((double)Integer.parseInt(atack), 4.0D));
                            }
                            break;
                        case 3:
                            matrixPerson[x][y] = desventaja;
                            break;
                        case 4:
                            matrixPerson[x][y] = vetaja;
                    }
                    }
                }
            printMatriz(matrixPerson);
        }
        catch (Exception e) {
                    System.out.printf("algo a fallado en el programa el error detectado es: " + e);
                    System.exit(0);
        }
    }


    static void printMatriz(String[][] matriz) {
        for(int x = 0; x < matriz.length; ++x) {
            System.out.print("|");

            for(int y = 0; y < matriz[x].length; ++y) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }

            System.out.println("|");
        }

    }

}
