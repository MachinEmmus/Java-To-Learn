package unaula.edu.co;

//R.A. Que solicite el nombre y la edad de un grupo de estudiantes. Almacenelos en una matriz y luego determine quien ese el mayor y quien es el menor. Muestre un mensaje indicando el nombre y la edad de cada uno

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[][] students;
        int cantStudents;
        Scanner scan = new Scanner(System.in);

        System.out.println("Cuántos estudiantes tienes en la clase");
        cantStudents = scan.nextInt();

        students = new String[cantStudents][2];



        for(int i = 0; i < cantStudents; i++){
            System.out.println("Ingrese el nombre del estudiante " + (i+1));
            students[i][0] = scan.next();
            System.out.println("Ingrese la edad del estudiante " + (i+1));
            students[i][1] = scan.next();
        }
        System.out.println("Nombre     |     Edad");
        for (int j = 0; j < cantStudents; j++){




            System.out.println(students[j][0] + "|" + students[j][1]);
        }





    }
}
