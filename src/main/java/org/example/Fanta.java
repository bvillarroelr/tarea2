package org.example;

public class Fanta extends Bebida{
    public Fanta(int serie) {
        super(serie);
    }
    @Override
    public String beber(){
        String sabor = new String("fanta");
        return sabor;
    }
}
