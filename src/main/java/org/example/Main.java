package org.example;
public class Main {
    public static void main(String[] args) {

        //TEST ENUM
        System.out.println("" + Precios.BEBIDAS.getPrecio());

        try {
            Expendedor vendomatica = new Expendedor(3);;
        }
        catch(PagoInsuficienteException e){
            System.out.println("Exception: " + e.getMessage());
        }
        // Creación de los objetos a utilizar
        Expendedor vendomatica = new Expendedor(3);
        Moneda mil500 = new Moneda1500();
        Moneda mil = new Moneda1000();
        Moneda quinientos = new Moneda500();
        Moneda cien = new Moneda100();
        Comprador clienteA = new Comprador(mil500, 1, vendomatica);
        Comprador clienteB = new Comprador(mil, 2, vendomatica);
        Comprador clienteC = new Comprador(quinientos, 3, vendomatica);
        Comprador clienteD = new Comprador(cien, 4, vendomatica);

        System.out.println("Consumiste: "+clienteA.queConsumiste()+". Vuelto: "+clienteA.cuantoVuelto());
        System.out.println("Consumiste: "+clienteB.queConsumiste()+". Vuelto: "+clienteB.cuantoVuelto());
        System.out.println("Consumiste: "+clienteC.queConsumiste()+". Vuelto: "+clienteC.cuantoVuelto());   // Falta implementar exception (en este caso pago insuficiente)
        System.out.println("Consumiste: "+clienteD.queConsumiste()+". Vuelto: "+clienteD.cuantoVuelto());
        // Prueba de Excepcion
        try {
            Comprador clienteE = new Comprador(null, 1, vendomatica);
        }
        catch(PagoIncorrectoException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}