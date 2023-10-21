package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {
    @Test
    public void test1() {
        // Testeamos si efectivamente los tamaños del ArrayList se ajustan correctamente
        Deposito dep1 = new Deposito();
        Producto c = new CocaCola(1);
        Producto s = new Sprite(2);
        dep1.addElemento(c);
        dep1.addElemento(s);
        assertEquals(2,dep1.getSize());
        dep1.getElemento();
        assertEquals(1,dep1.getSize());
    }
}