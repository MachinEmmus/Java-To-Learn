package co.edu.unaula.dataStructure;

import co.edu.unaula.dataStructure.trees.BinaryTrees;

public class Main {

    public static void main(String[] args) {

        BinaryTrees createTree = new BinaryTrees(45);

        createTree.addNode(20);
        createTree.addNode(80);
        createTree.addNode(10);
        createTree.addNode(22);
        createTree.addNode(75);
        createTree.addNode(100);
        createTree.addNode(150);

        System.out.println("*********************** PRE-ORDER ***********************");
        createTree.print("preorder");
        System.out.println("*********************** IN-ORDER ***********************");
        createTree.print("inorder");
        System.out.println("*********************** POST-ORDER ***********************");
        createTree.print("postorder");

        //createTree.removeNodes(22);
        createTree.removeNodes(100);
        createTree.removeNodes(80);



        System.out.println("*********************** PRE-ORDER before REMOVE 80 and 100***********************");
        createTree.print("preorder");

    }
}
