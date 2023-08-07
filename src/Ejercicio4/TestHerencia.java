
package Ejercicio4;


public class TestHerencia {


    public static void main(String[] args) {
      Personaje jugador1=new Guerrero(false, 100, 200, "Thor");
        for (int i = 0; i < 6; i++) {
            jugador1.girar();
        }
        for (int i = 0; i < 5; i++) {
             jugador1.avanzar();  
        }
        for (int i = 0; i < 11; i++) {
            jugador1.disparar();
        }
      
    }
    
}
