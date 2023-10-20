package org.example;

public class Expendedor {
    public static final int COCA = 1;
    public static final int FANTA = 2;
    public static final int SPRITE = 3;
    public static final int SNICKERS = 4;
    public static final int SUPER8 = 5;
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
    public Producto comprarProducto(Moneda m, int cual) {
        // Por hacer: comprar dulces (frugele o chocman)
        if (m == null)  throw new PagoIncorrectoException("No se ha encontrado una moneda");

        if(cual==COCA && depCoca.getSize() > 0 ){
            if(m.getValor() < Precios.BEBIDAS.getPrecio()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
            calcularVueltoBebida(m);
            return depCoca.getElemento();
        }
         if(cual==SPRITE && depSprite.getSize()>0 ){
             if(m.getValor() < Precios.BEBIDAS.getPrecio()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
             calcularVueltoBebida(m);
             return depSprite.getElemento();
        }
         if(cual==FANTA && depFanta.getSize() > 0 ){
             if(m.getValor() < Precios.BEBIDAS.getPrecio()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
             calcularVueltoBebida(m);
            return depFanta.getElemento();
        }
         if(cual== SNICKERS && depSnickers.getSize() > 0  ){
             if(m.getValor() <  Precios.DULCES.getPrecio()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
             calcularVueltoDulce(m);
             return depSnickers.getElemento();
        }
         if(cual== SUPER8 && depSuper8.getSize()> 0 ){
             if(m.getValor() <  Precios.DULCES.getPrecio()) throw new PagoInsuficienteException("No hay Productos en el Deposito");
             calcularVueltoDulce(m);
             return depSuper8.getElemento();
        }
         throw new NoHayProductoException("No hay Productos Disponible");


    }
    public Moneda getVuelto(){
        return monVu.getElemento();
    }
    private void calcularVueltoBebida(Moneda m) {
        for (int i = 0; i < m.getValor() - Precios.BEBIDAS.getPrecio(); i += 100) {
            Moneda a = new Moneda100();
            monVu.addElemento(a);
        }
    }
    private void calcularVueltoDulce(Moneda m){
                for(int i=0;i<m.getValor() - Precios.DULCES.getPrecio();i+=100){
                    Moneda a = new Moneda100();
                    monVu.addElemento(a);
        }
    }
}