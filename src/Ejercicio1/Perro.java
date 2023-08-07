package Ejercicio1;

public class Perro extends Animal {

    public Perro(String Nombre, String Alimento, int Edad, String Raza) {
        super(Nombre, Alimento, Edad, Raza);
        
    }

    

    @Override
    public void alimentarse() {
        System.out.println("mi Nombre es "+Nombre+", Me alimento de "+Alimento);
    }
}
