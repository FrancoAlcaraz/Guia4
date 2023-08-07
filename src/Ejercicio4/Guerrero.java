package Ejercicio4;

public class Guerrero extends Personaje {

    private boolean Caballo;

    public Guerrero(boolean Caballo, int X, int Y, String Nombre) {
        super(X, Y, Nombre);
        this.Caballo = Caballo;
    }

    public boolean isCaballo() {
        return Caballo;
    }

    public void setCaballo(boolean Caballo) {
        this.Caballo = Caballo;
    }

    @Override
    public void disparar() {

        if (Energia < 30) {
            Caballo = false;
        }
        super.disparar();
    }

    @Override
    public void avanzar() {

        if (Caballo) {
            switch (Orientacion) {
                case 'N':
                    Ubicacion.setY(Ubicacion.getY() + 1);
                    pasos+=10;
                     System.out.println("Avanza 1 al: "+Orientacion);
                        System.out.println("Pasos dados: " + pasos);
                    break;
                case 'E':
                    Ubicacion.setX(Ubicacion.getX() + 10);
                    pasos+=10;
                    System.out.println("Avanza 10 al: "+Orientacion);
                       System.out.println("Pasos dados: " + pasos);
                    break;
                case 'S':
                    Ubicacion.setY(Ubicacion.getY() - 1);
                    pasos+=10;
                    System.out.println("Avanza 1 al: "+Orientacion);
                       System.out.println("Pasos dados: " + pasos);
                    break;
                default:
                    Ubicacion.setX(Ubicacion.getX() - 10);
                    pasos+=10;
                    System.out.println("Avanza 10 al: "+Orientacion);
                       System.out.println("Pasos dados: " + pasos);
            }

        } else {
            super.avanzar();
        }

    }
}
