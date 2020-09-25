package com.unaula.lists;

import com.unaula.nodes.NodeSimpleList;

public class simpleList {

    private NodeSimpleList newNode;
    private NodeSimpleList firstNode;
    private NodeSimpleList lastNode;
    private int sizeList;

    public simpleList() {
        this.firstNode = null;
        this.lastNode = null;
        this.sizeList = 0;
    }

    public boolean isVoid() {
        if (sizeList == 0) {
            return true;
        }
        return false;
    }

    public simpleList addNode(String data) {
        try {
            newNode = new NodeSimpleList(data);

            if (isVoid()) {
                firstNode = newNode;
                newNode.setLink(newNode);
            } else {
                lastNode.setLink(newNode);
            }

            lastNode = newNode;
            sizeList++;
            return this;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void printNodes() {

        NodeSimpleList aux;

        aux = firstNode;

        if (!isVoid()) {

            for (int i = 0; i < sizeList; i++) {

                System.out.println(aux.getData());

                aux = aux.getLink();
            }
            return;
        }
        System.out.println("Lista vacía");
    }

}
