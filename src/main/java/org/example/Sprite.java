package org.example;

/**
 * La clase "Sprite" es una subclase de "Bebida" y es un sabor específico
 * Permite usar el método consumir.
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class Sprite extends Bebida {

    /**
     * Constructor de la clase "Sprite". Inicializa la propiedad serie de Sprite.
     *
     * @param serie El número de serie de Sprite.
     */
    public Sprite(int serie) {
        super(serie);
    }

    /**
     * Implementación del método "consumir" para Sprite. Devuelve una cadena que representa el sabor de la bebida.
     *
     * @return Una cadena con el sabor de la bebida.
     */
    @Override
    public String consumir() {
        String sabor = new String("sprite");
        return sabor;
    }
}
