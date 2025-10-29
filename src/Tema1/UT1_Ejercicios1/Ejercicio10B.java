package Tema1.UT1_Ejercicios1;

import java.util.Scanner;

public class Ejercicio10B {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero por favor");

        int A = scanner.nextInt();

        System.out.println((A % 2 == 0) ? "El numero " + A + " es par" : "El numero " + A + " Es impar");

    }
}
