package Tema1.UT1_Ejercicios2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu numero, por favor");

        int numero = scanner.nextInt();
        int numeroDoble = numero * 2;
        int numeroTriple = numero * 3;

        System.out.println("El doble de " + numero + " es " + numeroDoble + " Y el triple es " + numeroTriple);

    }
}
