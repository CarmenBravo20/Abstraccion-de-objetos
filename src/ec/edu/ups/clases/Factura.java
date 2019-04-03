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

//Esta clase describe los atributos que tiene un bate
public class Factura {
    /**
     * atributos de la clase Factura
     */
    private int ruc;
    private String nombre;
    private String direccion;
    private String formaPago;
    

    /**
     * Consige la informacion con respecto al ruc
     *
     * @return (int) informacion del ruc
     *
     */
    public int getRuc() {
        return ruc;
    }

    /**
     * Establese la informacion con respecto al ruc
     *
     * @param ruc
     */
    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    /**
     * Consige la informacion con respecto al nombre del cliente
     *
     * @return String nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    /**
     *  Establese la informacion con respecto al nombre del cliente
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Consige la informacion con respecto a la direcion del cliente
     * @return String direccion del cliente
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     *  Establese la informacion con respecto a la direccion del cliente
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Consige la informacion con respecto a la forma de pago
     * @return String forma de pago
     */
    public String getFormaPago() {
        return formaPago;
    }
    /**
     *  Establese la informacion con respecto a la forma de pago
     * @param formaPago 
     */
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    /**
     * 
     * @param ruc
     * @return true
     */
    public boolean crearFactura(String ruc) {
        return true;
    }
    /**
     * 
     * @param ruc
     * @param nombre
     * @param direccion
     * @param fromaPago
     * @return true
     */
    public boolean editarFactura(String ruc, String nombre, String direccion, String fromaPago) {
        return true;
    }
    /**
     * 
     * @param ruc
     * @return true
     */
    public boolean eliminarFactura(String ruc) {
        return true;

    }
     /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola linea 
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Factura{" + "ruc=" + getRuc() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + ", formaPago=" + getFormaPago() + '}';
    }

}
