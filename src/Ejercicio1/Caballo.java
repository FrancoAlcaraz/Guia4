package Ejercicio1;

public class Caballo extends Animal {

    public Caballo(String Nombre, String Alimento, int Edad, String Raza) {
        super(Nombre, Alimento, Edad, Raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Mi Nombre es "+Nombre+",me alimento de "+Alimento);
    }
}
