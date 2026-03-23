package Tema2.UT2_Ejercicios5;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();
        String palabracombinda = "";
        int i = 0;

        while (i < palabra1.length() && i < palabra2.length()) {
            palabracombinda = palabracombinda + palabra1.charAt(i);
            palabracombinda = palabracombinda + palabra2.charAt(i);
            i++;
        }

        if (palabra1.length() > palabra2.length()) {
            while (i < palabra1.length()) {
                palabracombinda = palabracombinda + palabra1.charAt(i);
                i++;
            }
        } else if (palabra2.length() > palabra1.length()) {
            while (i < palabra2.length()) {
                palabracombinda = palabracombinda + palabra2.charAt(i);
                i++;
            }
        }

        System.out.println("Resultado: " + palabracombinda);
        sc.close();

    }

}
