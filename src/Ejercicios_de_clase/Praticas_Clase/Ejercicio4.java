package Ejercicios_de_clase.Praticas_Clase;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce la base del triangulo");
        double baseT = sc.nextDouble();
        System.out.println("Introduce la altura del triangulo");
        double alturaT = sc.nextDouble();

        sc.close();

        double area = calculoArea(baseT, alturaT);

        System.out.println(area);
    }

    static double calculoArea(double baseT, double alturaT) {
        return (baseT * alturaT);
    }


}
