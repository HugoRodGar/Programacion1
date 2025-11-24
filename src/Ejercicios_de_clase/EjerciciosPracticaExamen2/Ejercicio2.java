package Ejercicios_de_clase.EjerciciosPracticaExamen2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de niveles: ");
        int niveles = sc.nextInt();
        int a, b, c;
        a = 1;
        b = 1;
        String numeros = numerosFibonaci(niveles, a, b, c);

        sc.close();
    }

    static String numerosFibonaci(int niveles, int a, int b, int c) {
        for (int i = 1; i <= niveles; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1) {
                    return a + " ";
                } else if (j == 2) {
                    return b + " ";
                } else {
                    c = a + b;
                    return c + " ";
                    a = b;
                    b = c;
                }

            }
            System.out.println();
        }
        return "";
    }
}



