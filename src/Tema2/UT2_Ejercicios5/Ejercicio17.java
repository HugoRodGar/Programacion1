package Tema2.UT2_Ejercicios5;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe la lista de asignaturas: ");
        String asignaturasTexto = sc.nextLine();
        System.out.print("Escribe la lista de notas: ");
        String notasTexto = sc.nextLine();

        String[] asignaturas = asignaturasTexto.split(":");
        String[] notas = notasTexto.split(":");
        System.out.print("Las asignaturas aprobadas son: ");

        for (int i = 0; i < asignaturas.length; i++) {
            char nota = notas[i].charAt(0);
            if (nota >= '5') {
                System.out.print(asignaturas[i] + " ");
            }
        }

        sc.close();

    }

}