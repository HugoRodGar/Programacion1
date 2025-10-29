package Tema1.UT1_Ejercicios3;

import java.util.Scanner;

public class Ejerccicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una letra, por favor");

        char letra = scanner.next().charAt(0);

        System.out.println(letra >= 'A' && letra <= 'Z' ? "Tu letra esta en mayusculas" : "tu letra es minuscula");

    }

}
