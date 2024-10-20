
package models;

/**
 *
 * @author nicho
 */
public class EmpleadoModel {
    private int idempleado;
    private int idBodega;
    private String nombre;
    private int edad;
    
    private String bodegaNombre;

    public EmpleadoModel(int idempleado, int idBodega, String nombre, int edad, String bodegaNombre) {
        this.nombre = nombre;
        this.edad = edad;
        this.idempleado = idempleado;
        this.idBodega = idBodega;
        this.bodegaNombre = bodegaNombre;
    }
    
    public EmpleadoModel(int idBodega, String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.idBodega = idBodega;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public String getBodegaNombre() {
        return bodegaNombre;
    }

    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setBodegaNombre(String bodegaNombre) {
        this.bodegaNombre = bodegaNombre;
    }
    
    @Override
    public String toString() {
        return nombre + " - " + edad + " - " + bodegaNombre;
    }
    
}
