package Ejercicio2;

public class Lavadora extends Electrodomestico {

    private int cargar;

    public Lavadora(int cargar, int precio, double Peso) {
        super(precio, Peso);
        this.cargar = cargar;
    }

    public Lavadora() {
    }

    public int getCargar() {
        return cargar;
    }

    public void setCargar(int cargar) {
        this.cargar = cargar;
    }

    @Override
    public void precioFinal() {

        if (cargar > 30) {
            precio += 500;

        }
        super.precioFinal();
        System.out.println("______________________");
        System.out.println("Cargar hasta: " + cargar);
        System.out.println("Color: " + Color);
        System.out.println("Consumo Energetico: " + Consumo);
        System.out.println("Peso: " + Peso);
        System.out.println("$ " + precio);
    }
}
