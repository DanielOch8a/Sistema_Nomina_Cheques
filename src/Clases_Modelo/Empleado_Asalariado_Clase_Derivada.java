package Clases_Modelo;

//
// Clase Base Empleado Asalariado

public class Empleado_Asalariado_Clase_Derivada extends Empleado_Super_Clase{
    // Datos de la clase
    private double sueldoMensual;
    private double sueldoQnaAsal;

    //Constructor de default
    public Empleado_Asalariado_Clase_Derivada(){
    }
    
    //Constructor de default
    public Empleado_Asalariado_Clase_Derivada(String nombreEmp, String deptoEmp, String puestoEmp, double sueldoMensual){
        super(nombreEmp, deptoEmp, puestoEmp);
        this.sueldoMensual = sueldoMensual;
    }
    
    //--------------------------------------
    // Metodos de entrada de datos -setters-
    //--------------------------------------

    public void setSueldoMensual(double xSueldoMensual){
        this.sueldoMensual = xSueldoMensual;
    }

    public void setSueldoQnaAsal(){
        this.sueldoQnaAsal = this.sueldoMensual / 2;    
    }

    //--------------------------------------
    // Metodo de acceso al dato -getter-
    //--------------------------------------

    public double getSueldoQnaAsal(){
        return this.sueldoQnaAsal;
    }
}