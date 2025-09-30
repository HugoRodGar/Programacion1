package Ejercicios3;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu dinero");

        int cantidad = scanner.nextInt();
        scanner.close();

        int b500 = cantidad / 500;
        cantidad = cantidad % 500;

        int b200 = cantidad / 200;
        cantidad = cantidad % 200;

        int b100 = cantidad / 100;
        cantidad = cantidad % 100;

        int b50 = cantidad / 50;
        cantidad = cantidad % 50;

        int b20 = cantidad / 20;
        cantidad = cantidad % 20;

        int b10 = cantidad / 10;
        cantidad = cantidad % 10;

        int b5 = cantidad / 5;
        cantidad = cantidad % 5;

        System.out.println(b500 + " de 500, " + b200 + " de 200, " + b100 + " de 100, " + b50 + " de 50, " + b20 + " de 20, " + b10 + " de 10, " + b5 + " de 5 y de resto " + cantidad);
    }
}
