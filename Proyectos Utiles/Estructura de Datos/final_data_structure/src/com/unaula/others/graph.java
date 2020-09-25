package com.unaula.others;

import com.unaula.nodes.NodeGraph;

import java.util.ArrayList;
import java.util.List;

public class graph {

    private List<NodeGraph> nodes;
    private String error;

    public graph(){
        this.error = "";
    }

    public List<NodeGraph> getNodes() {
        return nodes;
    }
    public String getError() {
        return error;
    }

    private boolean validate(NodeGraph node){
        if(node == null){
            error = "Debe enviar un nodo";
            return false;
        }
        return true;
    }

    public boolean addNodes(NodeGraph node){

        if(!validate(node)){
            return false;
        }
        if(this.nodes == null){
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(node);
        return true;
    }

    @Override
    public String toString(){
        return "Graph \nNodes = " + this.nodes;
    }
}
