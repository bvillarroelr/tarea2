package org.example;

/**
 * La clase "Moneda500" es una subclase de "Moneda" con un valor 500 definido.
 * implementa con su cantidad "getValor".
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class Moneda500 extends Moneda {
    /**
     * Constructor de la clase "Moneda500". Inicializa la moneda
     */
    public Moneda500() {
        super();
    }
    /**
     * Metodo Getter para el valor numerico.
     *
     * @return retorna la cte 500.
     */
    @Override
    public int getValor() {
        return 500;
    }
}