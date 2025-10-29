package Tema1.UT1_Ejercicios3;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un precio para un producto");

        double precio = scanner.nextDouble();
        double precioFinal = precio * 1.21;

        System.out.println("El precio final con un 21% de IVA es " + precioFinal);

        scanner.close();
    }
}
