package Ejercicios_de_clase.RepasoFinalArraysAndFunciones.EjerciciosArraysRepasoFinal;

import java.util.Arrays;

public class Ejercicio5 {

    public static void main(String[] args) {

        int[] notas = {4, 9, 7, 5, 10};

        System.out.println(Arrays.toString(notas));

        notas[0] = 6;
        System.out.println(Arrays.toString(notas));

        notas = new int[4];
        System.out.println(Arrays.toString(notas));

    }

}
