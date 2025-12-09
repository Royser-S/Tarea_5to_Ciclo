package com.tarea03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RecursoController {
	
	// PUERTA 1: Pública
    // Aquí cualquiera debería poder entrar sin contraseña
    @GetMapping("/publico")
    public String saludoPublico() {
        return "¡Hola! Este es un contenido público. Cualquiera puede verlo.";
    }

    // PUERTA 2: Privada
    // Aquí el guardia te detendrá si no tienes credenciales
    @GetMapping("/privado")
    public String saludoPrivado() {
        return "¡Bienvenido, Administrador! Si lees esto, te has autenticado correctamente.";
    }	

}
