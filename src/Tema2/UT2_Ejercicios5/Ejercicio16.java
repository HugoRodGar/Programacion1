package Tema2.UT2_Ejercicios5;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine();

        palabra = palabra.toLowerCase();

        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        int i = 0;
        boolean encontrado = false;

        while (i < palabra.length() && !encontrado) {
            char letra = palabra.charAt(i);
            if (letra == 'a') {
                contadorA++;
                if (contadorA > 2) {
                    System.out.println("Tiene mas de dos vocales iguales");
                    encontrado = true;
                }
            }
            if (letra == 'e') {
                contadorE++;
                if (contadorE > 2) {
                    System.out.println("Tiene mas de dos vocales iguales");
                    encontrado = true;
                }
            }
            if (letra == 'i') {
                contadorI++;
                if (contadorI > 2) {
                    System.out.println("Tiene mas de dos vocales iguales");
                    encontrado = true;
                }
            }
            if (letra == 'o') {
                contadorO++;
                if (contadorO > 2) {
                    System.out.println("Tiene mas de dos vocales iguales");
                    encontrado = true;
                }
            }
            if (letra == 'u') {
                contadorU++;
                if (contadorU > 2) {
                    System.out.println("Tiene mas de dos vocales iguales");
                    encontrado = true;
                }
            }

            i++;
        }

        if (!encontrado) {
            System.out.println("No tiene mas de dos vocales iguales");
        }

        sc.close();

    }

}
