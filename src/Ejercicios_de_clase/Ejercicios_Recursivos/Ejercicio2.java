package Ejercicios_de_clase.Ejercicios_Recursivos;

public class Ejercicio2 {

    public static void main(String[] args) {

        String hola = "hola";

        cadenilla(hola);

    }

    static void cadenilla(String cadena) {
        System.out.println(cadena.charAt(0));
        String subcadena = cadena.substring(1);
        if (subcadena.length() > 0) {
            cadenilla(subcadena);
        }
    }

}
