package co.edu.unaula.stacksYqueues;

import co.edu.unaula.Nodes.nodeStacks;

public class Stacks {
    private nodeStacks topElement;
    private int size;

    public Stacks(){
        topElement = null;
        size = 0;
    }

    public void push(String data){
        nodeStacks newNode = new nodeStacks(data);

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
            nodeStacks aux = topElement;
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
