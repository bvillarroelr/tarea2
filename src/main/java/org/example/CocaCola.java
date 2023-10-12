package org.example;

public class CocaCola extends Bebida{
    public CocaCola(int serie) {
        super(serie);
    }
    @Override
    public String beber(){
        String sabor = new String("cocacola");
        return sabor;
    }
}
