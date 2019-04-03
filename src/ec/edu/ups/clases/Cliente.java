/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * @since 2019
 * @version 2.0
 * @author Carmen Bravo
 */

//Esta clase describe los atributos que tiene un Cliente
public class Cliente {
    /**
     * Atributos de la clase cliente
     */
    private int cedula;
    private String nombre;
    private String apellido;
    
    
    /**
     * Consige la informacion con respecto al cliente
     *
     * @return (int) informacion del cliente
     *
     */
    public int getCedula() {
        return cedula;
    }
    /**
     * Establece informacion con respecto al cliente
     * @param cedula 
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    /**
     * Consige la informacion con respecto al nombre cliente
     * @return (String) nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece  la informacion con respecto al nombre cliente
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   /**
    * Consige la informacion con respecto al apellido del cliente
    * @return (String ) apellido del cliente
    */
    public String getApellido() {
        return apellido;
    }
 
    /**
     * Establece la informacion con respecto al apellido cliente
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * 
     * @param cedula
     * @param nombre
     * @param apellido
     * @return true
     */
    public boolean ingresarCleinte(int cedula,String nombre,String apellido) {
        return true;
    }
    /**
     * 
     * @param cedula
     * @param nombre
     * @param apellido
     * @return true
     */
    public boolean modificarCliente(int cedula,String nombre, String apellido) {
        return true;
    }
    /**
     * 
     * @param cedula
     * @return true
     */
    public boolean eliminarCliente(int cedula) {
        return true;
    }
    
     /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola linea 
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
