package com.unaula.others;

import com.unaula.nodes.Node;

public class stack {

    private Node topElement;
    private int size;

    public stack(){
        topElement = null;
        size = 0;
    }

    public void push(String data){
        Node newNode = new Node(data);

        if(!stackIsEmpty()){
            newNode.setNextNode(topElement);
        }
        topElement = newNode;
        size++;
    }

    public void pop(){
        if(!stackIsEmpty()){
            String elmDeleted = topElement.getData();
            topElement = topElement.getNextNode();
            size--;
            return;
        }
    }

    public void printStack() {
        if(!stackIsEmpty()){
            Node aux = topElement;
            for (int i=0; i<size; i++){
                System.out.println(aux.getData().toString());
                aux =  aux.getNextNode();
            }
            return;
        }
        System.out.println("La pila está vacía");
    }
    private void printStack(String elmDeleted){
        System.out.println("El elemento eliminado fue: "+ elmDeleted);
    }

    private boolean stackIsEmpty() {
        return (topElement == null);
    }
}
