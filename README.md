# Abstraccion-de-objetos
 	PRÁCTICA DE LABORATORIO 

CARRERA: COMPUTACIÓN

ASIGNATURA: PROGRAMACIÓN APLICADA

NRO. PRÁCTICA:	1	

TÍTULO PRÁCTICA: ABSTRACCIÓN DE OBJETOS A CLASES(POO)

OBJETIVO ALCANZADO:
Modelar aplicaciones de software mediante diagramas de clases.

ACTIVIDADES DESARROLLADAS
1. 1. Describir 10 objetos relacionados a tema de Restaurantes.

Factura: Una factura es un documento de índole comercial que indica la compraventa de un bien o servicio. Tiene validez legal y fiscal. También, es un documento de carácter mercantil que indica una compraventa de un bien o servicio y que, entre otras cosas, debe incluir toda la información de la operación.
Cliente: Persona que utiliza los servicios de dicha empresa, lo cual para poder prestar los servicios necesitamos saber su nombre, apellido y mas que todo su cedula.
Empleado: Persona que trabaja para dicha empresa, lo cual para poder asegurar necesitamos saber su nombre, apellido, cargo y su cedula.
Utensilio: Es un objeto creado para un determinado uso, como en este caso en un restaurante tenemos varios utensilios, pero para poderlo diferenciar se debe conocer su nombre, uso y la cantidad de utensilios que se dispone.
Tipo de comida: Necesitamos saber los nombres de la comida, precio que tiene cada uno y su descripción.
Mesa: Es un mueble conformado por un tablero horizontal, lo cual se sostiene por uno o varios pies, y con una altura conveniente para poder realizar las actividades o poner cosas encima de ella.
Silla:  Es un mueble que cuenta con un respaldo y generalmente con cuatro apoyos, por lo cual su finalidad es servir de asiento para una persona.
Ganancia: Es un beneficio que se obtiene de algo, en este caso de un restaurante 
Horarios: Es un programa, que se considera como una herramienta básica de gestión del tiempo, lo cual consta de una lista de días y horas en las que se acontece. 
Inventario: Es el conjunto de mercancías que se acumulan en el almacén pendientes de ser utilizados en   un proceso productivo.


2. De los 10 objetos descritos en el paso 1, abstraer 5 de ellos en clases y diagramarlas con tres atributos y tres métodos mínimo para cada clase (los métodos getters y setter no cuentan).
     Utensilio                          

-Nombre:String
-Uso:String
-cantidad: Int

+comprar(Nombre:String):Boolean
+Lavar(Nombre:String):Boolean
+Desechar(Nombre:String):Boolean

      Factura
 
 -Ruc:Int 
-Nombre: Sring
-Direccion: String
-FormaPago:String     

+crearFactura(Ruc:String):Boolean
+EditarFactura(Ruc:Srring,Nombre:String,Direccion:String,FormaPago:String):Boolean
+EliminarFctura(Ruc:Int):Boolean

    Empleado
    
 -Cedula: Int
-Nombre:String
-Apellido:String
-Cargo: String

+ingresarEmpleado(Cedula:Int, Nombre:String, Apellido:String, Cargo:String):Boolean
+modificar(Cedula: int , Nombre:String , Apellido:String , Cargo:String):Boolean
+eliminarEmpleado(Cedula:String):Boolean

    Cliente

-Cedula: Int
-Nombre:String
-Apellido:String


+ingresarCliente(Cedula:String , Nombre:String, Apellido:String):Boolean
+modificarCliente(Cedula:String , Nombre:String, Apellido:String):Boolean
+eliminarCliente(Cedula:Int):Boolean

    TipoComida

-Nombre:String
-Precio:Int
-Descripcion:String

+comprarComida(Nombre:String):Boolean
+cambiarComida(Nombre:String):Boolean
+desecharComida(Nombre:String):Boolean

3. Crear un proyecto Java en NetBeans llamado Practica01-SuApellidoNombre y sobre el mismo codificar las 5 clases seleccionadas en java utilizando: atributos, métodos y encapsulamiento con los métodos getters and setters.  En relación a los métodos (comportamientos) estos solo deben ser declarados es decir no se requiere del procedimiento.
Todas las clases y métodos deben contar con la documentación del código fuente. Además, se debe nombrar correctamente las clases, métodos, atributos y/o paquetes según las buenas prácticas de programación de las convenciones de los códigos de java.
 
 
**CLASE FACTURA**

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
    
   
   
   **CLASE CLIENTE**
    
    
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
    
    
    **CLASE EMPLEADO**
    
    
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
     
     
     ***CLASE UTENSILIO**
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
    
    
    *** CLASE TIPOCOMIDA***
   
   package ec.edu.ups;

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

    
}

 
 
 

4. Implementar el método toString () en cada clase
 
  
  @Override
    public String toString() {
        return "Factura{" + "ruc=" + getRuc() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + ", formaPago=" +       getFormaPago() + '}';
    }

   @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
 @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + '}';
   
   }
     @Override
    public String toString() {
        return "Utensilio{" + "nombre=" + nombre + ", uso=" + uso + ", cantidad=" + cantidad + '}';
    } 
    
    @Override
    public String toString() {
        return "TipoComida{" + "nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }

 
5. 5. Programar una clase principal (tipo main) que permita crear un objeto (instanciar) de cada clase referida en el punto anterior, estableciendo/seteando los datos/valores ingresados por el usuario (usando la clase Scanner) y posterior muestre dicha información del objeto en la consola de NetBeans.

Utilizar las clases System.in y System.out para entrada y salida de datos.

Opcional: Considere crear un menú para poder indicar el objeto a manipular y según la opción setear y mostrar los datos.

package ec.edu.ups.Pincipal;

import ec.edu.ups.Cliente;
import ec.edu.ups.Empleado;
import ec.edu.ups.Factura;
import ec.edu.ups.TipoComida;
import ec.edu.ups.Utensilio;
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
            System.out.println("digite el numero de la clase que desea crear");

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
         c   System.out.println("Objeto:");
            System.out.println("\tNombre: " + utensilio.getNombre());
            System.out.println("\tUso: " + utensilio.getUso());
            System.out.println("\tCantidad: " + utensilio.getCantidad());
            System.out.println("\ntoString():\n" + utensilio.toString());
        }
    }
}

***Programa Ejecutado***


***Bienvenido al menu de clases***
Seleccione una de la opciones de clases para crear un objeto de tipo: 
1: Cliente
2: Empleado
3: Factura
4: Tipo de Comida
5: Utensilios
Digite el numero de la clase que desea crear
1
Cedula del Cliente:
0107593873
Nombre del Cliente:
Carmen
Apellido del Cliente:
Bravo
Para volver a usar ingrese  ( c )
Digite la letra (p) para imprimir los objetos
c
***Bienvenido al menu de clases***
Seleccione una de la opciones de clases para crear un objeto de tipo: 
1: Cliente
2: Empleado
3: Factura
4: Tipo de Comida
5: Utensilios
Digite el numero de la clase que desea crear
2
Cedula del Empleado:
0107593873
Nombre del Empleado:
Carlos 
Apellido del Empleado:
Bravo
Cargo:
Chef
Para volver a usar ingrese  ( c )
Digite la letra (p) para imprimir los objetos
p
Clase: Cliente
Objeto:
	Cedula: 107593873
	Nombre: Carmen
	Apellido: Bravo

toString():
Cliente{cedula=107593873, nombre=Carmen, apellido=Bravo}
Clase: Empleado
Objeto:
	Cedula: 107593873
	Nombre: Carlos
	Apellido: Bravo
	Cargo:Chef

toString():
Empleado{cedula=107593873, nombre=Carlos, apellido=Bravo, cargo=Chef}
 
6.Crear el reporsitorio
Mi usuario:
CarmenBravo20
Nombre del trabajo:
Abstracción de Objetos 


RESULTADO(S) OBTENIDO(S):
Abstraer de la vida real objetos, representarlos como clases y programar sobre ellos. 
También A hacer el correcto uso de las convenciones del código JAVA, Comentar el código y organizar diagramas UML.

CONCLUSIONES:
Los estudiantes podrán introducirse en el modelamiento de aplicaciones de software. 
Y saber respetar las convenciones del código JAVA.

RECOMENDACIONES:
Tener siempre en cuenta las convenciones del código JAVA.
Acostumbrarse a buenas prácticas de programación.
Tener en cuenta la relación entre clases.

Nombre de estudiante: Carmen Bravo


Firma de estudiante:  Carmen Bravo
