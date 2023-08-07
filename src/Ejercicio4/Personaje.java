package Ejercicio4;

public abstract class Personaje {

    protected Position Ubicacion;

    protected String Nombre;

    protected int Vida;

    protected int Energia;

    protected char Orientacion;
    
    int disparo=0;
    protected int pasos = 0;

    public Personaje(int X, int Y, String Nombre) {
        this.Ubicacion = new Position(X, Y);
        this.Nombre = Nombre;
        this.Vida = 3;
        this.Energia = 100;
        this.Orientacion = 'N';
    }

    public Personaje() {
    }

    public Position getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(Position Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getEnergia() {
        return Energia;
    }

    public void setEnergia(int Energia) {
        this.Energia = Energia;
    }

    public char getOrientacion() {
        return Orientacion;
    }

    public void setOrientacion(char Orientacion) {
        this.Orientacion = Orientacion;
    }

    public void girar() {
        switch (Orientacion) {
            case 'N':
                Orientacion = 'E';
                System.out.println("Mirando al: " + Orientacion);
                break;
            case 'E':
                Orientacion = 'S';
                System.out.println("Mirando al: " + Orientacion);
                break;
            case 'S':
                Orientacion = 'O';
                System.out.println("Mirando al: " + Orientacion);
                break;
            default:
                Orientacion = 'N';
                System.out.println("Mirando al: " + Orientacion);
        }
    }

    public void disparar() {
          
        if (Energia >= 10) {
            
            Energia -= 10;
            disparo++;
            System.out.println("dispara "+ disparo +" vez");
            System.out.println("Cantidad de Energia "+ Energia);
        }
    }

    public void avanzar() {

        switch (Orientacion) {
            case 'N':
                Ubicacion.setY(Ubicacion.getY() + 1);
                pasos++;
                System.out.println("Avanza 1 al: " + Orientacion);
                System.out.println("Pasos dados: " + pasos);
                break;
            case 'E':
                Ubicacion.setX(Ubicacion.getX() + 1);
                pasos++;
                System.out.println("Avanza 1 al: " + Orientacion);
                System.out.println("Pasos dados: " + pasos);
                break;
            case 'S':
                Ubicacion.setY(Ubicacion.getY() - 1);
                pasos++;
                System.out.println("Avanza 1 al: " + Orientacion);
                System.out.println("Pasos dados: " + pasos);
                break;
            default:
                Ubicacion.setX(Ubicacion.getX() - 1);
                pasos++;
                System.out.println("Avanza 1 al: " + Orientacion);
                System.out.println("Pasos dados: " + pasos);
        }
    }
}
