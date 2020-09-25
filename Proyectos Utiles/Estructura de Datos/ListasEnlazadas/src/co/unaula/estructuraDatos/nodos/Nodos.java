package co.unaula.estructuraDatos.nodos;

public class Nodos {

    private String dato;
    private Nodos liga;

    public Nodos(String dato){
        this.dato = dato;
        liga = null;
    }

    public void setLiga(Nodos liga){
        this.liga = liga;
    }
    public String getDato(){
        return this.dato;
    }

    public Nodos getLiga(){
        return liga;
    }

}
