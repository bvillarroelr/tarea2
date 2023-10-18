package org.example;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> listaBebidas;
    private ArrayList<Dulce> listaDulces;
    private ArrayList<Moneda> monedillas;
    public Deposito() {
        listaBebidas = new ArrayList();
        monedillas = new ArrayList();
    }
    public Dulce getDulce() {
        if(listaDulces.size() > 0){
            return listaDulces.remove(0);
        }
        else{
            return null;
        }
    }
    public void addDulce(Dulce caramelo) {
        listaDulces.add(caramelo);
    }
    public void addBebida(Bebida b) {
        listaBebidas.add(b);
    }

    public Bebida getBebida() {
        if(listaBebidas.size() > 0){
            return listaBebidas.remove(0);
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
