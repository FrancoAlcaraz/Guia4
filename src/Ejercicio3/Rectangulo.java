package Ejercicio3;

public class Rectangulo extends FigurasGeometricas {

    private int base;

    private int Altura;

    public Rectangulo(int base, int Altura) {
        this.base = base;
        this.Altura = Altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area Rectangulo: "+(base*Altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Rectangulo: "+((base+Altura)*2));
    }
}
