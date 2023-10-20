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
        if (!listaElementos.isEmpty()) {
            return listaElementos.remove(0);
        } else {
            return null;
        }
    }
    public int getSize() {
        return listaElementos.size();
    }
}
