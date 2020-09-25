package co.unaula.estructuraDatos;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 2;

        System.out.println("Bienvenido a mi programa");
        System.out.println("En el cual se elevará el 2 a pontencia que desee, ingrese un numero entero: ");

        int numPotencia = Integer.parseInt(scan.nextLine());

        double result = Math.pow(number,numPotencia);

        if(numPotencia == 0){
            result = 1.0;
            System.out.println("El resultado de 2 elevado "+ numPotencia + " = "+result);
        }else if(numPotencia < 0){
            System.out.println("El número debe ser positivo, mayor que 0");
        }if(numPotencia>0){
            System.out.println("El resultado de 2 elevado "+ numPotencia + " = "+result);
        }
    }

}
