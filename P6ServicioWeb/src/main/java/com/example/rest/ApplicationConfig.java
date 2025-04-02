
package com.example.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configuración de la aplicación REST. Esta clase configura la ruta base para
 * los servicios web RESTful en la aplicación.
 *
 * @author aname
 */
@ApplicationPath("/restful")  // Define la ruta base
public class ApplicationConfig extends Application {
}
