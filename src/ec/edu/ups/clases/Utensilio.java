package ec.edu.ups.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @since 2019
 * @version 2.0
 * @author Carmen Bravo
 */
//Esta clase describe los atributos que tiene un Utensilio
public class Utensilio {

    /**
     * Atributos de la clase utensilio
     */
    private String nombre;
    private String uso;
    private int cantidad;

    /**
     * Consige la informacion con respecto al utensilio
     *
     * @return (String) nombre del utensilio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece la informacion con respecto al nombre del Utensilio
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Consige la informacion con respecto al uso del utensilio
     *
     * @return (String) uso del utensilio
     */
    public String getUso() {
        return uso;
    }

    /**
     *Establece la informacion con respecto al uso del utensilio
     * @param uso
     */
    public void setUso(String uso) {
        this.uso = uso;
    }

    /**
     * Consige la informacion con respecto a la cantidad de utensilios
     * @return 
     */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * Establece la informacion con respecto a la cantidad de utensilios
     * @param cantidad 
     */

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * 
     * @param nombre
     * @return true
     */
    public boolean comprarUtensilio(String nombre) {
        return true;
    }

    /**
     * 
     * @param nombre
     * @return true
     */
    public boolean lavarUtensilio(String nombre) {
        return true;

    }
    /**
     * 
     * @param nombre
     * @return true
     */

    public boolean desecharUtensilio(String nombre) {
        return true;
    }
    
     /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola linea 
     * @return (String) informacion resumida
     */

    @Override
    public String toString() {
        return "Utensilio{" + "nombre=" + nombre + ", uso=" + uso + ", cantidad=" + cantidad + '}';
    }

}
