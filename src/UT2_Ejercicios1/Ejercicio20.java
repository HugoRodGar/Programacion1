package UT2_Ejercicios1;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();

        int suma = 0;
        for (int i = num1; i < num1 + 100; i++) {
            suma += i;
            System.out.println("Sumamos " + i);
        }

        System.out.println("El total es " + suma);

        sc.close();
    }
}
