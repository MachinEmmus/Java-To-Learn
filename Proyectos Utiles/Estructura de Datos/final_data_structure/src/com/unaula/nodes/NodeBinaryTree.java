package com.unaula.nodes;

public class NodeBinaryTree {

    private int value;
    private NodeBinaryTree father;
    private NodeBinaryTree leftLeaf;
    private NodeBinaryTree righttLeaf;

    public NodeBinaryTree(int value){
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

    public NodeBinaryTree getFather() {
        return father;
    }

    public void setFather(NodeBinaryTree father) {
        this.father = father;
    }

    public NodeBinaryTree getLeftLeaf() {
        return leftLeaf;
    }

    public void setLeftLeaf(NodeBinaryTree leftLeaf) {
        this.leftLeaf = leftLeaf;
    }

    public NodeBinaryTree getRighttLeaf() {
        return righttLeaf;
    }

    public void setRighttLeaf(NodeBinaryTree righttLeaf) {
        this.righttLeaf = righttLeaf;
    }
}
