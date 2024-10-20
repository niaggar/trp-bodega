
package access;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.BodegaModel;
import utils.ConeccionDB;

/**
 * Clase en la que se maneja la conexion a los datos referentes a la bodega.
 * 
 * @author nicho
 */
public class BodegaDAO {
     private Connection conn;

    public BodegaDAO() {
        this.conn = ConeccionDB.obtenerConeccion();
    }
    
    
    /**
     * Metodo para obtener la lista de bodegas (nombre, id) presentes en la
     * base de datos.
     * 
     * @return 
     */
    public List<BodegaModel> ObtenerListaBodegas() {
        if (conn == null)
            conn = ConeccionDB.obtenerConeccion();
        
        List<BodegaModel> bodegas = new ArrayList<>();
        String query = "SELECT bodega.idBodega, bodega.nombre FROM bodega;";
        
        try {
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(query);
            
            while (res.next()) {
                BodegaModel empleado = new BodegaModel(
                        res.getString(2),
                        res.getInt(1)
                );
                bodegas.add(empleado);
            }
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
        return bodegas;
    }
}
