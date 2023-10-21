package org.example;
/**
 * La clase "CocaCola" es una subclase de "Bebida" y es un sabor especifico
 * Permite usar el metodo consumir.
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class CocaCola extends Bebida{
    /**
     * Constructor de la clase "CocaCola". Inicializa la propiedad serie de CocaCola.
     *
     * @param serie El número de serie de Coca-Cola.
     */
    public CocaCola(int serie) {
        super(serie);
    }
    /**
     * Implementación del método "consumir" para la Coca-Cola. Devuelve una cadena que representa el sabor de la bebida.
     *
     * @return Una cadena con el sabor de la bebida.
     */
    @Override
    public String consumir(){
        String sabor = new String("cocacola");
        return sabor;
    }
}
