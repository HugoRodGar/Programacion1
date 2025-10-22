package Praticas_Clase;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("Introduce tres numeros");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();

        int numMayor = calculoNumMasGrande(num1, num2, num3);
        System.out.println("El numero mas grade entre " + num1 + ", " + num2 + " y " + num3 + " es: " + numMayor);

        System.out.println();
        System.out.println("Introduce otos tres numeros");
        System.out.println("Introduce el primer numero");
        int num4 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num5 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num6 = sc.nextInt();

        int numMayor2 = calculoNumMasGrande(num4, num5, num6);
        System.out.println("El numero mas grade entre " + num4 + ", " + num5 + " y " + num6 + " es: " + numMayor2);

        sc.close();
    }

    static int calculoNumMasGrande(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
