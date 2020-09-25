package com.unaula.others;

import com.unaula.nodes.Node;
public class queue {

    Node firstElement;
    Node lastElemnet;
    int size;

    public queue(){
        firstElement = null;
        lastElemnet = null;
        size = 0;
    }

    public void lastQueues(String data){
        Node newNode = new Node(data);

        if (queueIsEmpty()){
            firstElement = newNode;
        }
        else{
            lastElemnet.setNextNode(newNode);
        }
        lastElemnet = newNode;
        size++;
    }

    public void lastQueues(){
        if(!queueIsEmpty()){
            String eleDeleted = firstElement.getData().toString();
            firstElement = firstElement.getNextNode();
            size--;
            printQueue(eleDeleted);
            return;
        }
        System.out.println("La cola está vacía");
    }

    public void printQueue() {
        if(!queueIsEmpty()){
            Node aux = firstElement;

            for(int i = 0; i < size; i++){
                System.out.println(aux.getData().toString());
                aux = aux.getNextNode();
            }
            return;
        }
        System.out.println("La cola está vacía");
    }

    public void printQueue(String elmDeleted){
        System.out.println("El elemento eliminado fue: " + elmDeleted);
    }

    private boolean queueIsEmpty() {
        return (firstElement == null);
    }
}
