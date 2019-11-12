public class Anidadas{
  public static void main(String args[]){
    
   int operacion =3;
   int num1 =8;
   int num2 =4;
   int resultado = 0;

   if(operacion ==1){
      resultado = num1 + num2;
      System.out.println("El resultado de la suma es: "+resultado);
   }else if(operacion ==2){
      resultado = num1 - num2;
      System.out.println("El resultado de la resta es: "+resultado);
   }else if(operacion ==3){
      resultado = num1 * num2;
      System.out.println("El resultado de la multiplicación es: "+resultado);
   }else if(operacion ==4){
      resultado = num1 / num2;
      System.out.println("El resultado de la division es: "+resultado);
   }else{
      System.out.println("No elegiste ninguna opcion correcta");
   }
  }
}