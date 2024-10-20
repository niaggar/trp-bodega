/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author nicho
 */
public class BodegaModel {
    private String nombre;
    private int id;

    public BodegaModel(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
