package org.example;

/**
 * La clase Comprador permite realizar las transacciones recibiendo los valores a trabajar y conteniendo los resultados.
 */
public class Comprador {
    private String consumiste;
    private int vuelto;

    /**
     * Constructor de la clase Comprador.
     *
     * @param m             La moneda para realizar la compra.
     * @param cualProducto  El Producto a comprar.
     * @param exp           El expendedor en el que se realizara la compra.
     */
    public Comprador(Moneda m, Detalles cualProducto, Expendedor exp) {
        Producto p = exp.comprarProducto(m, cualProducto);
        int temp = 0;

        if (cualProducto == Detalles.COCA || cualProducto == Detalles.SPRITE || cualProducto == Detalles.FANTA ||
                cualProducto == Detalles.SNICKER || cualProducto == Detalles.SUPER8) {
            // El ciclo verifica si hay vuelto en el expendedor.
            while (exp.getVuelto() != null) {
                temp += 100;
            }
            consumiste = p.consumir();
            vuelto = temp;
        }
    }

    /**
     * Getter del Vuelto.
     *
     * @return La cantidad de vuelto.
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * Getter del producto consumido.
     *
     * @return el producto consumido.
     */
    public String queConsumiste() {
        return consumiste;
    }
}
