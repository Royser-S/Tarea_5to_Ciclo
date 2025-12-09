# 🎓 Portafolio de Desarrollo Web – 5to Ciclo

👋 **¡Bienvenido/a!** Este repositorio centraliza las actividades y entregas académicas del curso de **Desarrollo de Aplicaciones Web**. Aquí encontrarás la implementación de buenas prácticas de arquitectura, manejo de errores y seguridad en backend con **Spring Boot**.

---

## 📹 Videos de Sustentación

Aquí adjunto los enlaces a los videos explicativos correspondientes a cada actividad, según lo solicitado en la rúbrica.

| Actividad | Tema Principal | 📺 Enlace al Video |
| :--- | :--- | :--- |
| **Tarea 01** | DTO & Mapper | [🔗 Ver Sustentación Tarea 01](https://youtu.be/BexnI510GPs) |
| **Tarea 02** | Excepciones (Checked/Unchecked) | [🔗 Ver Sustentación Tarea 02](https://youtu.be/BaRiByRnBGg) |
| **Tarea 03** | Spring Security (Basic Auth) | [🔗 Ver Sustentación Tarea 03](https://youtu.be/1QZX2bhZnkk) |

> ⚠️ **Nota:** Si algún enlace no abre, por favor notificar.

---

## 📂 Contenido del Repositorio

A continuación, el detalle técnico de cada proyecto incluido en este portafolio:

### 🔹 [Tarea 01: Patrón DTO y Mapper](./Tarea01)
**Objetivo:** Desacoplar la base de datos de la vista.
* ✅ Creación de Entidad `Estudiante` con datos sensibles.
* ✅ Implementación de `EstudianteDTO` para filtrar información.
* ✅ Uso de clases `Mapper` para conversión de datos.
* 🛠️ **Tech:** MySQL, JPA, Lombok.

### 🔹 [Tarea 02: Manejo de Excepciones](./Tarea02)
**Objetivo:** Control de errores robusto y amigable.
* ✅ Diferenciación práctica entre **Checked** y **Unchecked Exceptions**.
* ✅ Implementación de `GlobalExceptionHandler` (@RestControllerAdvice).
* ✅ Respuestas JSON estandarizadas (HTTP 404, 500).
* 🛠️ **Tech:** Java IO, RuntimeExceptions customizadas.

### 🔹 [Tarea 03: Seguridad Básica](./Tarea03)
**Objetivo:** Proteger endpoints mediante autenticación.
* ✅ Implementación de **Spring Security 6**.
* ✅ Configuración de `SecurityFilterChain` y reglas HTTP.
* ✅ Autenticación **HTTP Basic** con usuarios en memoria (`InMemoryUserDetailsManager`).
* 🛠️ **Tech:** Spring Security, Postman Auth.

---

## 🛠️ Stack Tecnológico

Este portafolio ha sido construido utilizando las siguientes herramientas:

* ☕ **Lenguaje:** Java 17
* 🍃 **Framework:** Spring Boot 3.2.5
* 📦 **Gestor:** Maven
* 🗄️ **Base de Datos:** MySQL
* 🛡️ **Seguridad:** Spring Security
* 🚀 **Pruebas:** Postman

---

## ⚙️ ¿Cómo ejecutar estos proyectos?

Dado que es un **Monorepositorio** (varios proyectos en una carpeta), sigue estos pasos:

1.  **Clonar el repo:**
    ```bash
    [git clone [https://github.com/Royser-S/Tarea_5to_Ciclo](https://github.com/Royser-S/Tarea_5to_Ciclo)](https://github.com/Royser-S/Tarea_5to_Ciclo)
    ```
2.  **Importar:** Abre tu IDE (Eclipse/STS) y selecciona:
    * `File` > `Import` > `Existing Maven Projects`.
    * Selecciona las carpetas individuales (`Tarea01`, `Tarea02`, etc.).
3.  **Configurar:**
    * Para la **Tarea 01**, asegúrate de tener MySQL corriendo.
    * Para la **Tarea 03**, usa las credenciales `admin` / `12345`.

---

<div align="center">
  
  **Curso:** Desarrollo de Aplicaciones Web I 
  **Ciclo:** V  
  **Alumno:** [Royser Chuquihuayta Aranda]  
  
  📅 **Diciembre 2025**
</div>
