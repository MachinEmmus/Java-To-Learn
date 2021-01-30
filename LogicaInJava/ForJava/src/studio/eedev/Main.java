package studio.eedev;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Main {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        //1. Determinar cuántos números pares hay entre 1 y 100
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0) count++;
        }
        System.out.println("Entre 1 y 100 hay: "+ count + " números pares.");

        // 2. Realice un algoritmo que solicite 700 números y determine cuáles números son primos


        // 3. Realice un algoritmo que calcule el factorial de un número

        System.out.println("El factorial de 5 es: "+ factorial(5));

        // 4. Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10,
        // es decir, 1 + 2 + 3 + …. + 10.

        int suma = 0;
        for(int i = 1; i <=10; i++){
            suma += i;
        }

        System.out.println("La sumas de los numeros entre 1 y 10 es: " + suma);

        // 5. Realice un algoritmo que pregunte al usuario la cantidad de números que quiere digitar
        // e indique cuál es el menor y cuál es el mayor.

        System.out.println("Cuantos números deseas Ingresar");
        int num = sc.nextInt();
        int min = 2147483647;
        for(int i = 0; i < num; i++){
            System.out.println("Por favor ingrese el número "+ (i + 1));
            int ans = sc.nextInt();
            if(ans < min){
                min = ans;
            }
        }
        System.out.println("El número menor ingresado es: " + min);
    }

    // función que me retorna el factorial
    public static int factorial(int num){
        int value = 1;
        for (int i = num; i > 0; i--){
            value *= i;
        }
        return value;
    }
}
