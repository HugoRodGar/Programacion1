package Tema1.UT1_Ejercicios3;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio de una circunferencia");

        double radio = scanner.nextDouble();

        double longitud = (2 * Math.PI * radio);
        double area = (Math.PI * (radio * radio));

        System.out.println("La longitud de un circulo con radio " + radio + " es " + longitud + " y su area es " + area);

    }
}
