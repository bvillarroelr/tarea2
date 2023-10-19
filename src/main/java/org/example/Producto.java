package org.example;

public abstract class Producto {
    protected int serie;    // De esta forma se puede trabajar con la propiedad en todas las subclases
    public Producto(int serie) {
        this.serie = serie;
    }
    public abstract String consumir();
    public boolean esNulo(Producto p) {
        if (p == null) {
            return true;
        }
        else {
            return false;
        }
    }
}
