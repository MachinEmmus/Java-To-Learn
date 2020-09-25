package co.edu.unaula.Nodes;

public class nodeDoublyList {
    private  nodeDoublyList previousElement;
    private Object data;
    private  nodeDoublyList NextElement;

    public nodeDoublyList(Object data) {
        this.previousElement = null;
        this.data = data;
        this.NextElement = null;
    }

    public nodeDoublyList getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(nodeDoublyList previousElement) {
        this.previousElement = previousElement;
    }

    public Object getData() {
        return data;
    }

    public nodeDoublyList getNextElement() {
        return NextElement;
    }

    public void setNextElement(nodeDoublyList nextElement) {
        NextElement = nextElement;
    }
}
