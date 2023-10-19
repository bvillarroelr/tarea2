package org.example;
public class Main {
    public static void main(String[] args) {
        // Creación de los objetos a utilizar
        Expendedor vendomatica = new Expendedor(3,800);
        Moneda mil500 = new Moneda1500();
        Moneda mil = new Moneda1000();
        Moneda quinientos = new Moneda500();
        Moneda cien = new Moneda100();
        Comprador clienteA = new Comprador(mil500, 1, vendomatica);
        Comprador clienteB = new Comprador(mil, 2, vendomatica);
        Comprador clienteC = new Comprador(quinientos, 3, vendomatica);
        Comprador clienteD = new Comprador(cien, 4, vendomatica);

        System.out.println("Vuelto: "+clienteA.cuantoVuelto());
        System.out.println("Vuelto: "+clienteB.cuantoVuelto());
        System.out.println("Vuelto: "+clienteC.cuantoVuelto());
        System.out.println("Vuelto: "+clienteD.cuantoVuelto());

        // Prueba de Excepcion
        try {
            Comprador clienteE = new Comprador(null, 1, vendomatica);
        }
        catch(PagoIncorrectoException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}