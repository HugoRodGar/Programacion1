package HerenciasRestaurante;

public class Main {

    public static void main(String[] args) {

        Comanda comanda = new Comanda(5, 3);

        comanda.añadirPlato(new Primero("Ensalada", 8.5, true));
        comanda.añadirPlato(new Carne("Entrecot", 18, "Al punto"));
        comanda.añadirPlato(new Pescado("Merluza", 14));
        comanda.añadirPlato(new Postre("Tarta de queso", 6, true));

        System.out.println(comanda);

        if (comanda.hayDiabeticosEnLaMesa()) {
            System.out.println("Hay postres sin azucar en la mesa");
        }
    }

}
