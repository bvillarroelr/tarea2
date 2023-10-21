package org.example;

/**
 * La clase representa un producto generico
 * Sirve para usarlas en otras clases clasificadas Productos
 * Las subclases deben implementar el método "consumir" según sus necesidades específicas.
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public abstract class Producto {
    /**
     * Número de serie del producto.
     */
    protected int serie;
    /**
     * Constructor de la clase "Producto". Inicializa el número de serie del producto.
     *
     * @param serie El número de serie del producto.
     */
    public Producto(int serie) {
        this.serie = serie;
    }
    /**
     * Este método abstracto debe ser implementado por las subclases.
     * Representa cómo se consume el producto.
     *
     * @return Una cadena que dice que se consumio
     */
    public abstract String consumir();

}

/**
 *
 */