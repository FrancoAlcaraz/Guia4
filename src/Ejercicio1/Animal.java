package Ejercicio1;

public class Animal {

    protected String Nombre;

    protected String Alimento;

    protected int Edad;

    protected String Raza;

    public Animal(String Nombre, String Alimento, int Edad, String Raza) {
        this.Nombre = Nombre;
        this.Alimento = Alimento;
        this.Edad = Edad;
        this.Raza = Raza;
    }

    public Animal() {
    }

    public void alimentarse() {
        System.out.println("");
    }
    
}

