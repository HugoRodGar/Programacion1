package AvilaExpress;

public class NaveEspacial {

    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;

    public NaveEspacial(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        this.combustible = 100;
        this.enMision = false;
    }

    public NaveEspacial(String nombre) {
        this.nombre = nombre;
        this.combustible = 100;
        this.enMision = false;
        this.capacidadCarga = 6;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if(combustible >= 0 && combustible <= 100) {
            this.combustible = combustible;
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isEnMision() {
        return enMision;
    }

    public void setEnMision(boolean enMision) {
        this.enMision = enMision;
    }

    public void viajar(int distancia) {
        if (combustible - (distancia * 2) > 0) {
            combustible-=distancia*2;
            System.out.println("El combustible restante de " + nombre + " es: " + combustible);
            enMision = true;
        } else {
            System.out.println(nombre + " Tiene combustible insuficiente para la misión");
        }
    }

    public void repostar() {
        combustible = 100;
        enMision = false;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + " | Combustible: " + combustible + " | Capacidad de carga: " + capacidadCarga + " Toneladas | La nave esta en una msion: " + enMision);
    }
}
