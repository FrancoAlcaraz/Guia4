package Ejercicio2;

public class Televisor extends Electrodomestico {

    private double Resolucion;

    private boolean SintonizadorTDT;

    public Televisor(double Resolucion, boolean SintonizadorTDT, int precio, double Peso) {
        super(precio, Peso);
        this.Resolucion = Resolucion;
        this.SintonizadorTDT = SintonizadorTDT;
    }

    
    public Televisor() {
    }

    public double getResolucion() {
        return Resolucion;
    }

    public void setResolucion(double Resolucion) {
        this.Resolucion = Resolucion;
    }

    public boolean isSintonizadorTDT() {
        return SintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean SintonizadorTDT) {
        this.SintonizadorTDT = SintonizadorTDT;
    }

    @Override
    public void precioFinal() {  
        if(Resolucion>40){
        precio+= ((precio*30)/100);
        }if(this.SintonizadorTDT==true){
        precio+=500;
        }
        super.precioFinal();
        System.out.println("_____________________________");
        System.out.println("Color: "+ Color);
        System.out.println("Consumo Energetico: "+Consumo);
        System.out.println("Resolucion: "+Resolucion);  
        System.out.println("Peso: "+Peso);
        System.out.println("Sintonizador: "+SintonizadorTDT);
        System.out.println("Precio Final: $"+precio);
        System.out.println("_______________________________");
    }
}
