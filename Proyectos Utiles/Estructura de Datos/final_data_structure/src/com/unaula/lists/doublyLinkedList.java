package com.unaula.lists;

import com.unaula.nodes.NodeDoubleList;

public class doublyLinkedList {

    private NodeDoubleList tail;
    private NodeDoubleList head;
    private NodeDoubleList newNode;

    public doublyLinkedList(){
        tail = null;
        head = null;
    }

    public doublyLinkedList addFirst(Object data){
        try {
            newNode = new NodeDoubleList(data);

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

    public doublyLinkedList addLast(Object data){
        try {

            newNode = new NodeDoubleList(data);

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

            NodeDoubleList current = tail;
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
