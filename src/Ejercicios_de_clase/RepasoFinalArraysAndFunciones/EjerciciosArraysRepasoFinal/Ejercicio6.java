package Ejercicios_de_clase.RepasoFinalArraysAndFunciones.EjerciciosArraysRepasoFinal;

import java.util.Arrays;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Ejercicio 1
        int[] numeros = {1, 2, 3};

        numeros[1] = 6;
        System.out.println(Arrays.toString(numeros));

        // Ejercicio 2
        int[] numeros2 = {1, 2, 3};

        numeros2[1] = 6;
        System.out.println(Arrays.toString(numeros2));
        numeros2 = new int[5];
        System.out.println(Arrays.toString(numeros2));
    }

}
