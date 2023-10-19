package org.example;

import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> listaElementos;
    public Deposito() {
        listaElementos = new ArrayList<T>();
    }
    public void addElemento(T objeto) {
        listaElementos.add(objeto);
    }
    public T getElemento() {
        return listaElementos.remove(0);
    }
}
