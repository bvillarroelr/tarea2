package org.example;

public class Snickers extends Dulce {
    public Snickers(int serie) {
        super(serie);
    }
    @Override
    public String consumir() {
        String sabor = new String("snicker");
        return sabor;
    }
}