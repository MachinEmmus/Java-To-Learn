package co.edu.unaula.dataStructure;

import co.edu.unaula.dataStructure.lists.DoublyLinkedLists;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedLists obj = new DoublyLinkedLists();

        obj.addLast("Alvarez Valentina");
        obj.addLast("Cardenas Bryan");
        obj.addLast("Garzon Yeison");
        obj.addFirst("Acevedo Felipe");

        obj.printTail();
    }
}
