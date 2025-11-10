package Tema2.UT2_Ejercicios3;

import java.util.Scanner;

public class Ejercicio5 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();

        int resultado = factorial(numero);

        if (resultado == -1) {
            System.out.println("El número no puede ser negativo");
        } else if (resultado == -2) {
            System.out.println("El factorial de 0 es: 1");
        } else {
            System.out.println("El factorial de " + numero + " es: " +  resultado);
        }

        sc.close();

    }

    private static int factorial(int numero) {
        if (numero < 0) {
            return -1;
        } else if (numero == 0) {
            return -2;
        } else if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero -1);
        }
    }

}
