package Tema2.UT2_Ejercicios1;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}
