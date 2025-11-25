/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author ABJ
 */
public class AnimalAereo extends Animal {
    private int numAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAlas = numAlas;
    }

    public int getNumAlas() {
        return numAlas;
    }

    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }
    
    public void volar(){
        System.out.println("volandoo");
    }
    @Override
    public void comer(){
        System.out.println("wakala");
    }

    @Override
    public String toString() {
        return super.toString()+"AnimalAereo{" + "numAlas=" + numAlas + '}';
    }
    
    
}
