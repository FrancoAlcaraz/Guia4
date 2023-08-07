package Ejercicio3;

public class Circulo extends FigurasGeometricas {

//    private double PI;

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area Circulo: "+(PI*Math.pow(radio, 2)));
        
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Circulo: "+ (PI*radio*2));
        
    }
}
