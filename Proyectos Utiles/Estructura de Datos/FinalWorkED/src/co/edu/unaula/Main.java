package co.edu.unaula;
// Imports to Java Class
import java.util.Scanner;

// Class imports
import co.edu.unaula.Lists.simpleList;
import co.edu.unaula.recursion.calculateFactorial;
import co.edu.unaula.recursion.calculatePotencia;
import co.edu.unaula.stacksYqueues.*;

public class Main {

    public static void main(String[] args) {

        int flag = 1;
        System.out.println("_____Welcome to the final work program._____");
        System.out.println("_____BY: Emmanuel Monsalve Parra(Emmus)_____\n");
        mainMenu(flag);
    }

    // Main Menu To App
    static void mainMenu(int flag) {

        Scanner scan = new Scanner(System.in);
        String input;

        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("MAIN MENU\n" +
                    "1. Listas Simples.\n" +
                    "2. Listas Dobles.\n" +
                    "3. Listas Circulares.\n" +
                    "4. Pilas.\n" +
                    "5. Colas.\n" +
                    "6. Recursividad\n" +
                    "7. Arboles Binarios\n" +
                    "8. Grafos\n" +
                    "9. Salir\n");
            input = scan.nextLine();

            switch (input) {
                case "1":
                    SimpleList(flag);
                    break;
                case "2":
                    DoublyList(input, flag);
                    break;
                case "3":
                    CircularList(input, flag);
                    break;
                case "4":
                    Stacks(input, flag);
                    break;
                case "5":
                    Queues(input, flag);
                    break;
                case "6":
                    Recursion(input, flag);
                    break;
                case "7":
                    Binarytree(input, flag);
                    break;
                case "8":
                    Graphs(input, flag);
                    break;
                case "9":
                    System.out.println("Thanks!!");
                    return;
            }
        }
    }

    // #1 Simple List
    public static void SimpleList(int flag) {

        Scanner read = new Scanner(System.in);
        simpleList newNode = new simpleList();

        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("SIMPLE LIST MENU\n" +
                    "1. Crear/Agregar.\n" +
                    "2. Eliminar Nodo.\n" +
                    "3. Imprimir Lista.\n" +
                    "4. Regresar al Menú Principal.\n");
            String ans = read.nextLine();

            switch (ans) {
                case "1":
                    do {
                        System.out.println("Ingrese la data que desea agregar al Nodo");
                        String data = read.nextLine();
                        newNode.addNode(data);
                        System.out.println("El nodo ha sido creado exitosamente");
                        System.out.println("Desea agregar mas Nodos\n" +
                                "1. Sí     Cualquier otro Para No");
                        ans = read.nextLine();
                    } while (ans.equals("1"));
                    break;
                case "2":
                    break;
                case "3":
                    newNode.printNodes();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("No has seleccionado una opcion correcta");
            }
        }
    }

    // #2 Double List
    public static void DoublyList(String ans, int flag) {

        Scanner read = new Scanner(System.in);

        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("SIMPLE LIST MENU\n" +
                    "1. Crear/Agregar.\n" +
                    "2. Eliminar Nodo.\n" +
                    "3. Imprimir Lista.\n" +
                    "4. Regresar al Menú Principal.\n");
            ans = read.nextLine();
            switch (ans) {
                case "1":
                    do {
                        String data = "";
                        System.out.println("Ingrese la data que desea agregar al Nodo");
                        data = read.nextLine();
                        System.out.println("El nodo ha sido creado exitosamente");
                        System.out.println("Desea agregar mas Nodos\n" +
                                "1. Sí     Cualquier otro para No");
                        ans = read.nextLine();
                    } while (ans.equals("1"));
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    return;
                default:
                    System.out.println("No has seleccionado una opcion correcta");
            }
        }
    }

    // #3 Circular List
    public static void CircularList(String ans, int flag) {

        Scanner read = new Scanner(System.in);

        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("SIMPLE LIST MENU\n" +
                    "1. Crear/Agregar.\n" +
                    "2. Eliminar Nodo.\n" +
                    "3. Imprimir Lista.\n" +
                    "4. Regresar al Menú Principal.\n");
            ans = read.nextLine();
            switch (ans) {
                case "1":
                    do {
                        String data = "";
                        System.out.println("Ingrese la data que desea agregar al Nodo");
                        data = read.nextLine();
                        System.out.println("El nodo ha sido creado exitosamente");
                        System.out.println("Desea agregar mas Nodos\n" +
                                "1. Sí     Cualquier otro para No");
                        ans = read.nextLine();
                    } while (ans.equals("1"));
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    return;
                default:
                    System.out.println("No has seleccionado una opcion correcta");
            }
        }
    }

    // #4 Stacks
    public static void Stacks(String ans, int flag) {
        Scanner read = new Scanner(System.in);
        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("STACKS MENU\n" +
                    "1. Apilar.\n" +
                    "2. Desapilar.\n" +
                    "3. Imprimir Pila.\n" +
                    "4. Regresar al menú principal.");
            ans = read.nextLine();
            switch (ans) {
                case "1":
                    Stacks stack = new Stacks();
                    System.out.println("Ingrese el valor que desea apilar");
                    String val = read.nextLine();
                    stack.push(val);
                    System.out.println("La pila ha sido creada");
                    break;
                case "2":
                    System.out.println("Esta ud seguro de que desea desapilar\n" +
                            "1. Sí    Cualquiera otra opcion para No");
                    ans = read.nextLine();
                    if(ans.equals("1")){
                        Stacks deleteStack = new Stacks();
                        deleteStack.pop();
                    }

                case "3":
                    Stacks print = new Stacks();
                    print.printStack();
                    break;
                case "4":
                    return;
            }
        }
    }

    // #5 Queues
    public static void Queues(String ans, int flag) {
        Scanner read = new Scanner(System.in);

        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("QUEUES MENU\n" +
                    "5. Encolar.\n" +
                    "6. Desencolar.\n" +
                    "7. Imprimir Cola.\n" +
                    "8. Regresar al menú Principal.\n");
            ans = read.nextLine();
            switch (ans) {
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    return;
            }
        }
    }

    // #6 Recursion
    public static void Recursion(String ans, int flag) {
        Scanner read = new Scanner(System.in);
        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("RECURSION MENU\n" +
                    "1. Calcular Factorial.\n" +
                    "2. Calcular Potencias.\n" +
                    "3. Regresar al menú principal");
            ans = read.nextLine();
            switch (ans) {
                case "1":
                    try {
                        calculateFactorial fac = new calculateFactorial();
                        System.out.println("Ingrese el valor que desea calcular");
                        int val = read.nextInt();
                        double res = fac.calFacRec(val);
                        System.out.println("El factorial del número " + val + " es: " + res);
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error intentelo de nuevo " + e);
                    }
                    break;
                case "2":
                    try {
                        calculatePotencia pot = new calculatePotencia();
                        System.out.println("Ingrese el valor que desea calcular");
                        int val = read.nextInt();
                        double res = pot.calPorRec(val);
                        System.out.println("La potencia del número " + val + " es: " + res);
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error intentelo de nuevo " + e);
                    }
                    break;
                case "3":
                    return;
            }
        }
    }

    // #7 Binary Trees
    public static void Binarytree(String ans, int flag) {
        Scanner read = new Scanner(System.in);
        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("BINARY TREES MENU\n" +
                    "1. Crear.\n" +
                    "2. Eliminar Rama.\n" +
                    "3. Imprimir.\n" +
                    "4. Regresar al menú principal");
            ans = read.nextLine();
            switch (ans) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    return;
            }
        }
    }

    // #8 Graphs
    public static void Graphs(String ans, int flag) {
        Scanner read = new Scanner(System.in);
        while (flag == 1) {
            System.out.println("Select the option you want to run");
            System.out.println("GRAPHS MENU\n" +
                    "1. Crear.\n" +
                    "2. Imprimir.\n" +
                    "3. Regresar al menú Principal.");
            ans = read.nextLine();
            switch (ans) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    return;
            }
        }
    }
}

