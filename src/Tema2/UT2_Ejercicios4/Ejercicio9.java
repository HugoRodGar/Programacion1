package Tema2.UT2_Ejercicios4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio9 {

    public static void main(String[] args) {

        Random r = new Random();

        int[] A = new int[5];
        int[] B = new int[5];

        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(10);
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = r.nextInt(10);
        }

        Arrays.sort(A);
        Arrays.sort(B);

        System.out.println("Array A: " + Arrays.toString(A));
        System.out.println("Array B: " + Arrays.toString(B));

        int nA = A.length;
        int nB = B.length;

        int[] C = new int[nA + nB];

        int i = 0; // índice de A
        int j = 0; // índice de B
        int k = 0; // índice de C

        while (i < nA && j < nB) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < nA) {
            C[k] = A[i];
            i++;
            k++;
        }

        while (j < nB) {
            C[k] = B[j];
            j++;
            k++;
        }

        System.out.print("Array C: " + Arrays.toString(C));
    }
}
