import java.util.Scanner;

public class LoginEquals{
  public static void main(String args[]){
   
   String Usuario = "DjEmmus";
   String Contrase�a = "12345678";

   Scanner Emmus = new Scanner(System.in);
    
   System.out.println("Ingrese su Nombre de Usuario");
   String Usuario1 = Emmus.nextLine();

   System.out.println("Por favor ingresa la contrase�a");
   String Contrase�a1 = Emmus.nextLine();

   if(Usuario.equals(Usuario1) && Contrase�a.equals(Contrase�a1)){
      System.out.println("Login Correcto");
   }else{
      System.out.println("Login Incorrecto");
   }
  
  }
}