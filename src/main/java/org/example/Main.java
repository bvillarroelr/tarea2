package org.example;
public class Main {
    public static void main(String[] args) {

            Expendedor vendomatica = new Expendedor(3);
            Moneda mil500 = new Moneda1500();
            Moneda mil = new Moneda1000();
            Moneda quinientos = new Moneda500();
            Moneda cien = new Moneda100();
            Comprador clienteA = new Comprador(mil500, 1, vendomatica);
            System.out.println("Vuelto: " + clienteA.cuantoVuelto());

            try {
                Comprador clienteB = new Comprador(mil, 2, vendomatica);
                Comprador clienteC = new Comprador(quinientos, 3, vendomatica);
                Comprador clienteD = new Comprador(cien, 4, vendomatica);
                Comprador clienteE = new Comprador(cien, 5, vendomatica);
                System.out.println("Vuelto: " + clienteB.cuantoVuelto());
                System.out.println("Vuelto: " + clienteC.cuantoVuelto());
                System.out.println("Vuelto: " + clienteD.cuantoVuelto());
                System.out.println("Vuelto: " + clienteE.cuantoVuelto());
            }
            catch(PagoInsuficienteException e) {System.out.println("rip");}

        // Prueba de Excepcion
        try {
            Comprador clienteF = new Comprador(null, 1, vendomatica);
        }
        catch(PagoIncorrectoException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}