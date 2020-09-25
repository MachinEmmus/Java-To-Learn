package co.edu.unaula.Nodes;

public class nodeLinkedCircularList {
    private String data;
    private nodeLinkedCircularList link;

    public nodeLinkedCircularList(String data){
        this.data = data;
        link = null;
    }

    public String getData(){
        return data;
    }

    public nodeLinkedCircularList getLink(){
        return link;
    }

    public void setLink(nodeLinkedCircularList link) {
        this.link = link;
    }
}
