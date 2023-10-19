package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Creación de los objetos a utilizar
        Expendedor vendomatica = new Expendedor(3,800);
        Moneda quina = new Moneda1000();
        Comprador cliente = new Comprador(quina, 1, vendomatica);
        System.out.println("Vuelto: "+cliente.cuantoVuelto());

        // Prueba de Excepcion
        try {
            Comprador cliente2 = new Comprador(null, 1, vendomatica);
        }
        catch(PagoIncorrectoException e){
            System.out.println("Exception: " + e.getMessage());
        }
        // Prueba de CompareTo
        List<Moneda> listaMonedas = new ArrayList<>();
        listaMonedas.add(new Moneda1500());
        listaMonedas.add(new Moneda500());
        listaMonedas.add(new Moneda1000());
        listaMonedas.add(new Moneda100());
        Collections.sort(listaMonedas);
        for (Moneda moneda : listaMonedas) {
            System.out.println("Valor de la moneda: " + moneda.getValor());
        }
    }
}