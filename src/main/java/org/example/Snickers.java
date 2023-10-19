package org.example;

public class Snickers extends Dulce {
    public Snickers(int serie) {
        super(serie);
    }
    public String consumir() {
        String sabor = new String("frutos rojos");  // Se me ocurrió que podriamos hacer que devuelva un sabor random cada vez c:
        return sabor;
    }
}