package Tema2.UT2_Ejercicios2;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero e intenta acertar");
        int numMin = 0;
        int numMax = 1000;

        int suNumero = (int) (Math.random() * (numMax - numMin + 1) + numMin);
        for (int i = numMin; i <= numMax; i++) {
            int tuNumero = sc.nextInt();
            if (tuNumero == suNumero) {
                System.out.println("Has Acertado!!!!");
            } else if (tuNumero < suNumero) {
                System.out.println("Intentelo con un numero mas grande");
            } else {
                System.out.println("Intentelo con un numero mas pequeño");
            }
        }
    }
}
