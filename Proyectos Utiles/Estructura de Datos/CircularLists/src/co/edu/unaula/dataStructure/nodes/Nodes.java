package co.edu.unaula.dataStructure.nodes;

public class Nodes {

    private String data;
    private Nodes nextNode;

    public Nodes(String data){
        this.data = data;
        nextNode = null;
    }

    public String getData() {
        return data;
    }

    public Nodes getNextNode() {
        return nextNode;
    }

    public void setNextNode(Nodes nextNode) {
        this.nextNode = nextNode;
    }

}
