package UT2_Ejercicios1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular si es par o inpar");
        double numero = sc.nextDouble();

        if (numero % 2 != 0) {
            System.out.println("El numero es inpar");
        } else {
            System.out.println("El numero es par");
        }

        sc.close();

    }
}
