package org.example;

public abstract class Dulce extends Producto {
    public Dulce(int serie) {
        super(serie);
    }
    public int getSerie() {
        return super.serie;
    }
    public abstract String comer();
}
