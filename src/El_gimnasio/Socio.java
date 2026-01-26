package El_gimnasio;

public class Socio {

    private static int contadorSocios;
    private int id;
    private String nombre;

    public Socio(String nombre) {
        contadorSocios++;
        this.id = contadorSocios;
        this.nombre = nombre;
    }

    public void Id() {
        System.out.println("El id de " + nombre + " es " + id);
    }

    public static void TotalSocios() {
        System.out.println("El total de socios es: " + contadorSocios);
    }

}
