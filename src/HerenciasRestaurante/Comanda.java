package HerenciasRestaurante;

public class Comanda {

    private int numeroMesa;
    private int comensales;
    private Plato[] platos;
    private int cantidad;

    public Comanda(int numeroMesa, int comensales) {
        this.numeroMesa = numeroMesa;
        this.comensales = comensales;

        platos = new Plato[20];
        cantidad = 0;
    }

    public void añadirPlato(Plato p) {
        platos[cantidad] = p;
        cantidad++;
    }

    public double coste() {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total = total + platos[i].getPrecio();
        }
        return total;
    }

    public boolean hayDiabeticosEnLaMesa() {
        for (int i = 0; i < cantidad; i++) {
            if (platos[i] instanceof Postre) {
                Postre p = (Postre) platos[i];
                if (p.isSinAzucar()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        String texto = "Mesa: " + numeroMesa + "\n";
        texto = texto + "Comensales: " + comensales + "\n";
        texto = texto + "Platos: \n";

        for (int i = 0; i < cantidad; i++) {
            texto = texto + "- " + platos[i].toString() + "\n";
        }
        texto = texto + "Total: " + coste() + "€";
        return texto;
    }

}