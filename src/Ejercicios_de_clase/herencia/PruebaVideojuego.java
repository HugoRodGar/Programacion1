package Ejercicios_de_clase.herencia;

public class PruebaVideojuego {

    public static void main(String[] args) {


        Videojuego v1 = new Videojuego("Mario",19.90);
        System.out.println(v1);

        VideojuegoXBox v2 = new VideojuegoXBox("Halo",39.90,true);
        System.out.println(v2);

    }

}
