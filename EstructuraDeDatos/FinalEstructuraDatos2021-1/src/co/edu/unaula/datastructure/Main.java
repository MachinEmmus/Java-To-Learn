package co.edu.unaula.datastructure;

import co.edu.unaula.datastructure.menus.Menus;
public class Main {

    static int  opcMenu;
    static Menus menus = new Menus();

    public static void main(String[] args) {
	// write your code here
        opcMenu = menus.mainMenu();
        try {
            while (opcMenu != 9){
                switch (opcMenu){
                    case 1:
                        /*listMenu = Menus.listMenu();

                        if (listMenu <1){
                            return;
                        }
                        listSimple(listMenu);*/
                        System.out.println("Single List");
                        break;

                    case 2:
                        /*listMenu = Menus.listMenu();
                        if (listMenu <1){
                            return;
                        }
                        doubleList(listMenu);*/
                        System.out.println("Doubly List");
                        break;
                    case 3:
                        /*listMenu = Menus.listMenu();
                        if (listMenu <1){
                            return;
                        }
                        circularList(listMenu);*/
                        System.out.println("Circular List");
                        break;
                    case 4:
                        /*opcStack = Menus.stackMenu();
                        if (opcStack <1){
                            return;
                        }
                        stack(opcStack);*/
                        System.out.println("Stack");
                        break;
                    case 5:
                        /*opcQue = Menus.queuesMenu();
                        if (opcQue < 1){
                            return;
                        }
                        queue(opcQue);*/
                        System.out.println("Queue");
                        break;
                    case 6:
                        /*opcRec = Menus.recurMenu();
                        if (opcRec < 1){
                            return;
                        }
                        recurFact(opcRec);*/
                        System.out.println("Recursion");
                        break;
                    case 7:
                        System.out.println("Binary");
                        break;
                    case 8:
                        System.out.println("Graphs");
                }
            }
        } catch (Exception ex){
            System.out.println("Incorrect input");
            System.out.println(ex.getMessage());
        }
    }
}

