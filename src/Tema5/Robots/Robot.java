package Tema5.Robots;

import java.util.Random;

public class Robot {

    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;
    double cantidad;

    public Robot(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100;
        Random random = new Random();
        this.potenciaAtaque = random.nextDouble(10, 21);
        this.blindaje = random.nextDouble(0, 10);
    }

    public void mostrarEstadistica() {
        System.out.println("Nombre: " + nombre + " | Vida: " + vida + " | Potencia de ataque: " + potenciaAtaque + " | Defensa: " + blindaje);
    }

    public double recibirDano(double cantidad) {
        double danoReal = cantidad - blindaje;
        if (danoReal < 0) {
            return vida;
        } else {
            vida = vida - danoReal;
            if (vida < 0){
                return vida = 0;
            } else {
                return vida;
            }
        }
    }

    public void atacar(Robot enmemigo){
        if (this.vida <= 0) {
            System.out.println("El robot " + nombre + " está destruido y no puede atacar");
        } else if (enmemigo.vida <= 0) {
            System.out.println("El robot " + enmemigo.nombre + " ya está destruido");
        } else {
            enmemigo.recibirDano(potenciaAtaque);
        }
    }

    public boolean estaVivo(){
        if (vida > 0){
            return true;
        } else {
            return false;
        }
    }

    public double getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }
}

