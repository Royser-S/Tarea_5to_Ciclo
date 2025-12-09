package com.tarea01.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tarea01.dtop.EstudianteDTO;
import com.tarea01.entity.Estudiante;
import com.tarea01.mapper.EstudianteMapper;
import com.tarea01.repository.EstudianteRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class EstudianteService {
	
	private final EstudianteRepository repository;
    private final EstudianteMapper mapper;

    // Método para guardar datos de prueba
    public Estudiante guardarPrueba() {
        Estudiante e = new Estudiante();
        e.setNombre("Juan");
        e.setApellido("Perez");
        e.setEmail("juan@correo.com");
        e.setPassword("secreto123"); // Esto NO se verá en el DTO
        e.setFechaRegistro(LocalDateTime.now());
        return repository.save(e);
    }

    // Método que devuelve DTOs
    public List<EstudianteDTO> listarTodos() {
        List<Estudiante> listaEntidad = repository.findAll();
        
        // Usamos el Mapper para convertir cada entidad en DTO
        return listaEntidad.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

}
