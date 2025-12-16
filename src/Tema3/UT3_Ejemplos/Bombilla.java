package Tema3.UT3_Ejemplos;

public class Bombilla {

    boolean encendida;
    String casquillo;
    int temperatura;

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public String devolver() {
        return this.encendida ? "Encendida" : "Apagada";
    }

}
