/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;
import animales.Ballena;

/**
 *
 * @author ABJ
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado emp1 = new Empleado("Juan",18,30000);
        System.out.println(emp1.getNombre());
        System.out.println(emp1.toString());
        
        Gerente emp2 = new Gerente(200000,"Luis",20,40000);
        System.out.println(emp2.toString());
        
        Ballena ballena1 = new Ballena(20, 2, "moby", "atlantico", "gris");
        ballena1.pelearconPinocho();
        System.out.println(ballena1.toString());
        ballena1.sonido();
    }
    
}
