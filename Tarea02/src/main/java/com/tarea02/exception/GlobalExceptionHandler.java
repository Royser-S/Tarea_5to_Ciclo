package com.tarea02.exception;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice 
public class GlobalExceptionHandler {

	
	// 1. Manejo de nuestra excepción UNCHECKED
    @ExceptionHandler(ProductoNoEncontradoException.class)
    public ResponseEntity<Map<String, Object>> manejarProductoNoEncontrado(ProductoNoEncontradoException ex) {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("error", "Error de Negocio (Unchecked)");
        respuesta.put("mensaje", ex.getMessage());
        respuesta.put("fecha", LocalDateTime.now());
        respuesta.put("estado", HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<>(respuesta, HttpStatus.NOT_FOUND);
    }

    // 2. Manejo de excepción CHECKED (IOException)
    @ExceptionHandler(IOException.class)
    public ResponseEntity<Map<String, Object>> manejarErrorDeArchivo(IOException ex) {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("error", "Error de Entrada/Salida (Checked)");
        respuesta.put("mensaje", "Ocurrió un error al intentar leer un archivo del sistema.");
        respuesta.put("detalle_tecnico", ex.getMessage()); // Solo para ver qué pasó
        respuesta.put("fecha", LocalDateTime.now());
        respuesta.put("estado", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return new ResponseEntity<>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
}
