package org.example;

public class Comprador {
    private String sonido;
    private int vuelto;
    // Arreglar
    public Comprador(Moneda m, int cualProducto, Expendedor exp){
        Producto b = exp.comprarProducto(m,cualProducto);
        if(cualProducto == 1 || cualProducto == 2){
            int temp = 0;
            while(exp.getVuelto() != null){
                temp += 100;
            }
            if(b != null){
                sonido = b.beber(); // cambiar
                vuelto = temp;
            }
            else if(b == null && m != null){
                sonido = null;
                vuelto = temp;
            }
            else if(b != null && m != null){
                sonido = null;
                vuelto = temp;
            }
        }
        else if(cualProducto != 1 && cualProducto != 2){
            sonido = null;
            vuelto = m.getValor();
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}
