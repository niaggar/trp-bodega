
package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.json.simple.*;
import org.json.simple.parser.*;

/**
 * Clase en la que se realiza la conexion con la base de datos.
 * 
 * @author nicho
 */
public class ConeccionDB {
    public static Connection obtenerConeccion() {
        JSONParser parser = new JSONParser();
        Connection conn = null;
        
        try {
            String credenciales = System.getProperty("user.dir") + "/src/utils/credencialesDB.json";
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(credenciales));
            
            String host = (String) jsonObject.get("ip");
            String puerto = (String) jsonObject.get("puerto");
            String usuario = (String) jsonObject.get("usuario");
            String contrasena = (String) jsonObject.get("contrasena");
            String urlDB = "jdbc:mysql://" + host + ":" + puerto + "/BodegaTRP";
            
            conn = DriverManager.getConnection(urlDB, usuario, contrasena);
        }
        
        catch( SQLException | FileNotFoundException ex ) {
            ex.printStackTrace();
        }
        
        catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
        
        return conn;
    }
}
