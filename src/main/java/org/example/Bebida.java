package org.example;
/**
 * La clase "Bebida" es una subclase de "Producto" que engloba a los distintos sabores
 * Extiende la funcionalidad de la clase base y proporciona métodos para obtener sus valores privados.
 *
     * @author Benjamin V.
     * @author Martin L.
 *
 * @version 1.0
 */
abstract class Bebida extends Producto{
    /**
     * Constructor de la clase "Bebida". Inicializa el número de serie del producto de bebida.
     *
     * @param serie El número de serie de la bebida.
     */
    public Bebida(int serie) {
        super(serie);
    }
    /**
     * Obtiene el número de serie de la bebida.
     *
     * @return El número de serie de la bebida.
     */
    public int getSerie() {
        return super.serie;
    }
}
