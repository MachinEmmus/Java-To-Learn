package com.unaula.lists;

import javafx.stage.StageStyle;
import com.unaula.nodes.Node;

public class circularList {

    private Node firstNode;
    private Node lastNode;
    private int size;
    private Node newNode;

    public circularList(){
        this.firstNode = null;
        this.lastNode = null;
        this.size = -1;
    }

    private boolean isEmpty(){
        if(size <= 0){
            return  true;
        }
        return  false;
    }

    public circularList addNode(String data){
        try {

            newNode = new Node(data);

            if(isEmpty()){
                firstNode = newNode;
                firstNode.setNextNode(newNode);
                size = 1;
            }
            else{
                lastNode.setNextNode(newNode);
                size++;
            }
            lastNode = newNode;
            lastNode.setNextNode(firstNode);
            return this;

        }
        catch (Exception ex){
            throw ex;
        }
    }

    public void printList(){
        String text = "La lista está vacía";

        if(!isEmpty()){
            Node aux;
            aux = firstNode;
            text = "";


            for (int i = 0; i < size; i++){

                text = text + aux.getData().toString();
                text = text + " ----> Next Node " + aux.getNextNode().toString().substring(aux.getNextNode().toString().lastIndexOf('.') + 1) + "\r\n";
                aux = aux.getNextNode();

            }
        }
        System.out.println(text);
    }
}
