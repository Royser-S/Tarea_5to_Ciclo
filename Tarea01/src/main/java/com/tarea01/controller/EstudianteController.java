package com.tarea01.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea01.dtop.EstudianteDTO;
import com.tarea01.entity.Estudiante;
import com.tarea01.service.EstudianteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/estudiantes")
@RequiredArgsConstructor
public class EstudianteController {
	
	private final EstudianteService service;

    @PostMapping("/crear-prueba")
    public Estudiante crear() {
        return service.guardarPrueba();
    }

    @GetMapping
    public List<EstudianteDTO> listar() {
        return service.listarTodos();
    }

}
