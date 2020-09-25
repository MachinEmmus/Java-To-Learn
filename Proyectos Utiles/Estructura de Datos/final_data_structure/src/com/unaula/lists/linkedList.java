package com.unaula.lists;

import com.unaula.nodes.NodeDoubleList;

public class linkedList {

    private NodeDoubleList newNode;
    private NodeDoubleList firstNode;
    private NodeDoubleList lastNode;
    private int sizeList;

    public linkedList(){
        this.firstNode = null;
        this.lastNode = null;
        this.sizeList = 0;
    }

    public boolean isVoid(){
        if(sizeList == 0 ){
            return true;
        }
        return false;
    }

    public linkedList addNode(String data){
        try{
            newNode = new NodeDoubleList(data);

            if(isVoid()){
                firstNode = newNode;
                newNode.setLink(newNode);
            }else {
                lastNode.setLink(newNode);
            }

            lastNode = newNode;
            sizeList++;
            return this;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void printNodes(){

        NodeDoubleList aux;

        aux = firstNode;

        if(!isVoid()){

            for (int i = 0; i < sizeList; i++){

                System.out.println(aux.getData());

                aux = aux.getLink();
            }

        }
    }
}
