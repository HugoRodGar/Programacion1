package Tema2.UT2_Ejercicios2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de términos (N): ");
        int N = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.println("Los " + N + " primeros términos de la serie de Fibonacci son:");
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        sc.close();

    }
}

