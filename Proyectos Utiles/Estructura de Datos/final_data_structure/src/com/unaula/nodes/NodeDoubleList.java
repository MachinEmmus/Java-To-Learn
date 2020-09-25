package com.unaula.nodes;

public class NodeDoubleList {

    private String data;
    private NodeDoubleList link;

    public NodeDoubleList(String data){
        this.data = data;
        link = null;
    }

    public String getData(){
        return data;
    }

    public NodeDoubleList getLink(){
        return link;
    }

    public void setLink(NodeDoubleList link) {
        this.link = link;
    }

}
