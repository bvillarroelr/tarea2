package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {
    @Test
    public void test1() {
        Expendedor e = new Expendedor(3);
        Moneda m = new Moneda1000();
        Producto prueba1 = e.comprarProducto(m, Detalles.COCA);
        Producto prueba2 = e.comprarProducto(m, Detalles.FANTA);
        Producto prueba3 = e.comprarProducto(m, Detalles.SPRITE);
        Producto prueba4 = e.comprarProducto(m, Detalles.SUPER8);
        Producto prueba5 = e.comprarProducto(m, Detalles.SNICKER);
        assertNotNull(prueba1);
        assertNotNull(prueba2);
        assertNotNull(prueba3);
        assertNotNull(prueba4);
        assertNotNull(prueba5);
    }
    @Test
    public void test2() {
        Expendedor e = new Expendedor(1);
        Moneda m = new Moneda1000();
        Producto prueba1 = e.comprarProducto(m, Detalles.COCA);
        Moneda monedaPrueba = e.getVuelto();
        assertNotNull(monedaPrueba);
    }
}