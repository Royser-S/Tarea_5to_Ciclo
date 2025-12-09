package com.tarea02.exception;

public class ProductoNoEncontradoException extends RuntimeException {
    
    public ProductoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}