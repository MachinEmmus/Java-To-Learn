package co.edu.unaula.estructurasDatos;

import co.edu.unaula.estructurasDatos.listas.Listas;

public class Main {

    public static void main(String[] args) {

        Listas lista = new Listas();
        for(int i = 1; i <= 4; i++){
            lista.agregarNodo("INGLES " + i);

            if(i == 4){
                lista.agregarNodo("INGLES 5");
            }
        }

        lista.eliminarNodo();

    }
}
