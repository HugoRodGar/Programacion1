package Tema2.UT2_Ejercicios3;

import java.util.Scanner;

public class Ejercicio10 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce una palabra o una frase");
        String frase = sc.nextLine();
        frase = frase.replace(" ", "");
        sc.close();

        String resultado = ordenar(frase);

        System.out.println("Tu frase o palabra ordenada: " + resultado);
    }

    private static String ordenar(String frase) {
        String resultado = "";

        while (frase.length() > 0) {
            char menor = obtenerLetraMenor(frase);
            resultado += menor;
            frase = eliminarLetra(frase, menor);
        }

        return resultado;
    }

    private static String eliminarLetra(String frase, char letra) {
        int posicion = frase.indexOf(letra);
        if (posicion == -1) {
            return frase;
        }

        return frase.substring(0, posicion) + frase.substring(posicion + 1);
    }

    private static char obtenerLetraMenor(String frase) {
        char menor = frase.charAt(0);

        for (int i = 1; i < frase.length(); i++) {
            char actual = frase.charAt(i);
            if (actual < menor) {
                menor = actual;
            }
        }

        return menor;
    }

}
