package HerenciasRestaurante;

public class Postre extends Plato {

    private boolean sinAzucar;

    public Postre(String nombre, double precio, boolean sinAzucar) {
        super(nombre, precio);
        this.sinAzucar = sinAzucar;
    }

    public boolean isSinAzucar() {
        return sinAzucar;
    }

    public String toString() {

        if (sinAzucar) {
            return super.toString() + " (Sin azucar)";
        } else {
            return super.toString() + " (Con azucar)";
        }
    }

}
