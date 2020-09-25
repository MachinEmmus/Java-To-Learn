package co.edu.unaula.estructurasDatos.listas;

import co.edu.unaula.estructurasDatos.nodos.Nodos;

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

    public boolean estaVacio() {
        if(tamano == 0){
            return true;
        }
        return false;
    }

    public Listas agregarNodo(String dato){
        try {
            nuevoNodo = new Nodos(dato);

            if(estaVacio()){
                primerNodo = nuevoNodo;
                nuevoNodo.setLiga(nuevoNodo);
            }
            else{
                ultimoNodo.setLiga(nuevoNodo);
            }

            ultimoNodo = nuevoNodo;
            tamano++;
            return this;

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public Listas eliminarNodo(){
        try {

            if(estaVacio()){
                System.out.println("No hay nodos para eliminar en la lista");
                return null;
            }
            if(primerNodo == ultimoNodo){
                primerNodo = null;
                ultimoNodo = null;
                tamano = 0;
            }
            else{

                Nodos nodoActual = primerNodo;
                while (nodoActual.getLiga() != ultimoNodo){

                    nodoActual =nodoActual.getLiga();
                }
                nodoActual.setLiga(null);
                ultimoNodo = nodoActual;
            }
            tamano--;
            return this;


        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return this;
        }
    }

}
