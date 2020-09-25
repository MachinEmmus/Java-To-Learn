package co.unaula.estructuraDatos.list;

import co.unaula.estructuraDatos.nodes.Nodes;

public class List {


    private Nodes newNode;
    private Nodes firstNode;
    private Nodes lastNode;
    private int sizeList;

    public List(){
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

    public List addNode(String data){
        try{
            newNode = new Nodes(data);

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

        Nodes aux;

        aux = firstNode;

        if(!isVoid()){

            for (int i = 0; i < sizeList; i++){

                System.out.println(aux.getData());

                aux = aux.getLink();
            }

        }
    }
}
