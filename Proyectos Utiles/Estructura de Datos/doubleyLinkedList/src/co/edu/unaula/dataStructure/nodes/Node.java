package co.edu.unaula.dataStructure.nodes;

public class Node {

    private  Node previousElement;
    private Object data;
    private  Node NextElement;

    public Node(Object data) {
        this.previousElement = null;
        this.data = data;
        this.NextElement = null;
    }

    public Node getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(Node previousElement) {
        this.previousElement = previousElement;
    }

    public Object getData() {
        return data;
    }

    public Node getNextElement() {
        return NextElement;
    }

    public void setNextElement(Node nextElement) {
        NextElement = nextElement;
    }
}
