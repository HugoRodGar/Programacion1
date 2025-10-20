package UT2_Ejercicios1;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número entre 0 y 9999: ");
        numero = sc.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("El número debe estar entre 0 y 9999.");
        } else {
            int unidad = numero % 10;           // Última cifra
            int decena = (numero / 10) % 10;    // Segunda cifra desde la derecha
            int centena = (numero / 100) % 10;  // Tercera cifra desde la derecha
            int millar = numero / 1000;         // Primera cifra (si la hay)

            // Casos según la cantidad de cifras:
            if (numero < 10) {
                System.out.println("El número " + numero + " es capicúa.");
            } else if (numero < 100) {
                if (unidad == decena) {
                    System.out.println("El número " + numero + " es capicúa.");
                } else {
                    System.out.println("El número " + numero + " no es capicúa.");
                }
            } else if (numero < 1000) {
                if (unidad == centena) {
                    System.out.println("El número " + numero + " es capicúa.");
                } else
                    System.out.println("El número " + numero + " no es capicúa.");
            } else { // número de 4 cifras
                if (unidad == millar && decena == centena)
                    System.out.println("El número " + numero + " es capicúa.");
                else
                    System.out.println("El número " + numero + " no es capicúa.");
            }
        }

        sc.close();
    }
}