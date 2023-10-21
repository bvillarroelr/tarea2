package org.example;
/**
 * La excepción PagoInsuficienteException se lanza cuando la moneda no vale lo suficiente para la transaccion.
 */
class PagoInsuficienteException extends RuntimeException {
    public PagoInsuficienteException(String message) {
        super(message);
    }
}