package Tema2.UT2_Ejercicios3;

import java.util.Scanner;

public class Ejercicio8 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase");
        String frase = sc.nextLine();

        String cifrada = cifrar(frase);
        System.out.println("Frase cifrada: " + cifrada);

        String descifrada = descifrar(cifrada);
        System.out.println("Frase descifrada: " + descifrada);

        sc.close();

    }

    private static String descifrar(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + 2) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + 2) % 26);
            }

            resultado += c;
        }

        return resultado;
    }

    private static String cifrar(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' - 2 + 26) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' - 2 + 26) % 26);
            }

            resultado += c;
        }

        return resultado;
    }

}
