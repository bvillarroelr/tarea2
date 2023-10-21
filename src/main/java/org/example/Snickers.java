package org.example;

/**
 * La clase "Snickers" es una subclase de "Dulce" y es un tipo específico
 * Permite usar el método consumir.
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class Snickers extends Dulce {

    /**
     * Constructor de la clase "Snickers". Inicializa la propiedad serie de Snickers.
     *
     * @param serie El número de serie de Snickers.
     */
    public Snickers(int serie) {
        super(serie);
    }

    /**
     * Implementación del método "consumir" para Snickers. Devuelve una cadena que representa el dulce consumido.
     *
     * @return Una cadena con el dulce consumido.
     */
    @Override
    public String consumir() {
        String sabor = new String("snicker");
        return sabor;
    }
}