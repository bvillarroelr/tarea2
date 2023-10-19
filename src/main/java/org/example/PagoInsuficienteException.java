package org.example;

class PagoInsuficienteException extends RuntimeException {
    public PagoInsuficienteException(String message) {
        super(message);
    }
}