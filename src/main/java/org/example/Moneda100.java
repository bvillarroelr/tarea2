package org.example;
/**
 * La clase "Moneda100" es una subclase de "Moneda" con un valor 100 definido.
 * implementa con su cantidad "getValor".
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class Moneda100 extends Moneda {
    /**
     * Constructor de la clase "Moneda100". Inicializa la moneda
     */
    public Moneda100() {
        super();
    }
    /**
     * Metodo Getter para el valor numerico.
     *
     * @return retorna la cte 100.
     */
    @Override
    public int getValor() {
        return 100;
    }
}