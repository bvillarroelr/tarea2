package org.example;

public class Expendedor {
    private Deposito<Bebida> depCoca, depSprite, depFanta;
    private Deposito<Dulce> depSuper8, depSnickers;
    private Deposito<Moneda> monVu;

    public Expendedor(int numProductos){ // precioBebidas lo cambiaremos, pues para eso tenemos enum
        depCoca = new Deposito();
        depSprite = new Deposito();
        depFanta = new Deposito();
        depSuper8 = new Deposito();
        depSnickers = new Deposito();
        monVu = new Deposito();
        for(int i=0; i<numProductos; i++){
            Bebida c = new CocaCola(i);
            Bebida s = new Sprite(i);
            Bebida f = new Fanta(i);
            Dulce sn = new Snickers(i);
            Dulce s8 = new Super8(i);

            depCoca.addElemento(c);
            depSprite.addElemento(s);
            depFanta.addElemento(f);
            depSnickers.addElemento(sn);
            depSuper8.addElemento(s8);
        }
    }
    public Producto comprarProducto(Moneda m,Detalles cual) {
        // Por hacer: comprar dulces (frugele o chocman)
        if (m == null)  throw new PagoIncorrectoException("No se ha encontrado una moneda");

        if(cual==Detalles.COCA && depCoca.getSize() > 0 ){
                if(m.getValor() < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
            calcularVueltoBebida(m);
            return depCoca.getElemento();
        }
         if(cual==Detalles.SPRITE && depSprite.getSize()>0 ){
             if(m.getValor() < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
             calcularVueltoBebida(m);
             return depSprite.getElemento();
        }
         if(cual==Detalles.FANTA && depFanta.getSize() > 0 ){
                 if(m.getValor() < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
             calcularVueltoBebida(m);
            return depFanta.getElemento();
        }
         if(cual==Detalles.SNICKER && depSnickers.getSize() > 0  ){
                 if(m.getValor() <  Detalles.DULCES.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
             calcularVueltoDulce(m);
             return depSnickers.getElemento();
        }
         if(cual==Detalles.SUPER8 && depSuper8.getSize()> 0 ){
             if(m.getValor() <  Detalles.DULCES.getDetalle()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
             calcularVueltoDulce(m);
             return depSuper8.getElemento();
        }
         throw new NoHayProductoException("No hay Productos Disponible");


    }
    public Moneda getVuelto(){
        return monVu.getElemento();
    }
    private void calcularVueltoBebida(Moneda m) {
        for (int i = 0; i < m.getValor() - Detalles.BEBIDAS.getDetalle(); i += 100) {
            Moneda a = new Moneda100();
            monVu.addElemento(a);
        }
    }
    private void calcularVueltoDulce(Moneda m){
                for(int i=0;i<m.getValor() - Detalles.DULCES.getDetalle();i+=100){
                    Moneda a = new Moneda100();
                    monVu.addElemento(a);
        }
    }
}