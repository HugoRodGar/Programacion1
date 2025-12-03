package Ejercicios_de_clase.RepasoFinalArraysAndFunciones.EjerciciosFuncionesRepsadoFinal;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int b = sc.nextInt();

        funcionSaludar();
        int suma = funcionSumar(a, b);

        System.out.println("La suma es: " + suma);

    }

    static int funcionSumar(int a, int b) {
        return a + b;
    }

    static void funcionSaludar() {
        System.out.println("Hola DAM1");
    }

}
