import java.util.Scanner;

public class Teclado{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int num1 = 0, num2 = 0, resultado = 0;

   System.out.println("¿Cuál es tu nombre?");
   nombre = in.nextLine();

   System.out.println("Dame el primer numero");
   num1 = in.nextInt();

   System.out.println("Dame el segundo numero");
   num2 = in.nextInt();
   
   resultado = num1 + num2;

   System.out.println("Hola "+nombre+" la suma da: "+resultado);
  }
}