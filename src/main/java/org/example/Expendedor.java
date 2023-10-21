package org.example;

/**
 * La clase Expendedor es la clase principal, contiene depositos de varios productos y metodos para realizar transacciones.
 */
public class Expendedor {
    private Deposito<Bebida> depCoca, depSprite, depFanta;
    private Deposito<Dulce> depSuper8, depSnickers;
    private Deposito<Moneda> monVu;

    /**
     * Constructor de la clase Expendedor.
     *
     * @param numProductos Describe cuanos productos contiene de cada producto.
     */
    public Expendedor(int numProductos) {
        depCoca = new Deposito();
        depSprite = new Deposito();
        depFanta = new Deposito();
        depSuper8 = new Deposito();
        depSnickers = new Deposito();
        monVu = new Deposito();
        for (int i = 0; i < numProductos; i++) {
            Bebida c = new Sprite(i);
            Bebida s = new CocaCola(i);
            Bebida f = new Fanta(i);
            Dulce sn = new Super8(i);
            Dulce s8 = new Snickers(i);

            depCoca.addElemento(c);
            depSprite.addElemento(s);
            depFanta.addElemento(f);
            depSnickers.addElemento(sn);
            depSuper8.addElemento(s8);
        }
    }

    /**
     * Método para comprar un cierto producto usando una moneda
     *
     * @param m     La moneda con la que se compra.
     * @param cual  El producto a elegir.
     * @return      El producto, ya habiendo calculado el vuelto.
     * @throws PagoIncorrectoException     Si no se ha encontrado una moneda.
     * @throws PagoInsuficienteException   Si el valor de la moneda es insuficiente para comprar el producto.
     * @throws NoHayProductoException      Si no hay productos disponibles del tipo especificado o se ha elegido un producto invalido.
     */
    public Producto comprarProducto(Moneda m, Detalles cual) {
        if (m == null)  throw new PagoIncorrectoException("No se ha encontrado una moneda");

        if (cual == Detalles.COCA && depCoca.getSize() > 0) {
            if (m.getValor() < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
            calcularVueltoBebida(m);
            return depCoca.getElemento();
        }
        if (cual == Detalles.SPRITE && depSprite.getSize() > 0) {
            if (m.getValor() < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
            calcularVueltoBebida(m);
            return depSprite.getElemento();
        }
        if (cual == Detalles.FANTA && depFanta.getSize() > 0) {
            if (m.getValor() < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
            calcularVueltoBebida(m);
            return depFanta.getElemento();
        }
        if (cual == Detalles.SNICKER && depSnickers.getSize() > 0) {
            if (m.getValor() < Detalles.DULCES.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
            calcularVueltoDulce(m);
            return depSnickers.getElemento();
        }
        if (cual == Detalles.SUPER8 && depSuper8.getSize() > 0) {
            if (m.getValor() < Detalles.DULCES.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
            calcularVueltoDulce(m);
            return depSuper8.getElemento();
        }
        throw new NoHayProductoException("No hay Productos Disponibles");
    }

    /**
     * Getter para el vuelto.
     *
     * @return El vuelto en forma de una moneda.
     */
    public Moneda getVuelto() {
        return monVu.getElemento();
    }

    /**
     * Método privado para calcular el vuelto de una compra de bebida (Optimiza el Codigo).
     *
     * @param m La moneda con la que se pagó.
     */
    private void calcularVueltoBebida(Moneda m) {
        for (int i = 0; i < m.getValor() - Detalles.BEBIDAS.getDetalle(); i += 100) {
            Moneda a = new Moneda100();
            monVu.addElemento(a);
        }
    }

    /**
     * Método privado para calcular el vuelto de una compra de dulce (Optimiza el Codigo).
     *
     * @param m La moneda con la que se pagó.
     */
    private void calcularVueltoDulce(Moneda m) {
        for (int i = 0; i < m.getValor() - Detalles.DULCES.getDetalle(); i += 100) {
            Moneda a = new Moneda100();
            monVu.addElemento(a);
        }
    }
}
