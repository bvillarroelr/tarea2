package org.example;

public class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }
    @Override
    public String beber(){
        String sabor = new String("sprite");
        return sabor;
    }
}