package Tema3.UT3_Ejemplos.Punto;

public class Punto {

    double x;
    double y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "punto (" + x + "," + y + ")";
    }

    public double distancia(Punto otroPunto) {
        double distancia = Math.sqrt(Math.pow(this.x - otroPunto.x, 2) + Math.pow(this.y - otroPunto.y, 2));
        return distancia;
    }


}
