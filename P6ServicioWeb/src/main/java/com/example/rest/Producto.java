
package com.example.rest;

/**
 * Clase que representa un producto en el catálogo.
 * Esta clase contiene los atributos necesarios para describir un producto,
 * así como los métodos get y set.
 * 
 * @author aname
 */

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto() {}

    /**
     * Constructor con parámetros para crear un objeto Producto.
     * 
     * @param id El identificador único del producto.
     * @param nombre El nombre del producto.
     * @param descripcion La descripción del producto.
     * @param precio El precio del producto.
     */
    public Producto(int id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Métodos Get y Set
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
