package org.example;
/**
 * La excepción PagoIncorrectoException se lanza cuando no se encontro moneda (moneda null).
 */
class PagoIncorrectoException extends RuntimeException {
    public PagoIncorrectoException(String message) {
        super(message);
    }
}