package co.edu.unaula.Nodes;

public class nodeQueues {
    private String data;
    private nodeQueues nextNode;

    public nodeQueues(String data){
        this.data = data;
        nextNode = null;
    }

    public String getData() {
        return data;
    }

    public nodeQueues getNextNode() {
        return nextNode;
    }

    public void setNextNode(nodeQueues nextNode) {
        this.nextNode = nextNode;
    }
}
