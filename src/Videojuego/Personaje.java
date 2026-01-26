package Videojuego;

public class Personaje {

    // Atributos
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean esMagico;

    // Constructor
    public Personaje(String nombre, boolean esMagico) {
        this.nombre = nombre;
        this.esMagico = esMagico;
        this.nivel = 1;
        this.puntosVida = 100;
    }

    // Metodo para recibir daño
    public void recibirDaño(int daño) {
        double dañoReal = daño;

        if (esMagico) {
            dañoReal *= 0.8; // Reducción del 20%
            System.out.println(nombre + " es mágico, el daño se reduce a " + dañoReal);
        } else {
            System.out.println(nombre + " recibe daño completo de " + dañoReal);
        }

        puntosVida -= (int)dañoReal;

        if (puntosVida < 0) {
            puntosVida = 0;
        }

        System.out.println(nombre + " ahora tiene " + puntosVida + " puntos de vida.");
    }

    // Metodo para curar
    public void curar() {
        int vidaAntes = puntosVida;
        if (nivel < 5) {
            puntosVida += 10;
            System.out.println(nombre + " se cura 10 puntos de vida");
        } else {
            puntosVida += 25;
            System.out.println(nombre + " se cura 25 puntos de vida");
        }

        if (puntosVida > 100) {
            puntosVida = 100;
        }

        System.out.println(nombre + " tiene ahora " + puntosVida + " puntos de vida (antes tenía " + vidaAntes + ")");
    }

    // Metodo para subir de nivel (opcional, útil para probar curar)
    public void subirNivel() {
        nivel++;
        System.out.println(nombre + " sube al nivel " + nivel);
    }
}
