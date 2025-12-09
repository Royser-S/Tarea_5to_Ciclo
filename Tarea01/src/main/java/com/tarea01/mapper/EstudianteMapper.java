package com.tarea01.mapper;

import org.springframework.stereotype.Component;

import com.tarea01.dtop.EstudianteDTO;
import com.tarea01.entity.Estudiante;


@Component
public class EstudianteMapper {

	// Convierte de Entidad (BD) -> DTO (Vista)
    public EstudianteDTO toDTO(Estudiante estudiante) {
        if (estudiante == null) return null;

        EstudianteDTO dto = new EstudianteDTO();
        dto.setId(estudiante.getId());
        dto.setEmail(estudiante.getEmail());
        
        // Lógica de transformación: Unimos nombre y apellido
        dto.setNombreCompleto(estudiante.getNombre() + " " + estudiante.getApellido());
        
        return dto;
    }

    // Convierte de DTO (Vista) -> Entidad (BD)
    public Estudiante toEntity(EstudianteDTO dto) {
        if (dto == null) return null;

        Estudiante estudiante = new Estudiante();
        estudiante.setId(dto.getId());
        estudiante.setEmail(dto.getEmail());
        return estudiante;
    }
	
}
