package com.tarea02.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea02.service.PruebaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/pruebas")
@RequiredArgsConstructor
public class PruebaController {
	
	private final PruebaService service;

    // Probar Unchecked: GET /api/pruebas/producto/0
    @GetMapping("/producto/{id}")
    public String obtenerProducto(@PathVariable Long id) {
        return service.buscarProducto(id);
    }

    // Probar Checked: GET /api/pruebas/archivo
    @GetMapping("/archivo")
    public void testArchivo() throws IOException {
        service.leerArchivo();
    }

}
