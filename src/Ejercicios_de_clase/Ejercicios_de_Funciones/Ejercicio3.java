package Ejercicios_de_clase.Ejercicios_de_Funciones;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    500€
    >18 && <25 +20%
    >35 && <55 -10%
    && !accidentes
    >65 && !accidentes +10%
    >65 && accidentes  +30%
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int precioInicial = 500;
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        System.out.println("Has tenido accidentes? true/false");
        boolean accidentes = sc.nextBoolean();


        double precioSeguro = calcularSeguro(precioInicial, edad, accidentes);
        System.out.println("El precio final del seguro es: " + precioSeguro);
        System.out.println("Quieres contratarlo? true/false");
        if (sc.nextBoolean()) {
            contratarSeguro();
        }

        sc.close();

    }

    static double calcularSeguro(double precioInicial, int edad, boolean accidentes) {
        if (edad > 18 && edad < 25) {
            return precioInicial + (precioInicial * 20 / 100);
        } else if (edad > 35 && edad < 55 && !accidentes) {
            return precioInicial - (precioInicial * 10 / 100);
        } else if (edad > 65 && !accidentes) {
            return precioInicial + (precioInicial * 10 / 100);
        } else if (edad > 65) {
            return precioInicial + (precioInicial * 30 / 100);
        } else {
            return precioInicial;
        }
    }

    static void contratarSeguro() {

    }

}
