/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;


public class ejercicio1 {

  
    public static void main(String[] args) {
      Animal perro=new Perro("Stich","Carnivoro",15,"Doberman");
         perro.alimentarse();
      Perro perro1=new Perro("Teddy", "Croquetas", 10, "Chihuahua");
      perro1.alimentarse();
      
      Animal gato=new Gato("Pelusa", "Galleta", 15, "Sianes");
      gato.alimentarse();
      Animal caballo=new Caballo("Spark", "Pasto", 25, "Fino");
      caballo.alimentarse();
    }
    
}
