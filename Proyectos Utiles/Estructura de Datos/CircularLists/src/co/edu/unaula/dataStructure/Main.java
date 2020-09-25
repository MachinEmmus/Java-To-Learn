package co.edu.unaula.dataStructure;

import co.edu.unaula.dataStructure.lists.CircularLists;

public class Main {

    public static void main(String[] args) {

        CircularLists list = new CircularLists();

        for (int i = 1; i <=10; i++){

            list.addNode("Ingles " + i);
        }

        list.printList();
    }
}
