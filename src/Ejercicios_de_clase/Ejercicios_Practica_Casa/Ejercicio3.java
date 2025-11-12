package Ejercicios_de_clase.Ejercicios_Practica_Casa;

import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce un numero");
        int num = sc.nextInt();
        int suma = 0;

        for (int i = num; i < num + 10; i++) {
            suma += i;
            System.out.println("Sumamos " + i);
        }

        for (int i = 1; i <= suma; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
