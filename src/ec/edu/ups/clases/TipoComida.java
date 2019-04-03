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
//Esta clase describe los atributos que tiene un tipo de comida
public class TipoComida {

    /**
     *atributos de la clase TipoComida
     */
    private String nombre;
    private int precio;
    private String descripcion;

    /**
     * Consige la informacion con respecto al nombre de la comida
     * @return (String ) nombre de la comida
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece la informacion con respecto nombre de la comida
     * @param nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Consige la informacion con respecto el precio de la comida
     * @return (int) precio de la comida
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * EStablece la informacion con respecto el precio de la comida
     * @param precio 
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Consige la informacion con respecto a la descripcion de la comida
     * @return (String) descripcion de la comida
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Establece la informacion con respecto  a la descripcion de la comida
     * @param descripcion 
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * 
     * @param nombre
     * @return true
     */
    public boolean comprarComida(String nombre) {

        return true;
    }

    /**
     * 
     * @param nombre
     * @return true
     */
    public boolean cambiarComida(String nombre) {
        return false;

    }
    /**
     * 
     * @param nombre
     * @return true
     */

    public boolean desecharComida(String nombre) {
        return true;
    }

    /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "TipoComida{" + "nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }

}
