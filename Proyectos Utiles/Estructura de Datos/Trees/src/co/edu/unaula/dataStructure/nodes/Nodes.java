package co.edu.unaula.dataStructure.nodes;

public class Nodes {

    private int value;
    private Nodes father;
    private Nodes leftLeaf;
    private Nodes righttLeaf;

    public Nodes(int value){
        this.value = value;
        father = null;
        leftLeaf = null;
        righttLeaf = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodes getFather() {
        return father;
    }

    public void setFather(Nodes father) {
        this.father = father;
    }

    public Nodes getLeftLeaf() {
        return leftLeaf;
    }

    public void setLeftLeaf(Nodes leftLeaf) {
        this.leftLeaf = leftLeaf;
    }

    public Nodes getRighttLeaf() {
        return righttLeaf;
    }

    public void setRighttLeaf(Nodes righttLeaf) {
        this.righttLeaf = righttLeaf;
    }

}
