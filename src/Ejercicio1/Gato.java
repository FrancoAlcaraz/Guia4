package Ejercicio1;

public class Gato extends Animal {

    public Gato(String Nombre, String Alimento, int Edad, String Raza) {
        super(Nombre, Alimento, Edad, Raza);
      
    }

    @Override
    public void alimentarse() {
        System.out.println("Mi Nombre es "+Nombre+",Usualmente me alimentan con "+Alimento);
    }
}
