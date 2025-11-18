package Ejercicios4_Arrays;

/*
Dado un array de 50 números entre 1 y 100, aleatorios, escribir una lista ordenada con los valores que no aparecen en el array.
 */

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {

        int[] numeros = new int[50];

        boolean[] numerosAparecen = new boolean[101];

        Random r = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100) + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            numerosAparecen[numeros[i]] = true;
        }

        System.out.println("Mostramos números que no aparecen ordenados:");
        for (int i = 1; i <= 100; i++) {
            if (!numerosAparecen[i]) {
                System.out.println(i + " ");
            }
        }
    }
}
