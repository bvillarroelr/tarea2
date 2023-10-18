package org.example;
abstract class Bebida extends Producto{
    public Bebida(int serie) {
        super(serie);
    }

    public int getSerie() {
        return super.serie; // Revisar/corregir, super.serie es private (propiedad de la clase Producto)
    }
    public abstract String beber();
}
