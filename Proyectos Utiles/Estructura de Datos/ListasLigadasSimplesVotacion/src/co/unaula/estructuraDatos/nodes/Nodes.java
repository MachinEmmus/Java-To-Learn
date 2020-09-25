package co.unaula.estructuraDatos.nodes;

public class Nodes {
    private String data;
    private Nodes link;

    public Nodes(String data){
        this.data = data;
        link = null;
    }

    public String getData(){
        return data;
    }

    public Nodes getLink(){
        return link;
    }

    public void setLink(Nodes link) {
        this.link = link;
    }
}
