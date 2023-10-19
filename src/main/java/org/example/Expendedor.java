package org.example;

public class Expendedor {
    public static final int COCA = 1;
    public static final int FANTA = 2;
    public static final int SPRITE = 3;
    public static final int CHOCMAN = 4;
    public static final int FRUGELE = 5;
    private Deposito<Bebida> coca, sprite, fanta;
    private Deposito<Dulce> chocman, frugele;
    private Deposito<Moneda> monVu;
    private int precio;
    private int numcoca;
    private int numfanta;
    private int numsprite;
    private int numchocman;
    private int numfrugele;

    public Expendedor(int numProductos, int precioBebidas){ // precioBebidas lo cambiaremos, pues para eso tenemos enum
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
            coca.addElemento(b);
            sprite.addElemento(c);
        }
    }
    public Producto comprarProducto(Moneda m, int cual){
        // Por hacer: comprar dulces (frugele o chocman)
        if(m==null){ throw new PagoIncorrectoException("No se ha encontrado una moneda");}
        else if(m.getValor()<precio) { throw new PagoInsuficienteException("No dispone de suficiente saldo");}

        else if(cual==COCA && numcoca>0){
            numcoca-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addElemento(a);
            }
            return coca.getElemento();
        }
        else if(cual==SPRITE && numsprite>0){
            numsprite-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addElemento(a);
            }
            return sprite.getElemento();
        }
        else if(cual==FANTA && numsprite>0){
            numfanta-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addElemento(a);
            }
            return fanta.getElemento();
        }
        else if(cual== CHOCMAN && numsprite>0){
            numchocman-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addElemento(a);
            }
            return chocman.getElemento();
        }
        else if(cual==FRUGELE && numsprite>0){
            numfrugele-=1;
            for(int i=0;i<m.getValor()-precio;i+=100){
                Moneda a = new Moneda100();
                monVu.addElemento(a);
            }
            return sprite.getElemento();
        }
        else {
            for(int i=0;i<m.getValor();i+=100){
                Moneda a = new Moneda100();
                monVu.addElemento(a);
            }
            return null;
        }
    }
    public Moneda getVuelto(){
        return monVu.getElemento();
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