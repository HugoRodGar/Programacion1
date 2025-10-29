package Tema1.UT1_Ejercicios2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu dirección");

        String direccion = scanner.nextLine();

        System.out.println("Introduce un numero por favor");

        int numero = scanner.nextInt();

        System.out.println("Tu dirección es " + direccion + "\n" + "Y tu numero es " + numero);

    }
}
