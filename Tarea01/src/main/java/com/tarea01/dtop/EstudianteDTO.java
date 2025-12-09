package com.tarea01.dtop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO {
	
	private Long id;
    private String nombreCompleto; // Un campo calculado
    private String email;

}
