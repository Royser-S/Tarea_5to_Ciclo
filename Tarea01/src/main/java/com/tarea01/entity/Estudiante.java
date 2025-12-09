package com.tarea01.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estudiantes")
public class Estudiante {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String email;
    
    // Datos que NO queremos mostrar al público
    private String password;
    private LocalDateTime fechaRegistro;
	
}
