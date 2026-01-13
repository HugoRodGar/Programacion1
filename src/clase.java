public class clase {

    //Atributos
    private String marca;
    private int bateria;
    private boolean estaBloqueado;

    public clase(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;

    }

    public clase() {
        this("Generico", 100);
    }

    //Metodos
    static void llamar() {
        System.out.println("Llamando...");
    }

}
