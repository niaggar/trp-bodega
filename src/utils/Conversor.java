/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 * Clase auxiliar para verificar las conversiones que sean necesarias realizar
 * en el proyecto.
 * 
 * @author nicho
 */
public class Conversor {
    public static boolean stringAEntero(String cadena) {
        boolean resultado = true;
        
        try
        {
            int numero = Integer.parseInt(cadena);
        }
        
        catch(NumberFormatException nfe)
        {  
            resultado = false;
            return resultado;
        }
        
        return resultado;
    }
}
