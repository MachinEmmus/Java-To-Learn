package co.edu.unaula.dataStructure.lists;

import co.edu.unaula.dataStructure.nodes.Nodes;
import javafx.stage.StageStyle;

public class CircularLists {

    private Nodes firstNode;
    private Nodes lastNode;
    private int size;
    private Nodes newNode;

    public CircularLists(){
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

    public CircularLists addNode(String data){
        try {

            newNode = new Nodes(data);

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
        String text = "The List is empty";

        if(!isEmpty()){
            Nodes aux;
            aux = firstNode;
            text = "";


            System.out.println("POSICIÓN DE MEMORIA DEL PRIMER NODO\r\n");
            System.out.println(aux.toString().substring(aux.toString().lastIndexOf('.') + 1));

            for (int i = 0; i < size; i++){

                text = text + aux.getData().toString();
                text = text + " ----> Next Node " + aux.getNextNode().toString().substring(aux.getNextNode().toString().lastIndexOf('.') + 1) + "\r\n";
                aux = aux.getNextNode();

            }
        }
        System.out.println(text);
    }

}
