import java.util.Scanner;

public class VectoresDinamicos{
  public static void main(String args[]){
   
   Scanner Emmus = new Scanner(System.in);
   int Longitud = 0;

   System.out.print("Cuantos n�meros deseas ingresar");
   Longitud = Emmus.nextInt();

   int Numeros[] = new int[Longitud];
   for(int i = 0; i < Numeros.length; i++)
   {
      System.out.println("Por favor dame el valor del número " + (i+1));
      Numeros[i] = Emmus.nextInt();
   }
   for(int i = 0; i < Numeros.length; i++)
   {
      System.out.print("[" + Numeros[i] + "]");
   }
  }
}