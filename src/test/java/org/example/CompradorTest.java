package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {
    // Testeamos que los métodos queConsumiste() y cuantoVUelto() devuelven lo esperado
    @Test
    public void test1() {
        Moneda monedaPrueba1 = new Moneda1500();
        Expendedor expPrueba1 = new Expendedor(1);
        Comprador clientePrueba1 = new Comprador(monedaPrueba1, Detalles.COCA, expPrueba1);
        int esperado1 = 1500 - Detalles.BEBIDAS.getDetalle();
        assertNotNull(clientePrueba1.queConsumiste());
        assertEquals(esperado1, clientePrueba1.cuantoVuelto());
    }
    @Test
    public void test2() {
        Moneda monedaPrueba2 = new Moneda1000();
        Expendedor expPrueba2 = new Expendedor(1);
        Comprador clientePrueba2 = new Comprador(monedaPrueba2, Detalles.COCA, expPrueba2);
        int esperado1 = 1000 - Detalles.BEBIDAS.getDetalle();
        assertNotNull(clientePrueba2.queConsumiste());
        assertEquals(esperado1, clientePrueba2.cuantoVuelto());
    }
}