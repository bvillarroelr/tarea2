package org.example;
/**
 * La excepción NoHayProductoException se lanza cuando no hay productos disponibles (Deposito vacio o entrada Invalida).
 */
class NoHayProductoException extends RuntimeException {
    public NoHayProductoException(String message) {
        super(message);
    }
}
