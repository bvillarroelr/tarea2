package org.example;

public class Frugele extends Dulce {
    public Frugele(int serie) {
        super(serie);
    }
    public String comer() {
        String sabor = new String("frutos rojos");  // Se me ocurrió que podriamos hacer que devuelva un sabor random cada vez c:
        return sabor;
    }
}
