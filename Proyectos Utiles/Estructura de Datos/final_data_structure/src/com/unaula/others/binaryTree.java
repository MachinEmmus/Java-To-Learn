package com.unaula.others;

import com.unaula.nodes.NodeBinaryTree;

public class binaryTree {

    private NodeBinaryTree root;

    public binaryTree(int value){
        this.root = new NodeBinaryTree(value);
    }

    public NodeBinaryTree getRoot() {
        return root;
    }


    private void addNodes(NodeBinaryTree newNode, NodeBinaryTree rootNode){

        newNode.setFather(rootNode);
        if(newNode.getValue() < rootNode.getValue()){

            if(rootNode.getLeftLeaf() == null){

                rootNode.setLeftLeaf(newNode);
            }
            else{
                addNodes(newNode, rootNode.getLeftLeaf());
            }
        }
        else{

            if(rootNode.getRighttLeaf() == null){
                rootNode.setRighttLeaf(newNode);
            }
            else {
                addNodes(newNode, rootNode.getRighttLeaf());
            }
        }
    }

    private NodeBinaryTree findNode(int value, NodeBinaryTree root) {

        if(value == root.getValue()){
            return root;
        }
        else if(value < root.getValue()){

            if(root.getLeftLeaf() != null){
                return findNode(value, root.getLeftLeaf());
            }
            else{
                return null;
            }

        }
        else {
            if(root.getRighttLeaf() != null){
                return findNode(value, root.getRighttLeaf());
            }
            else{
                return null;
            }
        }


    }

    private boolean removeLeaves(NodeBinaryTree node) {

        NodeBinaryTree leftChild = node.getFather().getLeftLeaf();
        NodeBinaryTree rightChild = node.getFather().getRighttLeaf();

        if(leftChild == node){
            node.getFather().setLeftLeaf(null);
            return true;
        }
        if(rightChild == node){
            node.getFather().setRighttLeaf(null);
            return true;
        }
        return  false;
    }

    private boolean removeBranchUniqueChild(NodeBinaryTree node) {

        NodeBinaryTree leftChild = node.getFather().getLeftLeaf();
        NodeBinaryTree rightChild = node.getFather().getRighttLeaf();
        NodeBinaryTree actualChild;

        if(node.getLeftLeaf() != null){
            actualChild = node.getLeftLeaf();
        }
        else{
            actualChild = node.getRighttLeaf();
        }

        if(leftChild == node){

            node.getFather().setLeftLeaf(actualChild);
            actualChild.setFather(node.getFather());
            node.setRighttLeaf(null);
            node.setLeftLeaf(null);
            return true;
        }

        if(rightChild == node){

            node.getFather().setRighttLeaf(actualChild);
            actualChild.setFather(node.getFather());
            node.setRighttLeaf(null);
            node.setLeftLeaf(null);
            return true;
        }
        return false;


    }

    private boolean removeRootSubTree(NodeBinaryTree node) {

        NodeBinaryTree righttMostNode = walkRight(node.getRighttLeaf());

        if(righttMostNode != null){

            node.setValue(righttMostNode.getValue());

            removeNodes(righttMostNode);
            return true;
        }
        return false;
    }

    private NodeBinaryTree walkRight(NodeBinaryTree node){

        if(node.getLeftLeaf() != null){

            return walkRight(node.getLeftLeaf());
        }
        return node;
    }

    private  boolean removeNodes(NodeBinaryTree nodeFind){

        boolean haveChildRight = nodeFind.getRighttLeaf() != null;
        boolean haveChildLeft = nodeFind.getLeftLeaf() != null;

        if(!haveChildLeft && !haveChildRight){
            return removeLeaves(nodeFind);
        }
        if(!haveChildLeft || !haveChildRight){
            return removeBranchUniqueChild(nodeFind);
        }
        if(haveChildLeft && haveChildRight){
            return removeRootSubTree(nodeFind);
        }
        return false;

    }

    private void printPreOrder(NodeBinaryTree node){

        System.out.println(node.getValue());

        if(node.getLeftLeaf() != null){
            printPreOrder(node.getLeftLeaf());
        }
        if(node.getRighttLeaf() != null){
            printPreOrder(node.getRighttLeaf());
        }
    }

    private void printInOrder(NodeBinaryTree node){

        if(node.getLeftLeaf() != null){
            printInOrder(node.getLeftLeaf());
        }

        System.out.println(node.getValue());

        if(node.getRighttLeaf() != null){
            printInOrder(node.getRighttLeaf());
        }

    }

    private void printPostOrder(NodeBinaryTree node){
        if(node.getLeftLeaf() != null){
            printPostOrder(node.getLeftLeaf());
        }
        if(node.getRighttLeaf() != null){
            printPostOrder(node.getRighttLeaf());
        }

        System.out.println(node.getValue());

    }


    public void addNode(int value){

        NodeBinaryTree newNode = new NodeBinaryTree(value);
        this.addNodes(newNode,this.root);

    }

    public  boolean removeNodes(int value){

        if(this.root.getValue() == value){
            System.out.println("The root node can't be removed");
            return false;
        }

        NodeBinaryTree nodeFind = findNode(value, this.root);

        if(nodeFind == null){
            System.out.println("The node with value " + value + " does not exist");
            return false;
        }

        boolean haveChildRight = nodeFind.getRighttLeaf() != null;
        boolean haveChildLeft = nodeFind.getLeftLeaf() != null;

        if(!haveChildLeft && !haveChildRight){
            return removeLeaves(nodeFind);
        }
        if(!haveChildLeft || !haveChildRight){
            return removeBranchUniqueChild(nodeFind);
        }
        if(haveChildLeft && haveChildRight){
            return removeRootSubTree(nodeFind);
        }
        return false;

    }

    public void print(String printType){
        switch (printType.toUpperCase()){
            case "PREORDER":
                printPreOrder(this.root);
                break;
            case "INORDER":
                printInOrder(this.root);
                break;
            case "POSTORDER":
                printPostOrder(this.root);
                break;
            default:
                System.out.println("The print type " + printType + " is incorrect");
                break;
        }
    }
}
