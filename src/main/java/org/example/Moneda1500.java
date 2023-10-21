package org.example;

/**
 * La clase "Moneda1500" es una subclase de "Moneda" con un valor 1500 definido.
 * implementa con su cantidad "getValor".
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class Moneda1500 extends Moneda {
    /**
     * Constructor de la clase "Moneda1500". Inicializa la moneda
     */
    public Moneda1500() {
        super();
    }
    /**
     * Metodo Getter para el valor numerico.
     *
     * @return retorna la cte 1500.
     */
    @Override
    public int getValor() {
        return 1500;
    }
}