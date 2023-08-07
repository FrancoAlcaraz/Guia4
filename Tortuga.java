/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author ADMIN
 */
public class Tortuga extends Animal{

    public Tortuga(String Nombre, String Alimento, int Edad, String Raza) {
        super(Nombre, Alimento, Edad, Raza);
    }

    public Tortuga() {
    }
    
    @Override
      public void alimentarse() {
        System.out.println("come lechuga");
    }
    
    
}
