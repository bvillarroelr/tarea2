package org.example;

class PagoIncorrectoException extends RuntimeException {
    public PagoIncorrectoException(String message) {
        super(message);
    }
}