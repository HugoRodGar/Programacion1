package Videojuego;

public class PruebaPersonaje {
    public static void main(String[] args) {

        Personaje p1 = new Personaje("Gandalf", true);
        Personaje p2 = new Personaje("Conan", false);

        // Daño
        p1.recibirDaño(50);
        p2.recibirDaño(50);

        System.out.println("-----");

        // Curación
        p1.curar();
        p2.curar();

        System.out.println("-----");

        // Subir nivel y curar
        p1.subirNivel();
        p1.subirNivel();
        p1.subirNivel();
        p1.subirNivel(); // Ahora nivel 5
        p1.curar(); // Debería curar 25 puntos
    }
}

