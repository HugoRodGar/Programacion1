package Ejercicios_de_clase.Praticas_Clase;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        sc.close();

        mensaje(nombre, edad);

    }

    static void mensaje(String nombre, int edad) {
        System.out.println("Hola " + nombre + " tienes " + edad + " años");
    }

}
