package Ejercicios_de_clase.Praticas_Clase;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrayDeArrays3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[2][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Introduce los datos de la columna " + i + " - " + j);
                numeros[i][j] = sc.nextInt();
            }
        }

        System.out.println("Vamos aimprimir el Array de Arrays");
        for (int[] numero : numeros) {
            System.out.println(Arrays.toString(numero));
        }

    }

}
