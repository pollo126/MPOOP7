/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author ABJ
 */
public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente() {
    }

    public Gerente(double presupuesto, String nombre, int numEmpleado, double sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    //Azucar sintactica
    public void asignarPresupuesto(double presupuesto){
        setPresupuesto(presupuesto);
    }

    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    
}
