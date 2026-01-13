package Tema3.UT3_Ejemplos.Coche;

public class Coche {

    static int numeroObjetos = 0;

    private String matricula;
    private String color;
    private String marca;
    private double km;

    public void conducir(int cuantosKMConduces) {
        km += cuantosKMConduces;
    }

    public void pintar(String nuevoColor) {
        color = nuevoColor;
    }

    public Coche(String matricula, String color, String marca, double km) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.km = km;
        numeroObjetos++;
    }

    public Coche(String matricula, String color, String marca) {
        this(matricula, color, marca, 0);
    }

    @Override
    public String toString() {
        return "(" + numeroObjetos + ") coche de marca " + marca + " y color " + color + " con " + km + " Kilometros";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}