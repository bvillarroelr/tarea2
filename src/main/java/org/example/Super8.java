package org.example;

public class Super8 extends Dulce {
    public Super8(int serie) {
        super(serie);
    }
    @Override
    public String consumir(){
        String sabor = new String("chocolate");
        return sabor;
    }
}

