import java.util.Scanner;

public class LoginEquals{
  public static void main(String args[]){
   
   String Usuario = "DjEmmus";
   String Contraseña = "12345678";

   Scanner Emmus = new Scanner(System.in);
    
   System.out.println("Ingrese su Nombre de Usuario");
   String Usuario1 = Emmus.nextLine();

   System.out.println("Por favor ingresa la contraseña");
   String Contraseña1 = Emmus.nextLine();

   if(Usuario.equals(Usuario1) && Contraseña.equals(Contraseña1)){
      System.out.println("Login Correcto");
   }else{
      System.out.println("Login Incorrecto");
   }
  
  }
}