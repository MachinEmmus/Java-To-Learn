package com.unaula;

import java.util.Scanner;

//imports
import com.unaula.lists.simpleList;
import com.unaula.lists.linkedList;
import com.unaula.lists.circularList;
import com.unaula.others.stack;
import com.unaula.others.queue;
import com.unaula.recursive.recursiveFactorial;
import com.unaula.recursive.recursivePotency;
import com.unaula.others.binaryTree;
import com.unaula.others.graph;

import com.unaula.messages.menus;

public class Main {
    //instances
    static simpleList           listaSimple      = new simpleList();
    static linkedList           listaDoble       = new linkedList();
    static circularList         listaCircular    = new circularList();
    static stack                pila             = new stack();
    static  queue               cola             = new queue();
    static  recursiveFactorial  factorial        = new recursiveFactorial();
    static recursivePotency     potenciacion     = new recursivePotency();
    // static binaryTree          arbolBinario     = new binaryTree();
    static graph                grafo            = new graph();

    static menus               menu             = new menus();

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        //variables
        boolean program = true;
        int control = 0;


        System.out.println("<!---  TRABAJO FINAL - ESTRUCTURA DE DATOS --->");
        System.out.println("<------ Realizado por: Yeison Garzon T. ------>\n");

        do{
            menu.principalMenu(); // Menú Principal
            control = Integer.parseInt(scan.nextLine());
            switch (control){
                case 1:
                    SimpleList();
                    break;
                case 2:
                    DoubleList();
                    break;
                case 3:
                    CircularList();
                    break;
                case 4:
                    Stacks();
                    break;
               case 5:
                    Queues();
                    break;
                case 6:
                    Recursive();
                    break;
                /*case 7:
                    BinaryTree();
                    break;
                case 8:
                    Graph();
                    break;

                 */
                case 9:
                    System.out.println("Bye!...");
                    program = false;
                    break;
                default:
                    System.out.println("Debes seleccionar una opción válida");
            }
        }while(program );

    }

    // -1
    public static void SimpleList(){
        menu.simpleListMenu();
        int res = Integer.parseInt(scan.nextLine());

        switch (res) {
            case 1:
                do {
                    String data = "";
                    System.out.println("Por favor ingrese el dato del nodo");
                    data = scan.nextLine();
                    listaSimple.addNode("LS "+data);
                    System.out.println("El nodo ha sido creado\n");
                    System.out.println("Desea agregar mas Nodos?\n" +
                            "1. Sí - 0. No");
                    res = Integer.parseInt(scan.nextLine());
                } while (res == 1 );
                break;
            case 2:
                break;
            case 3:
                listaSimple.printNodes();
                break;
            case 4:
                return;
            default:
                System.out.println("No has seleccionado una opcion correcta");
        }
    }

    // -2
    public static void DoubleList(){
        menu.DoubleListMenu();


    }

    // -3
    public static void CircularList(){
        menu.CircularListMenu();

        int res = Integer.parseInt(scan.nextLine());

        switch (res) {
            case 1:
                do {
                    System.out.println("Ingrese el dato del nodo a ingresar en lista");
                    String data = scan.nextLine();
                    listaCircular.addNode("LC "+data);
                    System.out.println("El nodo ha sido creado\n");
                    System.out.println("Desea agregar mas Nodos?\n" +
                            "1. Sí - 0. No");
                    res = Integer.parseInt(scan.nextLine());
                } while (res == 1 );
                break;
            case 2:
                listaCircular.printList();
                break;
            case 3:
                return;
            default:
                System.out.println("No has seleccionado una opcion correcta");
        }
    }

    // -4
    public static void Stacks(){
        menu.StackMenu();
        int res = Integer.parseInt(scan.nextLine());
        switch (res){
            case 1:
                do {
                    String data = "";
                    System.out.println("Ingrese el nombre del elemento:\n");
                    String elem = scan.nextLine();
                    System.out.println(" ");
                    pila.push("PL "+elem);
                    System.out.println("El elemento ha sido agregado\n");
                    System.out.println("Desea agregar mas elementos?\n" +
                            "1. Sí - 0. No");
                    res = Integer.parseInt(scan.nextLine());
                } while (res == 1 );
                break;
            case 2:
                pila.pop();
                break;
            case 3:
                pila.printStack();
                break;
            case 4:
                return;
            default:
                System.out.println("No has seleccionado una opcion correcta");

        }
    }

    // -5
    public static void Queues(){
        menu.QueueMenu();
        int res = Integer.parseInt(scan.nextLine());
        switch (res){
            case 1:
                do {
                    String data = "";
                    System.out.println("Ingrese el nombre del elemento:\n");
                    String elem = scan.nextLine();
                    System.out.println(" ");
                    cola.lastQueues("CL "+elem);
                    System.out.println("El elemento ha sido agregado\n");
                    System.out.println("Desea agregar mas elementos?\n" +
                            "1. Sí - 0. No");
                    res = Integer.parseInt(scan.nextLine());
                } while (res == 1 );
                break;
            case 2:
                cola.lastQueues();
                break;
            case 3:
                cola.printQueue();
                break;
            case 4:
                return;
            default:
                System.out.println("No has seleccionado una opcion correcta");

        }
    }



    // -6
    public static void Recursive() {
        menu.RecursiveMenu();
        int res = Integer.parseInt(scan.nextLine());
        switch (res){
            case 1:
                try {
                    System.out.println("Ingrese el valor de su factorial a calcular:\n");
                    int value = Integer.parseInt(scan.nextLine());
                    double calc = factorial.calcFactRecur(value);
                    System.out.println("El factorial de: " + value + " es: " + calc);
                } catch (Exception excp) {
                    System.out.println("Error: " + excp);
                }
                break;
            case 2:
                try {
                    System.out.println("Ingrese el valor de su potencia a calcular:\n");
                    double value = Double.parseDouble(scan.nextLine());
                    double resp = potenciacion.calcRecurExpo(value);
                    System.out.println("La potencia del número " + value + " es: " + resp);
                } catch (Exception excp) {
                    System.out.println("Error: " + excp);
                }
                break;
            case 3:
               return;
            default:
                System.out.println("No has seleccionado una opcion correcta");
        }
    }

    // -7
   /* public static void BinaryTree(){
        menu.BinaryTreeMenu();
    }

    // -8
    public static void Graph(){
        menu.GraphMenu();
    }

    */
}
