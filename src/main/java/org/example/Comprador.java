package org.example;

public class Comprador {
    private String consumiste;
    private int vuelto;
    // Arreglar
    public Comprador(Moneda m, int cualProducto, Expendedor exp){
        Producto p = exp.comprarProducto(m,cualProducto);
        if(cualProducto == 1 || cualProducto == 2 || cualProducto == 3 || cualProducto == 4 || cualProducto == 5){
            consumiste = p.consumir();
            vuelto = exp.Vuelto() * 100;
            }
        else {
            vuelto = m.getValor();
            throw new NoHayProductoException("Entrada Invalida");
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return consumiste;
    }
}
