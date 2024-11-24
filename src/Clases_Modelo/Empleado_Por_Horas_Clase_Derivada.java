package Clases_Modelo;

//
// Clase Base Empleado por Horas

public class Empleado_Por_Horas_Clase_Derivada extends Empleado_Super_Clase{

    // Datos de la clase
    private int horasTrab;
    private double cuotaHora;
    private double sueldoQnaHoras;

    //Constructor de default
    public Empleado_Por_Horas_Clase_Derivada(){
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
    
    public void setHorasTrab(int xHorasTrab){
        this.horasTrab = xHorasTrab;
    }

     public void setCuotaHora(double xCuotaHora){
        this.cuotaHora = xCuotaHora;    
     }

     public void setSueldoQnaHoras(){
        this.sueldoQnaHoras = this.horasTrab * this.cuotaHora;    
     }

    //--------------------------------------
    // Metodo de acceso al dato -getter-
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
     
     public double getSueldoQnaHoras(){
        return this.sueldoQnaHoras;
     }
}
