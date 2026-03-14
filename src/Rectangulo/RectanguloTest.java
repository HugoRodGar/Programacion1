package Rectangulo;

public class RectanguloTest {

    static void main() {

        Rectangulo r1 = new Rectangulo(2, 9);
        Rectangulo r2 = new Rectangulo();
        Rectangulo r3 = new Rectangulo(8, 8);

        // Rectángulo 1
        System.out.println(r1.mostrarValores());
        r1.orientacion();
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());

        // Rectángulo 2
        System.out.println(r2.mostrarValores());
        r2.orientacion();
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());

        // Rectángulo 3
        System.out.println(r3.mostrarValores());
        r3.orientacion();
        System.out.println(r3.calcularArea());
        System.out.println(r3.calcularPerimetro());
        r3.dibujar();
    }

}
