package org.example;

public class Comprador {
    private String consumiste;
    private int vuelto;
    // Arreglar
    public Comprador(Moneda m, int cualProducto, Expendedor exp){
        Producto p = exp.comprarProducto(m,cualProducto);
        int temp = 0;
        if(cualProducto == 1 || cualProducto == 2 || cualProducto == 3 || cualProducto == 4 || cualProducto == 5){
            // Al final los casos se resumen a verificar si hay productos en el depósito, y si la moneda no es nula, pero de igual forma hay que testearlo
            while(exp.getVuelto() != null) temp += 100;
            consumiste = p.consumir();
            vuelto = temp;
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return consumiste;
    }
}
