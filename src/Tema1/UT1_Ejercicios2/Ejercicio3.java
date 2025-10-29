package Tema1.UT1_Ejercicios2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un nombre, por favor");

        String nombre = scanner.next();

        System.out.println("Tu nombre es " + nombre);

        scanner.close();
    }
}
