package org.example;

public class Expendedor {
    public static final int COCA = 1;
    public static final int FANTA = 2;
    public static final int SPRITE = 3;
    public static final int CHOCMAN = 4;
    public static final int FRUGELE = 5;
    private Deposito coca, sprite, fanta, chocman, frugele, monVu;
    private int precio;
    private int numcoca;
    private int numfanta;
    private int numsprite;
    private int numchocman;
    private int numfrugele;

    public Expendedor(int numProductos, int precioBebidas){
        this.precio = precioBebidas;
        numcoca = numProductos;
        numsprite = numProductos;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        chocman = new Deposito();
        frugele = new Deposito();
        monVu = new Deposito();
        for(int i=0; i<numProductos; i++){
            Bebida b = new CocaCola(i);
            Bebida c = new Sprite(i);
            coca.addBebida(b);
            sprite.addBebida(c);
        }
    }
    public Producto comprarProducto(Moneda m, int cual){
        // Por hacer: comprar dulces (frugele o chocman)
        if(m==null){ throw new PagoIncorrectoException("No se ha encontrado una moneda");
        }
        else if(m.getValor()<precio){
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
        else if(cual==FANTA && numsprite>0){
            numfanta-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addMoneda(a);
            }
            return fanta.getBebida();
        }
        else if(cual== CHOCMAN && numsprite>0){
            numchocman-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addMoneda(a);
            }
            return chocman.getDulce();
        }
        else if(cual==FRUGELE && numsprite>0){
            numfrugele-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addMoneda(a);
            }
            return sprite.getDulce();
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
    public int getNumfanta() {
        return numfanta;
    }

    public int getNumchocman() {
        return numchocman;
    }

    public int getNumfrugele() {
        return numfrugele;
    }
}

// Quedo a preguntar al profesor si mantener excepciones en los archivos donde ocurren...
//
class PagoIncorrectoException extends RuntimeException {
    public PagoIncorrectoException(String message) {
        super(message);
    }
}