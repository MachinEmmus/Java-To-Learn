package co.edu.unaula.Lists;

import co.edu.unaula.Nodes.nodeDoublyList;

public class doubleList {
    private nodeDoublyList tail;
    private nodeDoublyList head;
    private nodeDoublyList newNode;

    public doubleList(){
        tail = null;
        head = null;
    }

    public doubleList addFirst(Object data){
        try {

            newNode = new nodeDoublyList(data);

            if(tail == null && head == null){
                tail = newNode;
                head = newNode;
            }
            else{
                newNode.setNextElement(tail);
                tail.setPreviousElement(newNode);
                tail = newNode;
            }

            return  this;

        }
        catch (Exception ex){
            throw ex;
        }
    }

    public doubleList addLast(Object data){
        try {

            newNode = new nodeDoublyList(data);

            if(tail == null && head == null){
                tail = newNode;
                head = newNode;
            }
            else{
                head.setNextElement(newNode);
                newNode.setPreviousElement(head);
                head = newNode;
            }
            return  this;

        }
        catch (Exception ex){
            throw ex;
        }
    }

    public  void printTail(){
        try{

            nodeDoublyList current = tail;
            String text;

            while (current != null){
                text = "Previous Element ";

                if(current.getPreviousElement() == null){
                    text = text + " null";
                }
                else{
                    text = text + current.getPreviousElement().getData().toString();
                }
                text = text + "\r\nData " + current.getData().toString() + "\r\nNext Element ";

                if(current.getNextElement() == null){
                    text = text + "null";
                }
                else{
                    text = text + current.getNextElement().getData().toString();
                }

                System.out.println(text + "\r\n");
                current = current.getNextElement();
            }
        }
        catch (Exception ex){
            throw ex;
        }
    }
}

