package org.example;
/**
 * La clase "Dulce" es una subclase de "Producto" que engloba a los distintos sabores
 * Extiende la funcionalidad de la clase base y proporciona métodos para obtener sus valores privados.
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public abstract class Dulce extends Producto {
    /**
     * Constructor de la clase. Inicializa el número de serie de el dulce.
     *
     * @param serie El número de serie de el dulce.
     */
    public Dulce(int serie) {
        super(serie);
    }
    /**
     * Obtiene el número de serie de el dulce.
     *
     * @return El número de serie de el dulce.
     */
    public int getSerie() {
        return super.serie;
    }
}
