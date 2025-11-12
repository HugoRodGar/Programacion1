package Ejercicios_de_clase.Praticas_Clase;

import java.util.Arrays;

public class EjercicioArrayDeArrays {

    public static void main(String[] args) {

        int[] numeros1 = {1, 2, 3};
        int[] numeros2 = {4, 5, 6};

        int[][] numeros = {numeros1, numeros2};
        System.out.println("Vamos aimprimir el Array de Arrays");
        for (int[] numero : numeros) {
            System.out.println(Arrays.toString(numero));
        }

    }

}
