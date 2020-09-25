package com.unaula.nodes;

public class NodeSimpleList {
    private String data;
    private NodeSimpleList link;

    public NodeSimpleList(String data){
        this.data = data;
        link = null;
    }

    public String getData(){
        return data;
    }

    public NodeSimpleList getLink(){
        return link;
    }

    public void setLink(NodeSimpleList link) {
        this.link = link;
    }
}
