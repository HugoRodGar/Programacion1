package Tema2.UT2_Ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdiuce un numero");
        int numero = sc.nextInt();

        if (esPrimo(numero, numero /2)) {
            System.out.println("el numero: " + numero + " es primo");
        } else {
            System.out.println("el numero: " + numero + " no es primo");
        }

        sc.close();

    }

    private static boolean esPrimo(int numero, int divisor) {
        if (numero <= 1) {
            return false;
        }

        if (divisor == 1) {
            return true;
        }

        if (numero % divisor == 0) {
            return false;
        }

        return esPrimo(numero, divisor - 1);
    }


}
