package co.edu.unaula.estructurasDatos.nodos;

import com.sun.org.apache.bcel.internal.generic.RET;

public class Nodos {

    private String dato;
    private Nodos liga;

    public Nodos(String dato){
        this.dato = dato;
        liga = null;
    }

    public String getDato() {
        return dato;
    }

    public Nodos getLiga() {
        return liga;
    }


    public void setLiga(Nodos liga) {
        this.liga = liga;
    }
}
