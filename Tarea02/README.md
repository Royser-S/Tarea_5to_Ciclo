# Tarea 02: Manejo de Excepciones (Checked vs Unchecked)

Este proyecto ejemplifica la diferencia entre excepciones verificadas y no verificadas en Java, y cómo gestionarlas globalmente en Spring Boot para ofrecer respuestas JSON limpias.

## 🚀 Objetivo
Entender el ciclo de vida de las excepciones y utilizar `@RestControllerAdvice` para capturar errores y evitar que la aplicación se detenga o muestre trazas de error al usuario final.

## 📖 Marco Teórico

* **Checked Exceptions (Verificadas):** Son excepciones que representan errores ajenos al programa (como problemas de hardware, red o archivos). El compilador de Java **obliga** a manejarlas mediante `try-catch` o declarándolas con `throws`. Si no se manejan, el código no compila.
    * *Ejemplo en código:* `IOException`.
* **Unchecked Exceptions (No Verificadas / Runtime):** Son excepciones que ocurren durante la ejecución del programa, generalmente debidas a errores en la lógica de programación (como acceder a un objeto nulo). El compilador no obliga a capturarlas.
    * *Ejemplo en código:* `RuntimeException` (y nuestra clase `ProductoNoEncontradoException`).
* **Global Exception Handler:** Un patrón en Spring Boot (usando `@RestControllerAdvice`) que intercepta cualquier error ocurrido en los controladores para devolver una respuesta HTTP estandarizada en formato JSON.

## 🛠️ Tecnologías
* Java 17
* Spring Boot 3.2.5
* Spring Web

## 🧪 Cómo Probar (Postman)

### Caso 1: Error de Negocio (Unchecked)
Simula la búsqueda de un producto con ID 0.
* **Método:** `GET`
* **URL:** `http://localhost:8080/api/pruebas/producto/0`
* **Respuesta Esperada:** JSON con estado `404 Not Found`.

### Caso 2: Error de Sistema (Checked)
Simula la lectura de un archivo inexistente.
* **Método:** `GET`
* **URL:** `http://localhost:8080/api/pruebas/archivo`
* **Respuesta Esperada:** JSON con estado `500 Internal Server Error`.

## 👤 Autor
[Royser Chuquihuayta Aranda]