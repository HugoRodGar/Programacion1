package HerenciasRestaurante;

public class Carne extends Plato {

    private String coccion;

    public Carne(String nombre, double precio, String coccion) {
        super(nombre, precio);
        this.coccion = coccion;
    }

    public String toString() {
        return super.toString() + " Cocción: " + coccion;
    }
}