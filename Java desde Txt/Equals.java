import java.util.Scanner;

public class Equals{
  public static void main(String args[]){
   
   String Nombre1 = "";
   String Nombre2 = "";

   Scanner Emmus = new Scanner(System.in);
    
   System.out.println("Por favor ingresa el primer nombre");
   Nombre1 = Emmus.nextLine();

   System.out.println("Por favor ingresa el segundo nombre");
   Nombre2 = Emmus.nextLine();

   if(Nombre1.equalsIgnoreCase(Nombre2)){
      System.out.println("Los nombres son iguales");
   }else{
      System.out.println("Los nombres son distintos");
   }
  
  }
}