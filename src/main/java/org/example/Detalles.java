package org.example;
/**
 * La enumeración "Precios" contiene los precios de los distintos tipos y sabores de productoss.
 *
 * @version 1.0
 */
public enum Detalles{
    COCA(1),
    SPRITE(2),
    FANTA(3),
    SNICKER(4),
    SUPER8(5),
    BEBIDAS(800),
    DULCES(500);
    private int det;
    /**
     * Constructor de la enumeracion.
     * Asigna los valores.
     *
     * @param det El valor de precio asociado a la constante enum.
     */
    Detalles(int det) {
        this.det = det;
    }
    /**
     * Permite obener el valor numerico.
     *
     * @return retorna la constante solicitada.
     */

    public int getDetalle(){
        return det;
    }
}


