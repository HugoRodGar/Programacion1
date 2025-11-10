package Ejercicios_de_clase.Praticas_Clase;

import java.util.Scanner;

public class PracticaExamen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int num = sc.nextInt();
        System.out.println("Introduce cuantos numeros se van a sumar");
        int sum = sc.nextInt();
        int suma = 0;

        for (int i = num; i <= num + sum; i++) {
            suma += i;
            System.out.println("Sumamos " + i);
        }
        System.out.println("La suma de los siguentes " + sum + " numeros de " + num + " es: " + suma);

        for (int i = 1; i <= suma; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = suma - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
