package org.example;
import java.lang.Comparable;
/**
 * La clase abstracta "Moneda" es una clase base para representar monedas genéricas.
 * Permite adicionionalmente comparar monedas.
 * Las subclases implementan "getValor".
 *
 * @author Benjamin V.
 * @author Martin L.
 *
 * @version 1.0
 */
abstract class Moneda implements Comparable<Moneda>{
    /**
     * Constructor de la clase "Moneda". Inicializa una moneda genérica.
     */
    public Moneda(){
        ;
    }
    /**
     * Obtiene el valor numérico de la moneda.
     *
     * @return El valor numérico de la moneda.
     */
    public abstract int getValor();
    /**
     * Permite comparar la moneda desde donde se ejecuta con otra.
     *
     * @param m La moneda con la que se va a comparar.
     * @return Un valor positivo si esta moneda tiene un valor mayor, un valor negativo si tiene un valor menor, o 0 si son iguales.
     */
    public int compareTo(Moneda m){
        if (this.getValor() > m.getValor()) {
            return 1;
        } else if (this.getValor() < m.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
}
