package org.example;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int CHOCMAN = 3;
    public static final int FRUGELE = 4;
    private Deposito coca, sprite, monVu;
    private int precio;
    private int numcoca;
    private int numsprite;

    public Expendedor(int numBebidas, int precioBebidas){
        this.precio = precioBebidas;
        numcoca = numBebidas;
        numsprite = numBebidas;
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new Deposito();
        for(int i=0; i<numBebidas; i++){
            Bebida b = new CocaCola(i);
            Bebida c = new Sprite(i);
            coca.addBebida(b);
            sprite.addBebida(c);
        }
    }
    public Bebida comprarProducto(Moneda m, int cual){
        // Por hacer: comprar dulces (frugele o chocman)
        if(m==null){ throw new PagoIncorrectoException("No se ha encontrado una moneda");
        }
        else if(m.getValor()<precio){
            for(int i=0;i<m.getValor();i+=100){
                Moneda a = new Moneda100();
                monVu.addMoneda(a);
            }
            return null;
        }
        else if(cual==COCA && numcoca>0){
            numcoca-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addMoneda(a);
            }
            return coca.getBebida();
        }
        else if(cual==SPRITE && numsprite>0){
            numsprite-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addMoneda(a);
            }
            return sprite.getBebida();
        }
        else {
            for(int i=0;i<m.getValor();i+=100){
                Moneda a = new Moneda100();
                monVu.addMoneda(a);
            }
            return null;
        }
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
    public int getNumsprite(){
        return numsprite;
    }
    public int getNumcoca() {
        return numcoca;
    }
}

// Quedo a preguntar al profesor si mantener excepciones en los archivos donde ocurren...
//
class PagoIncorrectoException extends RuntimeException {
    public PagoIncorrectoException(String message) {
        super(message);
    }
}