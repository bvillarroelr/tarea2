package org.example;

public class Expendedor {
    public static final int COCA=1;
    public static final int SPRITE=2;
    private Deposito coca, sprite, monVu;
    private int precio;
    private int numcoca;
    private int numsprite;
    public int aux3;

    public Expendedor(int numBebidas, int precioBebidas){
        this.precio = precioBebidas;
        numcoca=numBebidas;
        numsprite=numBebidas;
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new Deposito();
        for(int i=0; i<numBebidas; i++){
            Bebida b = new CocaCola(i);
            coca.addBebida(b);
            Bebida c = new Sprite(i);
            sprite.addBebida(c);
        }
    }
    public Bebida comprarBebida(Moneda m, int cual){
        if(m==null){
            return null;
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
    public int ayuda(){
        aux3 = numsprite;
        return aux3;
    }
}
