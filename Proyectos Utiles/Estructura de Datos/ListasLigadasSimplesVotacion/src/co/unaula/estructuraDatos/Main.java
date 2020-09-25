package co.unaula.estructuraDatos;

import co.unaula.estructuraDatos.list.List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List votacion = new List();
        boolean response;
        boolean firstNode;

        Scanner scan = new Scanner(System.in);

        System.out.println("!--- Bienvenido a mi programa ---!\n");
        System.out.println("!--- Sistema de votacion  ---!\n");
        System.out.println("El numero de mesas es: 100\n");

        firstNode = true;
        for(int i=1; i <=4; i++){
            System.out.println("Ingrese las cedulas para la mesa: "+i+"\n");

            if(firstNode = true){
                votacion.addNode("Mesa: "+1);
                firstNode = false;
            }

            System.out.println("Desea ingresar cedulas en la mesa: "+i+ "?");
            System.out.println("Por favor ingresa 1 para SI y 2 para NO");
            int questionCedula = Integer.parseInt(scan.nextLine());

            if(questionCedula == 1){
                System.out.println("Ingrese todas las cedulas!\n");
                System.out.println("Desea ingresar una cedula?");

                System.out.println("Por favor ingresar 1 para SI y 2 para NO");

                int otraCedula = Integer.parseInt(scan.nextLine());
                while (otraCedula == 1){
                    System.out.println("Ingresela!");
                    String addCedula = scan.nextLine();
                    votacion.addNode("Cedula: "+ addCedula);

                    System.out.println("Para ingresar otra cedula por favor ingresar 1 para SI y 2 para NO");
                    otraCedula = Integer.parseInt(scan.nextLine());
                }
            }else { votacion.addNode("Mesa: "+i);
            }
        }
        votacion.printNodes();
    }
}
