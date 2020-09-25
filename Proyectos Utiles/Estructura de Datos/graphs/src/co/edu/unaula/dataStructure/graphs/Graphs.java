package co.edu.unaula.dataStructure.graphs;

import co.edu.unaula.dataStructure.nodes.Nodes;

import java.util.ArrayList;
import java.util.List;

public class Graphs {

    private List<Nodes> nodes;
    private String error;

    public Graphs(){
        this.error = "";
    }

    public List<Nodes> getNodes() {
        return nodes;
    }
    public String getError() {
        return error;
    }

    private boolean validate(Nodes node){
        if(node == null){
            error = "Debe enviar un nodo";
            return false;
        }
        return true;
    }

    public boolean addNodes(Nodes node){

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
