# Tarea 01: Implementación del Patrón DTO y Mapper en Spring Boot

Este proyecto demuestra la implementación del patrón de diseño **Data Transfer Object (DTO)** para desacoplar la capa de persistencia (Base de Datos) de la capa de presentación (API REST).

## 📖 Conceptos Clave

* **DTO (Data Transfer Object):** Es un objeto plano (POJO) diseñado exclusivamente para transportar datos entre procesos. Su objetivo principal es encapsular los datos de retorno para proteger la estructura interna de la base de datos y ocultar información sensible (como contraseñas) al cliente.
* **Mapper:** Es el componente o clase encargada de la "traducción". Realiza el mapeo de los atributos de la Entidad (Persistencia) hacia el DTO (Vista) y viceversa, centralizando la lógica de conversión en un solo lugar.

## 🚀 Objetivo
Mostrar cómo transformar una Entidad (`Estudiante`) que contiene datos sensibles (como contraseñas) a un objeto ligero y seguro (`EstudianteDTO`) antes de enviarlo al cliente.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3.2.5
* **Base de Datos:** MySQL
* **Librerías:**
    * Spring Data JPA (Persistencia)
    * Lombok (Reducción de código boilerplate)
    * Spring Web (API REST)

## 📋 Estructura Clave
* **Entity:** `Estudiante` (Contiene `id`, `nombre`, `email`, `password`, `fechaRegistro`).
* **DTO:** `EstudianteDTO` (Solo expone `id`, `nombreCompleto`, `email`).
* **Mapper:** `EstudianteMapper` (Clase encargada de convertir `Entity` -> `DTO`).

## 🧪 Cómo Probar (Postman)

### 1. Generar Datos de Prueba
Guarda un estudiante en la base de datos (incluyendo contraseña).
* **Método:** `POST`
* **URL:** `http://localhost:8080/api/estudiantes/crear-prueba`

### 2. Consultar Lista (DTOs)
Obtiene la lista transformada. Observarás que **no aparece el password** y el nombre/apellido están concatenados.
* **Método:** `GET`
* **URL:** `http://localhost:8080/api/estudiantes`

## 👤 Autor
[Royser Chuquihuayta Aranda]


