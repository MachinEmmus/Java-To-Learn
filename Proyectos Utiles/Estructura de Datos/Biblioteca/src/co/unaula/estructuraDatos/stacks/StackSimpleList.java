package co.unaula.estructuraDatos.stacks;

import co.unaula.estructuraDatos.nodes.Nodes;

public class StackSimpleList {

    private Nodes topElement;
    private int size;

    public StackSimpleList(){
        topElement = null;
        size = 0;
    }

    public void push(String data){
        Nodes newNode = new Nodes(data);

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
            printStack();
        }
        System.out.println("The stack is empty");
    }

    public void printStack() {
        if(!stackIsEmpty()){
            Nodes aux = topElement;
            for (int i=0; i<size; i++){
                System.out.println(aux.getData().toString());
                aux =  aux.getNextNode();
            }
            return;
        }
        System.out.println("The stack is empty");
    }
    private void printStack(String elmDeleted){
        System.out.println("The element was deleted is "+ elmDeleted);
    }

    private boolean stackIsEmpty() {
        return (topElement == null);
    }
}
