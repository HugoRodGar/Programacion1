package Ejercicios4_Arrays;

/*
Crea un programa que mezcle dos arrays ordenados de N elementos, consiguiendo otro array de N*2 elementos igualmente ordenados.
 */

public class Ejercicio9 {

    public static void main(String[] args) {

        int[] A = {4, 8, 15, 22, 25, 40};
        int[] B = {3, 6, 18, 21, 25, 47};

        int nA = A.length;
        int nB = B.length;

        int[] C = new int[nA + nB];

        int i = 0; // índice de A
        int j = 0; // índice de B
        int k = 0; // índice de C

        // 1. Mezclar mientras haya elementos en A y B
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

        // 2. Copiar lo que quede de A (si queda algo)
        while (i < nA) {
            C[k] = A[i];
            i++;
            k++;
        }

        // 3. Copiar lo que quede de B (si queda algo)
        while (j < nB) {
            C[k] = B[j];
            j++;
            k++;
        }

        // Mostrar el resultado
        System.out.print("Array C: ");
        for (int x = 0; x < C.length; x++) {
            System.out.print(C[x] + " ");
        }
    }
}
