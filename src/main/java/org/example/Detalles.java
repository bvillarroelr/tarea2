package org.example;

/**
 * La enumeración Detalles contiene las ctes. usadas para elegir productos y acceder a precios
 */
public enum Detalles {
    COCA(1),
    SPRITE(2),
    FANTA(3),
    SNICKER(4),
    SUPER8(5),
    BEBIDAS(800),
    DULCES(500);

    private int det;

    /**
     * Constructor de la enumeración Detalles.
     *
     * @param det Enumeracion de Enteros.
     */
    Detalles(int det) {
        this.det = det;
    }

    /**
     * getter de cualquier parametro del enum.
     *
     * @return valor numerico del detalle solicitado.
     */
    public int getDetalle() {
        return det;
    }
}
