package com.unaula.edges;

import com.unaula.nodes.NodeGraph;

public class Edges {
    private NodeGraph origin;
    private NodeGraph destination;
    private double distance;

    public Edges(NodeGraph origin, NodeGraph destination, double distance){
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }

    public NodeGraph getOrigin() {
        return origin;
    }

    public NodeGraph getDestination() {
        return destination;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString(){
        return "\n\t\t\t Edge -> origin = " + origin.getCity() + "; Destination = " + destination.getCity() + "; Distance = " + distance;
    }
}
