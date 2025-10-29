package Ejercicios_de_clase.Ejercicios_de_Funciones;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base");
        int base = sc.nextInt();
        System.out.println("Introduce la altura");
        int altura = sc.nextInt();

        double area = calcularAreaTriangulo(base, altura);
        System.out.println("eL area es: " + area);

        sc.close();

    }

    static double calcularAreaTriangulo(int base, int altura) {
        return base * altura / 2d;
    }
}
