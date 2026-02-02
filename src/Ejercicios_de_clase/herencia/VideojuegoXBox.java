package Ejercicios_de_clase.herencia;

public class VideojuegoXBox extends Videojuego {

    boolean necesitaGamepass;


    public VideojuegoXBox(String nombre, double precio, boolean necesitaGamepass) {
        super(nombre, precio);
        this.necesitaGamepass = necesitaGamepass;
    }

    public String toString() {
        return super.toString() + (necesitaGamepass ? " y necesita gamepass" : " y no necesita gamepass");
    }

}
