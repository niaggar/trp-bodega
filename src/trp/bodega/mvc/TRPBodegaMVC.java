
package trp.bodega.mvc;

import access.EmpleadoDAO;
import controllers.EmpleadoController;
import views.EmpleadoGUI;

/**
 * Clase que sirve como punto de arranque de la aplicacion.
 * 
 * @author nicho
 */
public class TRPBodegaMVC {
    /**
     * Creacion de la ventana y el DAO que controlaran la aplicacion.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        var empleadoVentana = new EmpleadoGUI();
        var empleadoDAO = new EmpleadoDAO();
        
        new EmpleadoController(empleadoVentana, empleadoDAO);
    }
}