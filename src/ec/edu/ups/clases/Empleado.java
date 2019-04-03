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

//Esta clase describe los atributos que tiene un Empleado
public class Empleado {

    /**
     * atributos de la clase Empleado
     */
    private int cedula;
    private String nombre;
    private String apellido;
    private String cargo;

    /**
     * Consige la informacion con respecto al Empleado
     * @return (int) cedula del Empleado
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Establece la informacion con respecto al  empleado
     * @param cedula 
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * Consige la informacion con respecto al nombre del empleado
     * @return (String) nombre del Empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece la informacion con respecto al nombre del empleado
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Consige la informacion con respecto al apellido del empleado
     * @return (String) apellido del empleado
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece la informacion con respecto al apellido del empleado
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Consige la informacion con respecto el cargo del empleado
     * @return (String) cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }

    /**Estable la informacion con respecto al cargo del empleado
     * 
     * @param cargo 
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * 
     * @param cedula
     * @param nombre
     * @param apellido
     * @param cargo
     * @return true
     */
    public boolean ingresarEmpleado(int cedula, String nombre, String apellido, String cargo) {
        return true;
    }

    /**
     * 
     * @param cedula
     * @param nombre
     * @param apellido
     * @return true
     */
    public boolean modificarEmpleado(int cedula, String nombre, String apellido) {
        return true;
    }
    /**
     * 
     * @param cedula
     * @return true
     */
     public boolean ingresarCleinte(int cedula) {
         return true;
     }

      /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola linea 
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + '}';
    }
     
}
