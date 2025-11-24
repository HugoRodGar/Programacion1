package Ejercicios_de_clase.EjerciciosPracticaExamen2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura del árbol: ");
        int altura = sc.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int troncos = altura / 5;

        for (int t = 0; t < troncos; t++) {
            for (int j = 1; j < altura; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
}
