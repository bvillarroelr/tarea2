package org.example;

public class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida b = exp.comprarBebida(m,cualBebida);
        if(cualBebida == 1 || cualBebida == 2){
            int temp = 0;
            while(exp.getVuelto() != null){
                temp += 100;
            }
            if(b != null){
                sonido = b.beber();
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
        else if(cualBebida != 1 && cualBebida != 2){
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
