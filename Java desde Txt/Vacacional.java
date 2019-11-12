import java.util.Scanner;

public class Vacacional{
  public static void main(String args[]){

   Scanner Entrada = new  Scanner(System.in);
   String Nombre = "";
   int Clave = 0;
   int Antiguedad = 0;

   System.out.println("**********************************");
   System.out.println("BIENVENIDO A TU SISTEMA VACACIONAL");
   System.out.println("**********************************");
   System.out.println();
   System.out.println();

   System.out.println("¿Cuál es el nombre del trabajador?");
   Nombre = Entrada.nextLine();
   System.out.println();

   System.out.println("¿Cuánto tiempo de servicio tiene el trabajador?");
   Antiguedad = Entrada.nextInt();
   System.out.println();

   System.out.println("¿Cuál es la clave del trabajador?");
   Clave = Entrada.nextInt();
   System.out.println();

   if(Clave == 1){

      if(Antiguedad == 1){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 6 días de vacaciones");
      }else if(Antiguedad >= 2 && Antiguedad <=6){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 14 días de vacaciones");  
      }else if(Antiguedad >= 7){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 20 días de vacaciones");
      }     

   }else if(Clave == 2){

      if(Antiguedad == 1){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 7 días de vacaciones");
      }else if(Antiguedad >= 2 && Antiguedad <=6){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 15 días de vacaciones");  
      }else if(Antiguedad >= 7){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 22 días de vacaciones");
      }

   }else if(Clave == 3){
       
      if(Antiguedad == 1){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 10 días de vacaciones");
      }else if(Antiguedad >= 2 && Antiguedad <=6){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 20 días de vacaciones");  
      }else if(Antiguedad >= 7){
      System.out.println("El trabajador "+Nombre+" tiene derecho a 30 días de vacaciones");
      }

   }else{
     System.out.println("La clave del departamento es incorrecta");
   }
  }
}