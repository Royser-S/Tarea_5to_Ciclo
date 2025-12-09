# Tarea 03: Autenticación Básica con Spring Security

Este proyecto implementa seguridad en una API REST utilizando el estándar **HTTP Basic Auth** y gestión de usuarios en memoria.

## 📖 Conceptos Clave

* **Spring Security:** Framework que proporciona autenticación (verificar identidad) y autorización (verificar permisos) para aplicaciones Java. Funciona mediante una cadena de filtros (`SecurityFilterChain`) que interceptan las peticiones HTTP.
* **HTTP Basic Auth:** Es un esquema de autenticación simple integrado en el protocolo HTTP. El cliente envía el usuario y contraseña codificados en Base64 en la cabecera `Authorization` de cada petición. Es un método "stateless" (sin estado).
* **UserDetailsService:** Interfaz de Spring Security utilizada para recuperar datos de usuario (nombre, password y roles). En este ejemplo, usamos una implementación en memoria (`InMemoryUserDetailsManager`).

## 🚀 Objetivo
Proteger endpoints específicos (`/privado`) requiriendo autenticación, mientras se permite el acceso libre a otros (`/publico`), utilizando la configuración moderna de `SecurityFilterChain`.

## 🔐 Características de Seguridad
* **Tipo de Auth:** HTTP Basic (Usuario y Contraseña en Cabecera).
* **Almacenamiento:** `InMemoryUserDetailsManager` (Usuarios volátiles en RAM).
* **Configuración:**
    * CSRF deshabilitado (para facilitar pruebas API).
    * Rutas públicas y privadas definidas explícitamente.

## 🛠️ Tecnologías
* Java 17
* Spring Boot 3.2.5
* Spring Security 6

## 👤 Credenciales de Prueba
Para acceder a las rutas privadas, utiliza:
* **Usuario:** `admin`
* **Contraseña:** `12345`

> **Nota:** La contraseña usa el prefijo `{noop}` en el código para indicar que no tiene encriptación (solo para fines educativos).

## 🧪 Cómo Probar (Postman)

### 1. Acceso Público
* **Método:** `GET`
* **URL:** `http://localhost:8080/api/publico`
* **Resultado:** Acceso permitido sin credenciales.

### 2. Acceso Privado (Sin Auth)
* **Método:** `GET`
* **URL:** `http://localhost:8080/api/privado`
* **Resultado:** `401 Unauthorized`.

### 3. Acceso Privado (Con Auth)
* **Método:** `GET`
* **URL:** `http://localhost:8080/api/privado`
* **Configuración Postman:** Pestaña "Auth" -> Type "Basic Auth" -> Ingresar credenciales.
* **Resultado:** `200 OK` y mensaje de bienvenida.

## 👤 Autor
[Royser Chuquihuayta Aranda]