package Clases_Modelo;

//
// Superclase Empleado
public class Empleado_Super_Clase{
      
      // Atributos o Variables
    protected String nombreEmp;
    protected String deptoEmp;
    protected String puestoEmp;

    //--------------------------------------
    // Constructor default
    //--------------------------------------
    public Empleado_Super_Clase(){
    }
    
    //--------------------------------------
    // Manipulando el Constructor
    //--------------------------------------
    public Empleado_Super_Clase(String nombreEmp, String deptoEmp, String puestoEmp){
        this.nombreEmp = nombreEmp;
        this.deptoEmp = deptoEmp;
        this.puestoEmp = puestoEmp;
    }
    
    
    //--------------------------------------
    // Metodos de entrada de datos -setters-
    //--------------------------------------
    public void setNombreEmp(String Nombre){
        this.nombreEmp = Nombre;    
    }

    public void setDeptoEmp(String Depto){
        this.deptoEmp = Depto;    
    }

    public void setPuestoEmp(String Puesto){
        this.puestoEmp = Puesto;    
    }
 
    //--------------------------------------
    // Metodos de acceso a los datos -getters-
    //--------------------------------------
    public String getNombreEmp(){
        return this.nombreEmp;
    }

    public String getDeptoEmp(){
        return this.deptoEmp;
    }

    public String getPuestoEmp(){
        return this.puestoEmp;
    }
}

