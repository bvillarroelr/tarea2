package org.example;

public class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        int aux2 = 0;
        Bebida b = exp.comprarBebida(m,cualBebida);
        aux2=exp.ayuda();
        if(cualBebida == 1 || cualBebida == 2){
            int aux = 0;
            while(exp.getVuelto() != null){
                aux += 100;
            }
            if(b != null){
                sonido = b.beber();
                vuelto = aux;
            }
            else if(b == null && m != null){
                sonido = null;
                vuelto = aux;
            }
            else if(b != null && m != null){
                sonido = null;
                vuelto = aux;
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
