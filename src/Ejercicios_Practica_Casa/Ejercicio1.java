package Ejercicios_Practica_Casa;

import java.util.Scanner;

public class Ejercicio1 {

    static void main() {

        int menor, mayor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Ambos numeros son iguales: " + num1);
        } else {
            if (num1 < num2) {
                menor = num1;
                mayor = num2;
            } else {
                menor = num2;
                mayor = num1;
            }

            System.out.println("los numeros entre " + menor + " y " + mayor + " son:");
            for (int i = menor; i <= mayor; i++) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
