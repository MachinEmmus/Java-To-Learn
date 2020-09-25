package co.edu.unaula.queues;

import co.edu.unaula.nodes.Node;
public class QueuesSimpleList {

    Node firstElement;
    Node lastElemnet;
    int size;

    public QueuesSimpleList(){
        firstElement = null;
        lastElemnet = null;
        size = 0;
    }

    public void lastqueues(String data){
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

    public void lastqueues(){
        if(!queueIsEmpty()){
            String eleDeleted = firstElement.getData().toString();
            firstElement = firstElement.getNextNode();
            size--;
            printQueue(eleDeleted);
            return;
        }
        System.out.println("The Queue is Empty");
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
        System.out.println("The Queue is Empty");
    }

    public void printQueue(String elmDeleted){
        System.out.println("The Element was: " + elmDeleted);
    }

    private boolean queueIsEmpty() {
        return (firstElement == null);
    }
}
