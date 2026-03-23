package Tema5.Tienda_Videojuegos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Videojuego {

    String titulo;
    String plataforma;
    String genero;
    double precio;
    int stock;
    UUID codigoID;

    static List<Videojuego> videojuegos = new ArrayList<>();

    public Videojuego(String titulo, String plataforma, String genero, double precio, int stock, UUID codigoID) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.codigoID = codigoID;
        videojuegos.add(this);
    }

    public UUID generarID() {
        return UUID.randomUUID();
    }

}
