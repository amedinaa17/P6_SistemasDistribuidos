package com.example.rest;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Recurso REST que gestiona los productos del catálogo.
 * Permite realizar operaciones CRUD sobre los productos como
 * obtener, agregar, actualizar y eliminar productos.
 * 
 * @author aname
 */
@Path("/productos")  // Define la ruta para acceder a los productos
public class ProductoResource {

    private static List<Producto> productos = new ArrayList<>(); //  Lista que almacena los productos.
    private static int idCounter = 1;  // Contador para los IDs de los productos

    /**
     * Obtiene la lista completa de productos.
     * 
     * @return Lista de productos en formato JSON.
     */
    @GET
    @Produces("application/json")
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Obtiene un producto específico a través de su ID.
     * 
     * @param id El ID del producto que se desea obtener.
     * @return El producto con el ID especificado o null si no se encuentra.
     */
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Producto getProducto(@PathParam("id") int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo producto al catálogo.
     * 
     * @param producto El producto que se desea agregar al catálogo.
     * @return El producto agregado con su ID asignado.
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Producto addProducto(Producto producto) {
        producto.setId(idCounter++); // Asigna un nuevo ID al producto
        productos.add(producto);  // Agrega el producto a la lista
        return producto;
    }

    /**
     * Actualiza un producto existente en el catálogo.
     * 
     * @param id El ID del producto que se desea actualizar.
     * @param producto El producto con los datos nuevos.
     * @return El producto actualizado, o null si no se encuentra el producto.
     */
    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Producto updateProducto(@PathParam("id") int id, Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                productos.set(i, producto);
                return producto;
            }
        }
        return null;
    }

    /**
     * Elimina un producto del catálogo.
     * 
     * @param id El ID del producto que se desea eliminar.
     * @return Un mensaje de estado indicando si la eliminación fue exitosa o fallida.
     */
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public String deleteProducto(@PathParam("id") int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                productos.remove(p);
                return "{\"status\":\"success\"}";
            }
        }
        return "{\"status\":\"failure\"}";
    }
}
