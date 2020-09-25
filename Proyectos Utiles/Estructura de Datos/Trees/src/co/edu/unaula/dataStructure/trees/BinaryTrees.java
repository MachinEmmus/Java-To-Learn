package co.edu.unaula.dataStructure.trees;

import co.edu.unaula.dataStructure.nodes.Nodes;
import com.sun.javaws.exceptions.BadVersionResponseException;

import javax.xml.soap.Node;

public class BinaryTrees {

    private Nodes root;

    public BinaryTrees(int value){
        this.root = new Nodes(value);
    }

    public Nodes getRoot() {
        return root;
    }


    private void addNodes(Nodes newNode, Nodes rootNode){

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

    private Nodes findNode(int value, Nodes root) {

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

    private boolean removeLeaves(Nodes node) {

        Nodes leftChild = node.getFather().getLeftLeaf();
        Nodes rightChild = node.getFather().getRighttLeaf();

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

    private boolean removeBranchUniqueChild(Nodes node) {

        Nodes leftChild = node.getFather().getLeftLeaf();
        Nodes rightChild = node.getFather().getRighttLeaf();
        Nodes actualChild;

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

    private boolean removeRootSubTree(Nodes node) {

        Nodes righttMostNode = walkRight(node.getRighttLeaf());

        if(righttMostNode != null){

            node.setValue(righttMostNode.getValue());

            removeNodes(righttMostNode);
            return true;
        }
        return false;
    }

    private Nodes walkRight(Nodes node){

        if(node.getLeftLeaf() != null){

            return walkRight(node.getLeftLeaf());
        }
        return node;
    }

    private  boolean removeNodes(Nodes nodeFind){

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

    private void printPreOrder(Nodes node){

        System.out.println(node.getValue());

        if(node.getLeftLeaf() != null){
            printPreOrder(node.getLeftLeaf());
        }
        if(node.getRighttLeaf() != null){
            printPreOrder(node.getRighttLeaf());
        }
    }

    private void printInOrder(Nodes node){

        if(node.getLeftLeaf() != null){
            printInOrder(node.getLeftLeaf());
        }

        System.out.println(node.getValue());

        if(node.getRighttLeaf() != null){
            printInOrder(node.getRighttLeaf());
        }

    }

    private void printPostOrder(Nodes node){
        if(node.getLeftLeaf() != null){
            printPostOrder(node.getLeftLeaf());
        }
        if(node.getRighttLeaf() != null){
            printPostOrder(node.getRighttLeaf());
        }

        System.out.println(node.getValue());

    }


    public void addNode(int value){

        Nodes newNode = new Nodes(value);
        this.addNodes(newNode,this.root);

    }

    public  boolean removeNodes(int value){

        if(this.root.getValue() == value){
            System.out.println("The root node can't be removed");
            return false;
        }

        Nodes nodeFind = findNode(value, this.root);

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
