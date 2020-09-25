package co.edu.unaula.stacks;

import co.edu.unaula.nodes.Node;
public class StackSimpleList {

    private Node topElement;
    private int size;

    public StackSimpleList(){
        topElement = null;
        size = 0;
    }

    public void push(String data) {
        Node newNode = new Node(data);

        if(!stackIsEmpty()){
            newNode.setNextNode(topElement);
        }
        topElement = newNode;
        size++;
    }

    public void pop(){
        if(!stackIsEmpty()) {
            String elmDeleted = topElement.getData();
            topElement = topElement.getNextNode();
            size--;
            return;
        }
    }

    public void printStack() {
        if (!stackIsEmpty()){
            Node aux = topElement;
            for (int i = 0; i < size; i++){
                System.out.println(aux.getData().toString());
                aux = aux.getNextNode();
            }
            return;
        }
        System.out.println("The stack is Empty");
    }

    public void printStack(String elmDeleted){
        System.out.println("The element deleted was: " + elmDeleted);
    }

    private boolean stackIsEmpty() {
        return (topElement == null);
    }
}
