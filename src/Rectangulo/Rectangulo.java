package Rectangulo;

public class Rectangulo {

    private int largo;
    private int ancho;

    public Rectangulo() {
        this(2, 5);
    }

    public Rectangulo(int ancho, int largo) {
        if (ancho > 0 && largo > 0) {
            this.ancho = ancho;
            this.largo = largo;
        } else {
            this.ancho = 2;
            this.largo = 5;
        }
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if (largo > 0) {
            this.largo = largo;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }

    public int area() {
        return ancho * largo;
    }

    public int perimetro() {
        return 2 * (ancho + largo);
    }

    public void tipo() {
        if (ancho > largo) {
            System.out.println("El rectangulo es vertical: ");
        } else if (largo > ancho) {
            System.out.println("El rectangulo es horizontal: ");
        } else {
            System.out.println("Es un cuadrado");
        }
    }

    public void dimensiones() {
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
    }

    public void dibujoRectangulo() {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
