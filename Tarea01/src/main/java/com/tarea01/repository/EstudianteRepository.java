package com.tarea01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarea01.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> { }