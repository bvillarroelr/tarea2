package org.example;

// Enumeracion de precios ctes. Falta modificar Expendedor y añadir metodos
public enum Precios{
    BEBIDAS(800),
    DULCES(500);
    private int precio;
    Precios(int precio) {
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
}


