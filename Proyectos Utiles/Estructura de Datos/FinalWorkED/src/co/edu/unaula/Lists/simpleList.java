package co.edu.unaula.Lists;

import co.edu.unaula.Nodes.nodeLinkedCircularList;

public class simpleList {
    private nodeLinkedCircularList newNode;
    private nodeLinkedCircularList firstNode;
    private nodeLinkedCircularList lastNode;
    private int sizeList;

    public simpleList(){
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

    public simpleList addNode(String data){
        try{
            newNode = new nodeLinkedCircularList(data);

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

        nodeLinkedCircularList aux;

        aux = firstNode;

        if(!isVoid()){

            for (int i = 0; i < sizeList; i++){

                System.out.println(aux.getData() + " -> " + aux.getLink());

                aux = aux.getLink();
            }

        }
    }
}
