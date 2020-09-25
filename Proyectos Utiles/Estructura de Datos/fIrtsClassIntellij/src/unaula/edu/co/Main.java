package unaula.edu.co;

import java.util.Scanner;

public class Main {

    /*
    * Realice un algorito que solicite el nombre y la edad de un grupo
    * de estudiantes. Almacenelos en una matriz y luego determine
    * quien es el mayor y quien es el menor.
    * Muestre un mensaje indicando el nombre y la edad de cada uno.
    * */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] nombres;
        int[][] edades;

        int cantNombres;

        System.out.println("Bienvenido a mi programa!!");
        System.out.println("¿Cuantos nombres desea ingresar?");
        cantNombres = scan.nextInt();

        nombres = new String[cantNombres][2];
        edades = new int[cantNombres][2];

        for(int i=0; i<cantNombres;i++){
            for(int j=0; j<2; j++){

                System.out.println("Por favor ingrese su nombre");
                nombres[i][j] = scan.next();
                System.out.println("Por favor ingrese su edad");
                edades[i][j]= scan.nextInt();

                System.out.println("Su nombre es "+nombres[i][j]);
                System.out.println("Su edad es "+edades[i][j]);
            }
        }

        /*
        int aux ;
        int mayor = 0, menor = 0;

        for(int k=0; k<cantNombres;k++){
            for (int l=0; l<2;l++) {

                aux = edades[k][l];

                if(aux > mayor){
                    mayor = aux;
                }else if(aux < menor) {
                    menor = aux;
                }
            }
        }
        System.out.println("El mayor es:" + mayor);
        System.out.println("El menor es:" + menor);
*/




        /* try{

            Scanner scan = new Scanner(System.in);

            int[][] numbers = new int[4][2];
            int[] results = new int[8];
            int count = 0;

            for(int i =0; i<4; i++){
                for (int j=0; j<2; j++){
                    System.out.println("Ingrese un numero");
                    numbers[i][j] = scan.nextInt();
                    results[count]= 2 + numbers[i][j];
                    System.out.println("El resultado "+ (count + 1 ) +" es "+ (2 + numbers[i][j]));
                    count++;
                }
            }

            System.out.println("Matriz Llenas");

        }catch (Exception ex){
            System.out.println("Revise los numeros ingresados");
        }
*/
    }

}
