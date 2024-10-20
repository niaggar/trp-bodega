
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import access.BodegaDAO;
import access.EmpleadoDAO;
import javax.swing.JList;
import models.EmpleadoModel;
import views.EmpleadoGUI;
import models.BodegaModel;
import utils.Conversor;

/**
 * Controlador desde donde se maneja todos los eventos relacionados con la 
 * vista EmpleadoGUI.
 * 
 * @author nicho
 */
public class EmpleadoController implements ActionListener {
    EmpleadoGUI vista;
    EmpleadoDAO modelo;
    
    Map<String, BodegaModel> diccionarioBodegas;
    EmpleadoModel empleadoActualizar;
    
    
    /**
     * Constructor de EmpleadoControlador.
     * 
     * @param vista
     * @param modelo 
     */
    public EmpleadoController(EmpleadoGUI vista, EmpleadoDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.establecerControladorDeEventos(this);
        
        // Establece algunas propiedades menores a la ventana
        this.vista.setVisible(true);
        this.vista.setResizable(false);
    }

    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        // Realizar consulta de los empleados
        if (evento.getSource() == vista.getConsultasConsultarBtn()) {
            ConsultarBaseDeDatos();
        }
        
        // Eliminar empleado existente
        else if (evento.getSource() == vista.getEliminarBtn()) {
            EliminarEmpleado();
        }
        
        // Crear nuevo empleado
        else if (evento.getSource() == vista.getNuevoCrearBtn()) {
            NuevoEmpleado();
        }
        
        // Actualiza un empleado en específico
        else if (evento.getSource() == vista.getActualizarBtn()) {
            ActualizarEmpleado();
        }
        
        // Buscar empleado a actualizar
        else if (evento.getSource() == vista.getActualizarBusctarBtn()) {
            String idTexto = this.vista.getActualizarIdTexto().getText();
            
            if (Conversor.stringAEntero(idTexto)) {
                int id = Integer.parseInt(idTexto);
                empleadoActualizar = this.modelo.ObtenerEmpleado(id);

                if (empleadoActualizar == null) {
                    JOptionPane.showMessageDialog(null, "No se encontraron resultados.");
                    return;
                }
                
                var lista = this.vista.getActualizarBodegasLista();
                ActualizarBodegaLista(lista);

                this.vista.getActualizarEdadTexto().setText(empleadoActualizar.getEdad() + "");
                this.vista.getActualizarNombreTexto().setText(empleadoActualizar.getNombre());
                lista.setSelectedValue(empleadoActualizar.getBodegaNombre(), true);
            }
        }
        
        // Actualization de la lista en la que se muestran las bodegas disponibles.
        else if (evento.getSource() == vista.getNuevoActualizarBtn()) {
            var lista = this.vista.getNuevoBodegasLista();
            ActualizarBodegaLista(lista);
        }
    }
    
    
    /**
     * Metodo para actualizar una lista en la qeu se deben de mostrar las
     * bodegas registradas actualmente en la base de datos.
     * 
     * @param lista 
     */
    private void ActualizarBodegaLista(JList<String> lista) {
        BodegaDAO modeloBodega = new BodegaDAO();
        List<BodegaModel> bodegas = modeloBodega.ObtenerListaBodegas();
        diccionarioBodegas = new HashMap<>();

        DefaultListModel modeloLista = new DefaultListModel();
        for (int i = 0; i < bodegas.size(); i++) {
            modeloLista.addElement(bodegas.get(i).getNombre());
            diccionarioBodegas.put(bodegas.get(i).getNombre(), bodegas.get(i));
        }

        lista.setModel(modeloLista);
    }

    
    /**
     * Metodo mediante el cual se realizan las consultas a la base de 
     * datos usando EmpleadoDAO.
     * 
     * El tipo de la consulta se determina segun los campos de texto que el usuario
     * haya decidido completar desde la parte de la GUI.
     */
    public void ConsultarBaseDeDatos() {
        String idTexto = this.vista.getConsultasIdTexto().getText();
        String nombre = this.vista.getConsultasNombreTexto().getText();
                
        // Verificar si los campos están vacios para de esta forma obtener
        // toda la lista de los empleados
        if ("".equals(idTexto) && "".equals(nombre)) {
            List<EmpleadoModel> empleados = this.modelo.ObtenerListaEmpleados();
            
            if (!(empleados.size() > 0)) {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados.");
                return;
            }
            
            String[][] datosAMostrar = new String[empleados.size()][4];
            
            for (int i = 0; i < empleados.size(); i++) {
                datosAMostrar[i][0] = empleados.get(i).getIdempleado() + "";
                datosAMostrar[i][1] = empleados.get(i).getNombre();
                datosAMostrar[i][2] = empleados.get(i).getEdad() + "";
                datosAMostrar[i][3] = empleados.get(i).getBodegaNombre();
            }
            
            this.vista.getConsultasTabla().setModel(
                    new DefaultTableModel(
                            datosAMostrar, 
                            new String [] { "Id", "Nombre", "Edad", "Bodega" }
                    ));
            return;
        }
        
        // Verificar que el id dado sea un entero para hacer la consulta de los
        // empleados segun su id
        if (Conversor.stringAEntero(idTexto)) {
            int id = Integer.parseInt(idTexto);
            EmpleadoModel empleado = this.modelo.ObtenerEmpleado(id);
            
            if (empleado == null) {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados.");
                return;
            }
            
            String[][] datosAMostrar = new String[1][4];
            
            datosAMostrar[0][0] = empleado.getIdempleado() + "";
            datosAMostrar[0][1] = empleado.getNombre();
            datosAMostrar[0][2] = empleado.getEdad() + "";
            datosAMostrar[0][3] = empleado.getBodegaNombre();

            this.vista.getConsultasTabla().setModel(
                    new DefaultTableModel(
                            datosAMostrar, 
                            new String [] { "Id", "Nombre", "Edad", "Bodega" }
                    ));
            return;
        }
        
        
        // Verificar que el nombre este escrito para hacer la consulta de los
        // empleados segun su nombre
        if (!"".equals(nombre)) {
            EmpleadoModel empleado = this.modelo.ObtenerEmpleado(nombre);
            
            if (empleado == null) {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados.");
                return;
            }
            
            String[][] datosAMostrar = new String[1][4];
            
            datosAMostrar[0][0] = empleado.getIdempleado() + "";
            datosAMostrar[0][1] = empleado.getNombre();
            datosAMostrar[0][2] = empleado.getEdad() + "";
            datosAMostrar[0][3] = empleado.getBodegaNombre();

            this.vista.getConsultasTabla().setModel(
                    new DefaultTableModel(
                            datosAMostrar, 
                            new String [] { "Id", "Nombre", "Edad", "Bodega" }
                    ));
            return;
        }
        
        // Mensaje default si ninguna de las condiciones para realizar la 
        // consulta se cumple.
        JOptionPane.showMessageDialog(null, "Error en los campos de consulta");
    }
    
    
    /**
     * Metodo mediante el cual se elimina un empleado usando el metodo 
     * EliminarEmpleado de EmpleadoDAO.
     */
    public void EliminarEmpleado() {
        String idTexto = this.vista.getEliminarIdTexto().getText();
        
        if (Conversor.stringAEntero(idTexto)) {
            int id = Integer.parseInt(idTexto);
            this.modelo.EliminarEmpleado(id);
        } else {
            JOptionPane.showMessageDialog(null, "Id erroneo");
        }
    }
    
    
    /**
     * Metodo por el cual se crea un nuevo empleado usando el metodo 
     * AgregarNuevoEmpleado de EmpleadoDAO.
     * 
     * Dentro del metodo se verifican los posibles errores que puede cometer
     * un usuario al momento de utilizar la interfaz grafica.
     * 
     */
    public void NuevoEmpleado() {
        String nombre = this.vista.getNuevoNombreTexto().getText();
        String edadTexto = this.vista.getNuevoEdadTexto().getText();
        
        // Verificacion de posibles errores
        if (!Conversor.stringAEntero(edadTexto)) {
            JOptionPane.showMessageDialog(null, "El campo EDAD debe de ser un entero.");
            return;
        }
        
        if (this.vista.getNuevoBodegasLista().getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona la bodega a la que pertenece el empleado.");
            return;
        }
        
        if ("".equals(nombre)) {
            JOptionPane.showMessageDialog(null, "Es necesario un nombre para crear un nuevo empleado.");
            return;
        }
        
        // Ejecucion de la creacion del nuevo empleado
        int idBodega = diccionarioBodegas
                .get(this.vista.getNuevoBodegasLista().getSelectedValue()).getId();
        
        this.vista.getNuevoBodegasLista().setSelectedValue("la amistad", true);
        
        int edad = Integer.parseInt(edadTexto);
        EmpleadoModel nuevoEmpleado = new EmpleadoModel(idBodega, nombre, edad);
        
        this.modelo.AgregarNuevoEmpleado(nuevoEmpleado);
    }


    /**
     * Metodo por el cual se actualiza los datos de un usuario ya existente.
     * 
     * Dentro del metodo se verifican los posibles errores que puede cometer
     * un usuario al momento de utilizar la interfaz grafica.
     * 
     */
    public void ActualizarEmpleado() {
        if (empleadoActualizar == null) {
            JOptionPane.showMessageDialog(null, "Indica que empleado se va a actualizar");
            return;
        }
        
        var nombre = this.vista.getActualizarNombreTexto().getText();
        var edadTexto = this.vista.getActualizarEdadTexto().getText();
        var idBodega = diccionarioBodegas
                .get(this.vista.getActualizarBodegasLista().getSelectedValue()).getId();
        var nombreBodega = diccionarioBodegas
                .get(this.vista.getActualizarBodegasLista().getSelectedValue()).getNombre();
        
        
        // Verificacion de posibles errores
        if (!Conversor.stringAEntero(edadTexto)) {
            JOptionPane.showMessageDialog(null, "El campo EDAD debe de ser un entero.");
            return;
        }
        
        if (this.vista.getActualizarBodegasLista().getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona la bodega a la que pertenece el empleado.");
            return;
        }
        
        if ("".equals(nombre)) {
            JOptionPane.showMessageDialog(null, "Es necesario un nombre al actualizar el empleado.");
            return;
        }
        
        int edad = Integer.parseInt(edadTexto);
        
        empleadoActualizar.setBodegaNombre(nombreBodega);
        empleadoActualizar.setEdad(edad);
        empleadoActualizar.setIdBodega(idBodega);
        empleadoActualizar.setNombre(nombre);
        
        this.modelo.ActualizarEmpleado(empleadoActualizar);
    }
}
