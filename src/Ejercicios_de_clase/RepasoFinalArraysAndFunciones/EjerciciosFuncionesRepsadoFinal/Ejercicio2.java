package Ejercicios_de_clase.RepasoFinalArraysAndFunciones.EjerciciosFuncionesRepsadoFinal;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base:");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura:");
        double altura = sc.nextDouble();

        sc.close();

        double area = areaRectangulo(base, altura);
        System.out.println("El area del rectangulo es: " + area);

    }

    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

}
