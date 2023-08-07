
package Ejercicio2;


public class Main {
     public static void main(String[] args) {
         
         Electrodomestico tele=new Televisor(30, false, 550,80);
      tele.comprobarColor("Azul");
      tele.comprobarConsumoEnergetico('G');
         tele.precioFinal();
         
         Electrodomestico lavadora=new Lavadora(50, 500, 60);
         lavadora.comprobarColor("Rosa");
         lavadora.comprobarConsumoEnergetico('B');
         lavadora.precioFinal();
     }
}
