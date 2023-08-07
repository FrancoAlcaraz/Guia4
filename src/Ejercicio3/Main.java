/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;


public class Main {
   public static void main(String[] args) {
       FigurasGeometricas circulo=new Circulo(4);
       circulo.calcularArea();
       circulo.calcularPerimetro();
       FigurasGeometricas rectangulo=new Rectangulo(2, 4);
       rectangulo.calcularArea();
       rectangulo.calcularPerimetro();
   }    
}
