package com.tarea02.service;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.tarea02.exception.ProductoNoEncontradoException;

@Service
public class PruebaService {

	// CASO 1: Excepción UNCHECKED (Runtime)

    public String buscarProducto(Long id) {
        if (id == 0) {
            throw new ProductoNoEncontradoException("El producto con ID 0 no existe en el inventario.");
        }
        return "Producto encontrado: Laptop Gamer";
    }

    // CASO 2: Excepción CHECKED (Verificada)
 
    public void leerArchivo()  throws IOException{
        FileReader archivo = new FileReader("archivo_que_no_existe.txt");
        archivo.read();
    }
	
}
