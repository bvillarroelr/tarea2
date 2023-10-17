package org.example;
abstract class Bebida extends Producto{
    public Bebida(int serie) {
        super(serie);
    }

    public int getSerie() {
        return 0; // Revisar/corregir, super.serie es private (propiedad de la clase Producto)
    }
    public abstract String beber();
}
