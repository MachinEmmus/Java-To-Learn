package co.edu.unaula.dataStructure.edges;

import co.edu.unaula.dataStructure.nodes.Nodes;

import java.security.PublicKey;

public class Edges {

    private Nodes origin;
    private Nodes destination;
    private double distance;

    public Edges(Nodes origin, Nodes destination, double distance){
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }

    public Nodes getOrigin() {
        return origin;
    }

    public Nodes getDestination() {
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
