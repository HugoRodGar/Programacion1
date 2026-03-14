package HerenciasRestaurante;

public class Primero extends Plato {

    private boolean compartir;

    public Primero(String nombre, double precio, boolean compartir) {
        super(nombre, precio);
        this.compartir = compartir;
    }

    public String toString() {
        String texto = super.toString();

        if (compartir) {
            texto = texto + " (Para compartir)";
        } else {
            texto = texto + " (Individual)";
        }
        return texto;
    }

}
