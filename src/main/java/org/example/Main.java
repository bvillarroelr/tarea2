package org.example;

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

    }
}