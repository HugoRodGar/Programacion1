package Ejercicios_de_clase.Praticas_Clase;

import java.util.Arrays;

public class EjercicioArrayDeArrays2 {

    public static void main(String[] args) {

        int[][] numeros = new int[2][3];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;

        System.out.println("Vamos aimprimir el Array de Arrays");
        for (int[] numero : numeros) {
            System.out.println(Arrays.toString(numero));
        }

    }

}
