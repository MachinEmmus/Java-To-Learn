package com.unaula.nodes;

public class Node {
        private String data;
        private Node nextNode;

        public Node(String data){
            this.data = data;
            nextNode = null;
        }

        public String getData() {
            return data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;

        }
}
