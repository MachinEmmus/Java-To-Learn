package com.unaula.nodes;

import java.util.ArrayList;
import java.util.List;

import com.unaula.edges.Edges;

public class NodeGraph {

    private String city;
    private List<Edges> edges;
    String error;

    public NodeGraph(String city){
        this.city = city;
        error = "";
    }

    public String getCity() {
        return city;
    }

    public String getError() {
        return error;
    }

    public List<Edges> getEdges() {
        return edges;
    }

    private boolean validate(Edges edge){
        if(edge == null){
            error = "La arista no puede estar vacia";
            return false;
        }
        return  true;
    }

    public boolean addEdges(Edges edge){

        if(!validate(edge)){
            return  false;
        }
        if(edges == null){
            edges = new ArrayList<>();
        }
        edges.add(edge);
        return true;
    }

    @Override
    public String toString(){
        return "\n \tNode \n\t\tcity =" + city + "\n\t\tedges = " + edges;
    }
}
