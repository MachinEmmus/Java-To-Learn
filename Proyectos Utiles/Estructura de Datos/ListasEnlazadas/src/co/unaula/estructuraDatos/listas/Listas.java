package co.unaula.estructuraDatos.listas;

import co.unaula.estructuraDatos.nodos.Nodos;
public class Listas {

    private Nodos primerNodo;
    private Nodos ultimoNodo;
    private int tamano;
    private Nodos nuevoNodo;

    public Listas(){
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.tamano = 0;
    }

    public Listas agregarNodo(String dato) {
        try {
            nuevoNodo = new Nodos(dato);

         if (estaVacio()) {
                nuevoNodo = new Nodos(dato);
                primerNodo = nuevoNodo;
                nuevoNodo.setLiga(nuevoNodo);
            } else {
                ultimoNodo.setLiga(nuevoNodo);

            }
            ultimoNodo = nuevoNodo;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
         return null;
    }

    public boolean estaVacio() {
        if(tamano == 0){
            return true;
        }else {
            return false;
        }

    }
}
