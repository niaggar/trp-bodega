
package access;

import java.util.ArrayList;
import java.util.List;

import models.EmpleadoModel;
import utils.ConeccionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * Clase en la que se maneja la conexion a los datos referentes al empleado.
 * 
 * @author nicho
 */
public class EmpleadoDAO {
    private Connection conn;

    public EmpleadoDAO() {
        this.conn = ConeccionDB.obtenerConeccion();
    }
    
    
    /**
     * Metodo mediante el cual se obtine la lista completa de los empleados.
     * 
     * @return 
     */
    public List<EmpleadoModel> ObtenerListaEmpleados() {
        if (conn == null)
            conn = ConeccionDB.obtenerConeccion();
        
        List<EmpleadoModel> empleados = new ArrayList<>();
        String query = "SELECT empleado.*, bodega.nombre AS 'bodega' FROM empleado " +
                       "INNER JOIN bodega ON empleado.idBodega = bodega.idBodega ORDER BY empleado.idempleado;";
        
        try {
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(query);
            
            while (res.next()) {
                EmpleadoModel empleado = new EmpleadoModel(
                        res.getInt(1),
                        res.getInt(2),
                        res.getString(3),
                        res.getInt(4),
                        res.getString(5)
                );
                empleados.add(empleado);
            }
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
        return empleados;
    }
    
    
    /**
     * Metodo mediante el cual se obtine un empleado en especifico, usando
     * su nombre como identificador.
     * 
     * @param nombreEmpleado
     * @return 
     */
    public EmpleadoModel ObtenerEmpleado(String nombreEmpleado) {
        if (conn == null)
            conn = ConeccionDB.obtenerConeccion();
        
        EmpleadoModel empleado = null;
        String query = "SELECT empleado.*, bodega.nombre AS 'bodega' FROM empleado " +
                       "INNER JOIN bodega ON empleado.idBodega = bodega.idBodega " +
                       "WHERE empleado.nombre=?;";
        
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, nombreEmpleado);

            ResultSet res = statement.executeQuery();
            
            while (res.next()) {
                empleado = new EmpleadoModel(
                        res.getInt(1),
                        res.getInt(2),
                        res.getString(3),
                        res.getInt(4),
                        res.getString(5)
                );
                break;
            }
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
        return empleado;
    }
    
    
    /**
     * Metodo mediante el cual se obtine un empleado en especifico, usando
     * su id como identificador.
     * 
     * @param nombreEmpleado
     * @return 
     */
    public EmpleadoModel ObtenerEmpleado(int idEmpleado) {
        if (conn == null)
            conn = ConeccionDB.obtenerConeccion();
        
        EmpleadoModel empleado = null;
        String query = "SELECT empleado.*, bodega.nombre AS 'bodega' FROM empleado " +
                       "INNER JOIN bodega ON empleado.idBodega = bodega.idBodega " +
                       "WHERE empleado.idempleado=?;";
        
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, idEmpleado);

            ResultSet res = statement.executeQuery();
            
            while (res.next()) {
                empleado = new EmpleadoModel(
                        res.getInt(1),
                        res.getInt(2),
                        res.getString(3),
                        res.getInt(4),
                        res.getString(5)
                );
                break;
            }
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
        return empleado;
    }
    
    
    /**
     * Metodo para agregar un nuevo empleado que se le pase como parametro.
     * 
     * @param empleado 
     */
    public void AgregarNuevoEmpleado(EmpleadoModel empleado) {
        if (conn == null)
            conn = ConeccionDB.obtenerConeccion();
        
        String query = "INSERT INTO empleado(idBodega, nombre, edad) VALUES (?, ?, ?);";
        
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            
            statement.setInt(1, empleado.getIdBodega());
            statement.setString(2, empleado.getNombre());
            statement.setInt(3, empleado.getEdad());

            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0) 
                JOptionPane.showMessageDialog(null, "El empleado " + empleado.getNombre() + " fue creado.");
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    
    /**
     * Metodo para eliminar un empleado existente segun el identificador
     * que se le pase como parametro.
     * 
     * @param idEmpleado 
     */
    public void EliminarEmpleado(int idEmpleado) {
        if (conn == null)
            conn = ConeccionDB.obtenerConeccion();
        
        String query = "DELETE FROM empleado WHERE empleado.idempleado = ?;";
        
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, idEmpleado);
            
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) 
                JOptionPane.showMessageDialog(null, "El empleado con id #" + idEmpleado + " fue eliminado.");
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }


    public void ActualizarEmpleado(EmpleadoModel empleado) {
        if (conn == null)
            conn = ConeccionDB.obtenerConeccion();
        
        String query = "update empleado set edad = ?, nombre = ?, idBodega = ? where idempleado = ?;";
        
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, empleado.getEdad());
            statement.setString(2, empleado.getNombre());
            statement.setInt(3, empleado.getIdBodega());
            statement.setInt(4, empleado.getIdempleado());
            
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) 
                JOptionPane.showMessageDialog(null, "El empleado con id #" + empleado.getIdempleado() + " fue actualizado.");
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
}
