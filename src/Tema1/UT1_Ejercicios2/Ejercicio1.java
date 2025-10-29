package Tema1.UT1_Ejercicios2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero por favor");

        int B = scanner.nextInt();

        System.out.println((B >= 0) ? "El numero " + B + " es positivo" : "El numero" + B + " es negativo");

    }
}
