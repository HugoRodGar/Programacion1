package UT2_Ejercios2;

import java.util.Scanner;

public class Ejercicio5 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



        sc.close();

    }
}
