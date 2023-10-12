package org.example;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> lista;
    private ArrayList<Moneda> monedillas;
    public Deposito() {
        lista = new ArrayList();
        monedillas = new ArrayList();
    }
    public void addBebida(Bebida b) {
        lista.add(b);
    }
    public Bebida getBebida() {
        if(lista.size() > 0){
            return lista.remove(0);
        }
        else{
            return null;
        }
    }
    public void addMoneda(Moneda m){
        monedillas.add(m);
    }
    public Moneda getMoneda(){
        if(monedillas.size() != 0){
            return monedillas.remove(0);
        }
        return null;
    }
}
