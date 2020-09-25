package co.edu.unaula;

import co.edu.unaula.queues.QueuesSimpleList;
import co.edu.unaula.stacks.StackSimpleList;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StackSimpleList libros = new StackSimpleList();
        StackSimpleList revistas = new StackSimpleList();
        StackSimpleList periodicos = new StackSimpleList();
        StackSimpleList audioVisual = new StackSimpleList();


        QueuesSimpleList PrestarMaterial = new QueuesSimpleList();
        QueuesSimpleList DevolverMaterial = new QueuesSimpleList();
        QueuesSimpleList AyudaMaterialHistorico = new QueuesSimpleList();
        QueuesSimpleList SDPeriodicosHistoricos = new QueuesSimpleList();

        Scanner input = new Scanner(System.in);
        boolean program = true;
        int     control = 0;
        int     pila = 0;
        int     pila2 = 0;
        int     category = 0;
        int     category2 = 0;

        int     turnoF1 = 0;
        int     turnoF2 = 0;
        int     turnoF3 = 0;
        int     turnoF4 = 0;

        int     ctrlF1 = 0;
        int     ctrlF2 = 0;
        int     ctrlF3 = 0;
        int     ctrlF4 = 0;

        boolean filaBucle1 = true;
        boolean filaBucle2 = true;
        boolean filaBucle3 = true;
        boolean filaBucle4 = true;

        boolean apilar = true;
        boolean apilar2 = true;
        boolean mostrarPilas = true;
        boolean mostrarPilas2 = true;



        System.out.println("!--------- Bienvenido al sistema de turnos y devolucion de material biblioteca Atu-Trim\n ---------!");
        while(program){
            switch (control){
                case 0:
                    System.out.println("--------- Por favor ingrese el número entero correspondiente a la opción deseada ---------");
                    System.out.println("--------- Las opciones son:\n ");
                    System.out.println("Presione -> 0 - Menú");
                    System.out.println("Presione -> 1 - Fila prestar material");
                    System.out.println("Presione -> 2 - Fila devolver material");
                    System.out.println("Presione -> 3 - Fila solicitar ayuda en material histórico");
                    System.out.println("Presione -> 4 - Fila solicitar - devolver periódicos históricos");
                    System.out.println("Presione -> 5 - Para salir\n");

                    int option = Integer.parseInt(input.nextLine());
                    if(validateNumber(option)){
                        control = option;
                    }
                    break;


                case 1:
                    control = 0;
                   while ( filaBucle1){
                       switch (ctrlF1) {
                           case 0:
                               System.out.println("Fila prestar material");
                               System.out.println("--------- opciones:");
                               System.out.println("Presione -> 1 - Ingresar un usuario en en la fila prestamos ");
                               System.out.println("Presione -> 2 - Mostrar usuarios en la fila prestamos ");
                               //PILA
                               System.out.println("Presione -> 3 - Atender prestamo de usuario");
                               System.out.println("Presione -> 4 - No ingresar mas prestamos");

                               int optionF1 = Integer.parseInt(input.nextLine());
                               ctrlF1 = optionF1;
                               filaBucle1 = true;
                               break;

                           case 1:
                               System.out.println("\nIngrese el nombre del prestamo:");
                               String valuePrestarMaterial = input.nextLine();
                               System.out.println(" ");
                               PrestarMaterial.lastqueues("PM" + ++turnoF1 + " Préstamo " + valuePrestarMaterial+"\n");
                               ctrlF1 = 0;
                               filaBucle1 = true;
                               break;

                           case 2:
                               System.out.println("\n ! ----- La fila prestar material es: ----- !\n ");
                               PrestarMaterial.printQueue();
                               ctrlF1 = 0;
                               filaBucle1 = true;
                               break;

                           case 3:
                               PrestarMaterial.lastqueues();
                               ctrlF1 = 0;
                               filaBucle1 = true;
                               break;

                           case 4:
                               filaBucle1 = false;
                               filaBucle2 = true;
                               filaBucle3 = true;
                               filaBucle4 = true;
                               control = 0;
                               break;
                       }
                }
                   break;
                case 2:
                    control = 0;
                    while ( filaBucle2){
                        switch (ctrlF2) {
                            case 0:
                                System.out.println("Fila devolver material");
                                System.out.println("--------- opciones:");
                                System.out.println("Presione -> 1 - Ingresar un usuario en la fila devolver material");
                                System.out.println("Presione -> 2 - Mostrar usuarios con devoluciones en la fila");
                                System.out.println("Presione -> 3 - Devolver material y apilar");
                                System.out.println("Presione -> 4 - Mostrar devoluciones apiladas");
                                System.out.println("Presione -> 5 - No ingresar mas devoluciones");

                                int optionF2 = Integer.parseInt(input.nextLine());
                                ctrlF2 = optionF2;
                                break;

                            case 1:
                                System.out.println("\nIngrese el nombre de la devolución:");
                                String valueDevolverMaterial = input.nextLine();
                                System.out.println(" ");
                                DevolverMaterial.lastqueues("DM" + ++turnoF2 + " Devolución " + valueDevolverMaterial+"\n");
                                ctrlF2 = 0;
                                filaBucle2 = true;
                                break;

                            case 2:
                                System.out.println("\n ! ----- La fila devolución material es: ----- !\n ");
                                DevolverMaterial.printQueue();
                                ctrlF2 = 0;
                                filaBucle2 = true;
                                break;

                            case 3:
                                apilar = true;
                                mostrarPilas = true;
                                DevolverMaterial.lastqueues();
                                while(apilar){
                                        System.out.println("Por favor ingrese la categoría de la devolución");
                                        switch (category){
                                            case 0:
                                                System.out.println("Las categorias son:");
                                                System.out.println("Presione -> 1 - Libros");
                                                System.out.println("Presione -> 2 - Revistas");
                                                System.out.println("Presione -> 3 - Periódicos");
                                                System.out.println("Presione -> 4 - Material Audio Visual");
                                                System.out.println("Presione -> 5 - Devolverse");

                                                int inputCategory = Integer.parseInt(input.nextLine());
                                                category = inputCategory;
                                                apilar = true;
                                                break;
                                            case 1:
                                                System.out.println("Ingrese el nombre del libro");
                                                String nombreLibro = "Devolucion libro: "+input.nextLine();
                                                libros.push(nombreLibro);
                                                category = 0;
                                                apilar = false;
                                                break;
                                            case 2:
                                                System.out.println("Ingrese el nombre de la revista");
                                                String nombreRevista = "Devolucion revista: "+input.nextLine();
                                                revistas.push(nombreRevista);
                                                category = 0;
                                                apilar = false;
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el nombre del periódico");
                                                String nombrePeriodico = "Devolucion periódico: "+input.nextLine();
                                                periodicos.push(nombrePeriodico);
                                                category = 0;
                                                apilar = false;
                                                break;
                                            case 4:
                                                System.out.println("Ingrese el nombre del material audio visual");
                                                String nombreAV = "Devolucion material audio visual: "+input.nextLine();
                                                audioVisual.push(nombreAV);
                                                category = 0;
                                                apilar = false;
                                                break;
                                            case 5:
                                                apilar = false;
                                                break;
                                        }
                                }
                                ctrlF2 = 0;
                                break;

                            case 4:
                                while (mostrarPilas){
                                    switch (pila){
                                        case 0:
                                            System.out.println("Las pilas son:");
                                            System.out.println("Presione -> 1 - Libros");
                                            System.out.println("Presione -> 2 - Revistas");
                                            System.out.println("Presione -> 3 - Periódicos");
                                            System.out.println("Presione -> 4 - Material Audio Visual");
                                            System.out.println("Presione -> 5 - Devolverse");
                                            int inputPila= Integer.parseInt(input.nextLine());
                                            pila = inputPila;
                                            mostrarPilas = true;
                                            break;
                                        case 1:
                                            libros.printStack();

                                            mostrarPilas = true;
                                            break;
                                        case 2:
                                            revistas.printStack();
                                            pila = 0;
                                            mostrarPilas = true;
                                            break;
                                        case 3:
                                            periodicos.printStack();
                                            pila = 0;
                                            mostrarPilas = true;
                                            break;
                                        case 4:
                                            audioVisual.printStack();
                                            pila = 0;
                                            mostrarPilas = true;
                                            break;
                                        case 5:
                                            mostrarPilas = false;
                                            break;
                                    }
                                }
                                ctrlF2 = 0;
                                break;
                            case 5:
                                filaBucle1 = true;
                                filaBucle2 = false;
                                filaBucle3 = true;
                                filaBucle4 = true;
                                control = 0;
                                break;
                        }
                    }
                    break;

                case 3:
                    control = 0;
                    while ( filaBucle3){
                        switch (ctrlF3) {
                            case 0:
                                System.out.println("Fila solicitar ayuda en material histórico");
                                System.out.println("--------- opciones:");
                                System.out.println("Presione -> 1 - Ingresar ayuda material historico en la fila");
                                System.out.println("Presione -> 2 - Mostrar ayudas material historico en la fila");
                                System.out.println("Presione -> 3 - Elimar ayuda atendida");
                                System.out.println("Presione -> 4 - No ingresar mas ayudas");

                                int optionF3 = Integer.parseInt(input.nextLine());
                                ctrlF3 = optionF3;
                                filaBucle3 = true;
                                break;

                            case 1:
                                System.out.println("\nIngrese el nombre de la ayuda:");
                                String valueAyudaMaterial = input.nextLine();
                                System.out.println(" ");
                                AyudaMaterialHistorico.lastqueues("SAMH" + ++turnoF3 + " Ayuda " + valueAyudaMaterial+"\n");
                                ctrlF3 = 0;
                                filaBucle3 = true;
                                break;

                            case 2:
                                System.out.println("\n ! ----- La fila solicitar ayuda material histórico es: ----- !\n ");
                                AyudaMaterialHistorico.printQueue();
                                ctrlF3 = 0;
                                filaBucle3 = true;
                                break;

                            case 3:
                                AyudaMaterialHistorico.lastqueues();
                                ctrlF3 = 0;
                                filaBucle3 = true;

                                break;

                            case 4:
                                filaBucle1 = true;
                                filaBucle2 = true;
                                filaBucle3 = false;
                                filaBucle4 = true;
                                control = 0;
                                break;
                        }
                    }
                    break;

                case 4:
                    control = 0;
                    while ( filaBucle4){
                        switch (ctrlF4) {
                            case 0:
                                System.out.println("Fila devolver material periódicos históricos");
                                System.out.println("--------- opciones:");
                                System.out.println("Presione -> 1 - Ingresar un usuario en la fila devolver material");
                                System.out.println("Presione -> 2 - Mostrar usuarios con devoluciones en la fila");
                                System.out.println("Presione -> 3 - Devolver material y apilar");
                                System.out.println("Presione -> 4 - Mostrar devoluciones apiladas");
                                System.out.println("Presione -> 5 - No ingresar mas devoluciones");

                                int optionF5 = Integer.parseInt(input.nextLine());
                                ctrlF4 = optionF5;
                                filaBucle4 = true;
                                break;

                            case 1:
                                System.out.println("\nIngrese el nombre de la devolución:");
                                String valueDevolverMaterialPeriodico = input.nextLine();
                                System.out.println(" ");
                                SDPeriodicosHistoricos.lastqueues("DSMH" + ++turnoF4 + " Devolución " + valueDevolverMaterialPeriodico+"\n");
                                ctrlF4 = 0;
                                filaBucle4 = true;
                                break;

                            case 2:
                                System.out.println("\n ! ----- La fila devolución de material de periódico historico es: ----- !\n ");
                                SDPeriodicosHistoricos.printQueue();
                                ctrlF4 = 0;
                                filaBucle4 = true;
                                break;

                            case 3:
                                apilar2 = true;
                                mostrarPilas2 = true;
                                SDPeriodicosHistoricos.lastqueues();
                                while(apilar2){
                                    System.out.println("Por favor ingrese la categoría de la devolución");
                                    switch (category2){
                                        case 0:
                                            System.out.println("Las categorias son:");
                                            System.out.println("Presione -> 1 - Libros");
                                            System.out.println("Presione -> 2 - Revistas");
                                            System.out.println("Presione -> 3 - Periódicos");
                                            System.out.println("Presione -> 4 - Material Audio Visual");
                                            System.out.println("Presione -> 5 - Devolverse");

                                            int inputCategory2 = Integer.parseInt(input.nextLine());
                                            category2 = inputCategory2;
                                            apilar2 = true;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el nombre del libro");
                                            String nombreLibro = "Devolucion libro: "+input.nextLine();
                                            libros.push(nombreLibro);
                                            category2 = 0;
                                            apilar2 = false;
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nombre de la revista");
                                            String nombreRevista = "Devolucion revista: "+input.nextLine();
                                            revistas.push(nombreRevista);
                                            category2 = 0;
                                            apilar2 = false;
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el nombre del periódico");
                                            String nombrePeriodico = "Devolucion periódico: "+input.nextLine();
                                            periodicos.push(nombrePeriodico);
                                            category2 = 0;
                                            apilar2 = false;
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el nombre del material audio visual");
                                            String nombreAV = "Devolucion material audio visual: "+input.nextLine();
                                            audioVisual.push(nombreAV);
                                            category2 = 0;
                                            apilar2 = false;
                                            break;
                                        case 5:
                                            apilar2 = false;
                                            break;
                                    }
                                }
                                ctrlF4 = 0;
                                break;

                            case 4:
                                while (mostrarPilas2){
                                    switch (pila2){
                                        case 0:
                                            System.out.println("Las pilas son:");
                                            System.out.println("Presione -> 1 - Libros");
                                            System.out.println("Presione -> 2 - Revistas");
                                            System.out.println("Presione -> 3 - Periódicos");
                                            System.out.println("Presione -> 4 - Material Audio Visual");
                                            System.out.println("Presione -> 5 - Devolverse");
                                            int inputPila2 = Integer.parseInt(input.nextLine());
                                            pila2 = inputPila2;
                                            mostrarPilas2 = true;
                                            break;
                                        case 1:
                                            libros.printStack();
                                            pila2 = 0;
                                            mostrarPilas2 = true;
                                            break;
                                        case 2:
                                            revistas.printStack();
                                            pila2 = 0;
                                            mostrarPilas2 = true;
                                            break;
                                        case 3:
                                            periodicos.printStack();
                                            pila2 = 0;
                                            mostrarPilas2 = true;
                                            break;
                                        case 4:
                                            audioVisual.printStack();
                                            pila2 = 0;
                                            mostrarPilas2 = true;
                                            break;
                                        case 5:
                                            mostrarPilas2 = false;
                                            ctrlF4 = 0;
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 5:
                    program = false;
            }
        }

    }


    private static boolean validateNumber(int menu) {
        if( menu == 0 || menu == 1 || menu == 2 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6){
            System.out.println("La opción es válida\n");
            return true;
        }else{
            System.out.println("El número ingresado es incorrecto\n");
            return false;
        }
    }
}
