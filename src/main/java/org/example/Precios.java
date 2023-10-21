package org.example;
/**
 * La enumeración "Precios" contiene los precios de los distintos tipos y sabores de productoss.
 *
 * @version 1.0
 */
public enum Precios{
    BEBIDAS(800),
    DULCES(500);
    private int precio;
    /**
     * Constructor de la enumeracion.
     * Asigna los valores.
     *
     * @param precio El valor de precio asociado a la constante enum.
     */
    Precios(int precio) {
        this.precio = precio;
    }
    /**
     * Permite obener el valor numerico.
     *
     * @return retorna la constante solicitada.
     */

    public int getPrecio(){
        return precio;
    }
}


