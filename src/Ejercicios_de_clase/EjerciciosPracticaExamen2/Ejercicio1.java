package Ejercicios_de_clase.EjerciciosPracticaExamen2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la altura del arbol: ");
        int altura = scanner.nextInt();

        int i = 0;
        for (i = 1; i <= altura; i++) {
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i < altura / 2; i++) {
            for (int j = 0; j < altura - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}