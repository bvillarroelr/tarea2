package org.example;

class NoHayProductoException extends RuntimeException {
    public NoHayProductoException(String message) {
        super(message);
    }
}
