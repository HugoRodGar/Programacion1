package Ejercicios2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una velocidad en Km/h, por favor");

        double velocidadKms = scanner.nextInt();
        double velocidadMs = velocidadKms / 3.6;

        scanner.close();
        System.out.println("Tu velocidad en M/s es " + velocidadMs + "M/s");

    }
}
