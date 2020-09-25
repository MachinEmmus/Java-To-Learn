package co.unaula.estructuraDatos;

import co.unaula.estructuraDatos.stacks.StackSimpleList;

public class Main {

    public static void main(String[] args) {

        StackSimpleList stack = new StackSimpleList();

        System.out.println("Llenando pila");
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("Numeros");

        stack.printStack();

        System.out.println("QUITAR TOP ELEMENT");

        stack.pop();

        stack.printStack();

    }
}
