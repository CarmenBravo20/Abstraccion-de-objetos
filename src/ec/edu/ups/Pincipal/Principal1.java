/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Pincipal;

import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Factura;
import ec.edu.ups.clases.TipoComida;
import ec.edu.ups.clases.Utensilio;
import java.util.Scanner;

/**
 * @since 2019
 * @version 2.0
 * @author Carmen Bravo
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        /**
         * estamos instanciando cada una de la clases
         */
        Cliente cliente = new Cliente();
        Empleado empleado = new Empleado();
        Factura fact = new Factura();
        TipoComida tc = new TipoComida();
        Utensilio utensilio = new Utensilio();

        int opcion;
        String r;
        r = "c";
        boolean b;
        b = false;
        boolean d;
        d = false;
        boolean j;
        j = false;
        boolean p;
        p = false;
        boolean z;
        z = false;
        while (r.equals("c")) {
            /**
             * El menu
             */

            System.out.println("***Bienvenido al menu de clases***");
            System.out.println("Seleccione una de la opciones de"
                    + " clases para crear un objeto de tipo: ");
            System.out.println("1: Cliente");
            System.out.println("2: Empleado");
            System.out.println("3: Factura");
            System.out.println("4: Tipo de Comida");
            System.out.println("5: Utensilios");
            System.out.println("Digite el numero de la clase que desea crear");

            opcion = Sc.nextInt();
            switch (opcion) {
                case 1:
                    //Seteo o especificación de los datos del objeto Cliente
                    System.out.println("Cedula del Cliente:");
                    cliente.setCedula(Sc.nextInt());
                    System.out.println("Nombre del Cliente:");
                    cliente.setNombre(Sc.next());
                    System.out.println("Apellido del Cliente:");
                    cliente.setApellido(Sc.next());

                    b = true;
                    break;
                case 2:
                    //Seteo o especificación de los datos del objeto Empleado
                    System.out.println("Cedula del Empleado:");
                    empleado.setCedula(Sc.nextInt());
                    System.out.println("Nombre del Empleado:");
                    empleado.setNombre(Sc.next());
                    System.out.println("Apellido del Empleado:");
                    empleado.setApellido(Sc.next());
                    System.out.println("Cargo:");
                    empleado.setCargo(Sc.next());
                    d = true;
                    break;
                case 3:
                    //Seteo o especificación de los datos del objeto Factura
                    System.out.println("Ruc:");
                    fact.setRuc(Sc.nextInt());
                    System.out.println("Nombre del Cliente:");
                    fact.setNombre(Sc.next());
                    System.out.println("Direccion:");
                    fact.setDireccion(Sc.next());
                    System.out.println("Forma de Pago (Tarjeta o efectivo):");
                    fact.setFormaPago(Sc.next());
                    j = true;
                    break;
                case 4:
                    //Seteo o especificación de los datos del objeto TipoComida
                    System.out.println("Nombre de la Comida:");
                    tc.setNombre(Sc.next());
                    System.out.println("Precio de la comida:");
                    tc.setPrecio(Sc.nextInt());
                    System.out.println("Su Descripcion:");
                    tc.setDescripcion(Sc.next());
                    p = true;
                    break;
                case 5:
                    //Seteo o especificación de los datos del objeto utensilio
                    System.out.println("Nombre del Utensilio:");
                    utensilio.setNombre(Sc.next());
                    System.out.println("Su uso:");
                    utensilio.setUso(Sc.next());
                    System.out.println("Cantidad de Utensilios:");
                    utensilio.setCantidad(Sc.nextInt());

                    z = true;
                    break;
                default:
                    System.out.println("Solo existen 5 clases");
            }
            System.out.println("Para volver a usar ingrese  ( c )");
            System.out.println("Digite la letra (p) para imprimir los objetos");
            r = Sc.next();
        }
        if ((b == false) && (d == false) && (j == false) && (p == false) && (z == false)) {
            System.out.println("No se h2"
                    + "a creado ningun objeto");
        }
        if (b == true) {
            //Recuperación de los valores
            System.out.println("Clase: Cliente");
            System.out.println("Objeto:");
            System.out.println("\tCedula: " + cliente.getCedula());
            System.out.println("\tNombre: " + cliente.getNombre());
            System.out.println("\tApellido: " + cliente.getApellido());
            System.out.println("\ntoString():\n" + cliente.toString());
        }
        if (d == true) {
            //Recuperación de los valores
            System.out.println("Clase: Empleado");
            System.out.println("Objeto:");
            System.out.println("\tCedula: " + empleado.getCedula());
            System.out.println("\tNombre: " + empleado.getNombre());
            System.out.println("\tApellido: " + empleado.getApellido());
            System.out.println("\tCargo:" + empleado.getCargo());
            System.out.println("\ntoString():\n" + empleado.toString());
        }
        if (j == true) {
            //Recuperación de los valores
            System.out.println("Clase: Factura");
            System.out.println("Objeto:");
            System.out.println("\tRuc: " + fact.getRuc());
            System.out.println("\tNombre: " + fact.getNombre());
            System.out.println("\tDireccion: " + fact.getDireccion());
            System.out.println("\tFormaPago: " + fact.getFormaPago());
            System.out.println("\ntoString():\n" + fact.toString());
        }
        if (p == true) {
            //Recuperación de los valores
            System.out.println("Clase: Tipo de Comida");
            System.out.println("Objeto:");
            System.out.println("\tNombre: " + tc.getNombre());
            System.out.println("\tPrecio: " + tc.getPrecio());
            System.out.println("\tDescripcion: " + tc.getDescripcion());
            System.out.println("\ntoString():\n" + tc.toString());
        }
        if (z == true) {
            //Recuperación de los valores
            System.out.println("Clase: Utensilio");
            System.out.println("Objeto:");
            System.out.println("\tNombre: " + utensilio.getNombre());
            System.out.println("\tUso: " + utensilio.getUso());
            System.out.println("\tCantidad: " + utensilio.getCantidad());
            System.out.println("\ntoString():\n" + utensilio.toString());
        }
    }
}
