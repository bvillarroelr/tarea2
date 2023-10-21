package org.example;

/**
 * La clase "Fanta" es una subclase de "Bebida" y es un sabor específico
 * Permite usar el método consumir.
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class Fanta extends Bebida {

    /**
     * Constructor de la clase "Fanta". Inicializa la propiedad serie de Fanta.
     *
     * @param serie El número de serie de Fanta.
     */
    public Fanta(int serie) {
        super(serie);
    }

    /**
     * Implementación del método "consumir" para Fanta. Devuelve una cadena que representa el sabor de la bebida.
     *
     * @return Una cadena con el sabor de la bebida.
     */
    @Override
    public String consumir() {
        String sabor = new String("fanta");
        return sabor;
    }
}