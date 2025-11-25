/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author ABJ
 */
public class Empleado extends Object{
    private String nombre;
    private int numEmpleado;
    private double sueldo;
    
    //Sobrecarga
    public Empleado() {
    }

    public Empleado(String nombre, int numEmpleado, double sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void aumentarSueldo(int porcentaje){
        // sueldo = sueldo + sueldo*porcentaje/100;
        sueldo += sueldo*porcentaje/100;
    }
    
    //Sobreescritura
    @Override
    public String toString(){
        return "nombre="+nombre+" numEmpleado="+numEmpleado+" sueldo="+sueldo;
    }
}
