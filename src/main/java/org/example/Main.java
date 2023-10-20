package org.example;
public class Main {
    public static void main(String[] args) {

        // Monedas
        Moneda m1500 = new Moneda1500();
        Moneda m1000 = new Moneda1000();
        Moneda m500 = new Moneda500();
        Moneda m100 = new Moneda100();

        // Crear un expendedor (1 para luego ver las excepciones)
        Expendedor vendomatica = new Expendedor(3);

        Comprador clienteA = new Comprador(m1000, 1, vendomatica);
        Comprador clienteB = new Comprador(m1000, 2, vendomatica);
        Comprador clienteC = new Comprador(m1000, 3, vendomatica);
        Comprador clienteD = new Comprador(m1500, 4, vendomatica);
        Comprador clienteE = new Comprador(m1500, 5, vendomatica);

        System.out.println("Consumiste: "+clienteA.queConsumiste()+". Vuelto: "+clienteB.cuantoVuelto());
        System.out.println("Consumiste: "+clienteB.queConsumiste()+". Vuelto: "+clienteB.cuantoVuelto());
        System.out.println("Consumiste: "+clienteC.queConsumiste()+". Vuelto: "+clienteC.cuantoVuelto());
        System.out.println("Consumiste: "+clienteD.queConsumiste()+". Vuelto: "+clienteD.cuantoVuelto());
        System.out.println("Consumiste: "+clienteE.queConsumiste()+". Vuelto: "+clienteB.cuantoVuelto());

        // Excepciones
        try {
            Expendedor vendomaticaNula = new Expendedor(0);
            Comprador clienteF = new Comprador(m1500, 1, vendomaticaNula);
            System.out.println("Consumiste: "+clienteF.queConsumiste()+". Vuelto: "+clienteA.cuantoVuelto());
        }
        catch(NoHayProductoException e){
            System.out.println("Exception: " + e.getMessage() + " , Dinero Retornado:" + m1500.getValor());
        }
        try {
            Comprador clienteG = new Comprador(m100, 1, vendomatica);
            System.out.println("Consumiste: "+clienteG.queConsumiste()+". Vuelto: "+clienteA.cuantoVuelto());
        } catch(PagoInsuficienteException e){
            System.out.println("Excepcion: " + e.getMessage() + " , Dinero Retornado:" + m100.getValor());
        }
        try {
            Comprador clienteH = new Comprador(null, 1, vendomatica);
            System.out.println("Consumiste: "+clienteH.queConsumiste()+". Vuelto: "+clienteA.cuantoVuelto());
        } catch(PagoIncorrectoException e){
            System.out.println("Excepcion: " + e.getMessage() + " , Dinero Retornado:" + null);
        }
    }
}