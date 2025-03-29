
package com.example.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configuración de la aplicación REST.
 * Esta clase configura la ruta base para los servicios web RESTful en la aplicación.
 * Define el prefijo para todas las rutas de la API.
 * 
 * @author aname
 */
@ApplicationPath("/api")  // Define la ruta base de la API
public class ApplicationConfig extends Application {
}
