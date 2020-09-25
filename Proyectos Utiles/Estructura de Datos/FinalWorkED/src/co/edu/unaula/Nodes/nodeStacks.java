package co.edu.unaula.Nodes;

public class nodeStacks {
    private String data;
    private nodeStacks nextNode;

    public nodeStacks(String data){
        this.data = data;
        nextNode = null;
    }

    public String getData() {
        return data;
    }

    public nodeStacks getNextNode() {
        return nextNode;
    }

    public void setNextNode(nodeStacks nextNode) {
        this.nextNode = nextNode;
    }
}
