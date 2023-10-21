package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {
    @Test
    public void test1() {
        Moneda monedaPrueba = new Moneda1500();
        Expendedor expPrueba = new Expendedor(2);
        Comprador clientePrueba = new Comprador(monedaPrueba, 1, expPrueba);
    }
}