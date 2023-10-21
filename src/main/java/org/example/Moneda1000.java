package org.example;

/**
 * La clase "Moneda1000" es una subclase de "Moneda" con un valor 1000 definido.
 * implementa con su cantidad "getValor".
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class Moneda1000 extends Moneda {
    /**
     * Constructor de la clase "Moneda1000". Inicializa la moneda
     */
    public Moneda1000() {
        super();
    }
    /**
     * Metodo Getter para el valor numerico.
     *
     * @return retorna la cte 1000.
     */
    @Override
    public int getValor() {
        return 1000;
    }
}