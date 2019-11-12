public class Case{
  public static void main(String args[]){
    
   int num1 = 5, num2 = 3, resultado =0;
   int parametro = 3;
   //Switch solo acepta int o char   

   switch(parametro){
   
    case 1: resultado =  num1 + num2;
            System.out.println("El resultado de la suma es: "+resultado);
            break;

    case 2: resultado =  num1 - num2;
            System.out.println("El resultado de la resta es: "+resultado);
            break;   

    case 3: resultado =  num1 * num2;
            System.out.println("El resultado de la multiplicación es: "+resultado);
            break; 

    case 4: resultado =  num1 / num2;
            System.out.println("El resultado de la división es: "+resultado);
            break; 

    default: System.out.println("Error la opcion no existe");
             break;  

   }
  }
}