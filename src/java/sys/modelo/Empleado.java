package sys.modelo;
// Generated 19/09/2023 08:42:20 AM by Hibernate Tools 4.3.1



/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idEmpleado;
     private String nombreEm;
     private String cargo;
     private String salario;
     private String empleado;

    public Empleado() {
    }

    public Empleado(String nombreEm, String cargo, String salario, String empleado) {
       this.nombreEm = nombreEm;
       this.cargo = cargo;
       this.salario = salario;
       this.empleado = empleado;
    }
   
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getNombreEm() {
        return this.nombreEm;
    }
    
    public void setNombreEm(String nombreEm) {
        this.nombreEm = nombreEm;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getSalario() {
        return this.salario;
    }
    
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }




}

