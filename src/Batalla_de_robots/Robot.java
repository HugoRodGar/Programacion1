package Batalla_de_robots;

public class Robot {

    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;


    public Robot(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100;

    }
}
