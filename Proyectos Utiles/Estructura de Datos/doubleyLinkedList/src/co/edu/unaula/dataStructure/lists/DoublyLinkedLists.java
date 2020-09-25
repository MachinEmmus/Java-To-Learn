package co.edu.unaula.dataStructure.lists;

import co.edu.unaula.dataStructure.nodes.Node;

public class DoublyLinkedLists {

    private Node tail;
    private Node head;
    private Node newNode;

    public DoublyLinkedLists(){
        tail = null;
        head = null;
    }

    public DoublyLinkedLists addFirst(Object data){
        try {

            newNode = new Node(data);

            if(tail == null && head == null){
                tail = newNode;
                head = newNode;
            }
            else{
                newNode.setNextElement(tail);
                tail.setPreviousElement(newNode);
                tail = newNode;
            }

            return  this;

        }
        catch (Exception ex){
            throw ex;
        }
    }

    public DoublyLinkedLists addLast(Object data){
        try {

            newNode = new Node(data);

            if(tail == null && head == null){
                tail = newNode;
                head = newNode;
            }
            else{
                head.setNextElement(newNode);
                newNode.setPreviousElement(head);
                head = newNode;
            }
            return  this;

        }
        catch (Exception ex){
            throw ex;
        }
    }

    public  void printTail(){
        try{

            Node current = tail;
            String text;

            while (current != null){
                text = "Previous Element ";

                if(current.getPreviousElement() == null){
                    text = text + " null";
                }
                else{
                    text = text + current.getPreviousElement().getData().toString();
                }
                text = text + "\r\nData " + current.getData().toString() + "\r\nNext Element ";

                if(current.getNextElement() == null){
                    text = text + "null";
                }
                else{
                    text = text + current.getNextElement().getData().toString();
                }

                System.out.println(text + "\r\n");
                current = current.getNextElement();
            }

        }
        catch (Exception ex){
            throw ex;
        }
    }


}
