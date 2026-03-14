package Tema2.UT2_Ejercicios5;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra completamente en minusculas: ");
        String palabra = sc.nextLine();
        char[] palabraOculta = new char[palabra.length()];

        int intentos = 8;
        int fallos = 0;
        boolean ganado = false;

        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }

        System.out.println("Ahorcado:" + "\n");

        while (fallos < intentos && !ganado) {

            System.out.print("Palabra: ");
            for (int i = 0; i < palabraOculta.length; i++) {
                System.out.print(palabraOculta[i] + " ");
            }

            System.out.println();
            System.out.println("Intentos restantes: " + (intentos - fallos));
            System.out.print("Introduce una letra: ");

            String entrada = sc.nextLine();
            char letra = entrada.charAt(0);

            boolean acierto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraOculta[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                fallos++;
                System.out.println("Has fallado!!!");
            } else {
                System.out.println("Has acertado!!!");
            }

            ganado = true;
            for (int i = 0; i < palabraOculta.length; i++) {
                if (palabraOculta[i] == '_') {
                    ganado = false;
                }
            }

            System.out.println();
        }

        if (ganado) {
            System.out.println("Enhorabuena, has ganado!");
        } else {
            System.out.println("Has perdido. La palabra era: " + palabra);
        }

        sc.close();
    }
}