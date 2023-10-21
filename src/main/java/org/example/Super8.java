package org.example;
/**
 * La clase "Super8" es una subclase de "Dulce" y es un tipo especifico
 * Permite usar el metodo consumir.
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
public class Super8 extends Dulce {
    /**
     * Constructor de la clase "Super8". Inicializa la propiedad serie de Super8.
     *
     * @param serie El número de serie de Super8.
     */
    public Super8(int serie) {
        super(serie);
    }
    /**
     * Implementación del método "consumir" para Super8. Devuelve una cadena que representa el dulce consumido.
     *
     * @return Una cadena con el dulce consumido.
     */
    @Override
    public String consumir(){
        String sabor = new String("Super8");
        return sabor;
    }
}

