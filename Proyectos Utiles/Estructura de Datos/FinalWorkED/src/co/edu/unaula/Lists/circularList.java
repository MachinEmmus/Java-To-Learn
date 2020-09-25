package co.edu.unaula.Lists;

import co.edu.unaula.Nodes.nodeLinkedCircularList;

public class circularList {
    private nodeLinkedCircularList firstNode;
    private nodeLinkedCircularList lastNode;
    private int size;
    private nodeLinkedCircularList newNode;

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

            newNode = new nodeLinkedCircularList(data);

            if(isEmpty()){
                firstNode = newNode;
                firstNode.setLink(newNode);
                size = 1;
            }
            else{
                lastNode.setLink(newNode);
                size++;
            }
            lastNode = newNode;
            lastNode.setLink(firstNode);
            return this;

        }
        catch (Exception ex){
            throw ex;
        }
    }

    public void printList(){
        String text = "The List is empty";

        if(!isEmpty()){
            nodeLinkedCircularList aux;
            aux = firstNode;
            text = "";


            System.out.println("POSICIÓN DE MEMORIA DEL PRIMER NODO\n");
            System.out.println(aux.toString().substring(aux.toString().lastIndexOf('.') + 1));

            for (int i = 0; i < size; i++){

                text = text + aux.getData().toString();
                text = text + " ----> Next Node " + aux.getLink().toString().substring(aux.getLink().toString().lastIndexOf('.') + 1) + "\n";
                aux = aux.getLink();

            }
        }
        System.out.println(text);
    }
}
