public class Promedio{
  public static void main(String args[]){

   float matematicas = 5;
   float biologia = 8;
   float espa�ol = 7;
   float promedio = 0;

   promedio = (matematicas+biologia+espa�ol)/3;

   if(promedio >= 6){
   System.out.println("El alumno aprobo con un promedio de: "+promedio);
   }else{
   System.out.println("El alumno NO aprobo con un promedio de: "+promedio);
   }
 }
}