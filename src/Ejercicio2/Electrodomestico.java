package Ejercicio2;

public class Electrodomestico {
    protected double precio;
    protected String Color;
    protected char Consumo;
    protected double Peso;
    public Electrodomestico(int precio,  double Peso) {
        this.precio = precio;
   
        this.Peso = Peso;
    }
    public Electrodomestico() {
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public char getConsumo() {
        return Consumo;
    }
    public void setConsumo(char Consumo) {
        this.Consumo = Consumo;
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    public char comprobarConsumoEnergetico(char letra) {
       
        switch (letra) {
            case 'A':
                Consumo= letra;
                break;
            case 'B':
                 Consumo= letra;
                break;
            case 'C':
                Consumo= letra;
                break;
            case 'D':
                 Consumo= letra;
                break;
            case 'E':
                 Consumo= letra;
                break;
            default:
                Consumo= 'F';
                break;
        }
        return Consumo;
    }
    public void comprobarColor(String color) {
        switch (color.toLowerCase()) { 
            case "negro":
                color=Color;
                break;
            case "rojo":
                 color=Color;
                break;
            case "azul":
                color= Color;
                break;
            case "gris":
                 Color=Color;
                break;  
            default:
                Color= "blanco";
                break;
        }
      
    }
    public void precioFinal() {
        switch (this.Consumo) {
            case 'A':
                precio += 1000d;
                break;
            case 'B':
                precio += 800d;
                break;
            case 'C':
                precio += 600d;
                break;
            case 'D':
                precio += 500d;
                break;
            case 'E':
                precio += 300d;
                break;
            case 'F':
                precio += 100d;
                break;
        }
        if (Peso >= 1 && Peso <= 19) {
            precio += 100d;
        } else if (Peso >= 20 && Peso <= 49) {
            precio += 500d;
        } else if (Peso >= 50 && Peso <= 79) {
            precio += 800d;
        } else if (Peso >= 80) {
            precio += 1000d;
        }
   
    }
}
