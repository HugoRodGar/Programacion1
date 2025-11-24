package Tema2.UT2_Ejercicios4;

public class Ejercicio8 {
    public static void main(String[] args) {

        int[][] m = {
                {1, 5, 8, 24, 17},
                {16, 14, 7, 5, 23},
                {20, 21, 13, 6, 4},
                {3, 19, 12, 9, 10},
                {9, 2, 25, 18, 11}
        };

        int n = 5;

        int sumaObjetivo = 0;
        for (int j = 0; j < n; j++) {
            sumaObjetivo += m[0][j];
        }

        boolean esMagico = true;

        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += m[i][j];
            }
            if (sumaFila != sumaObjetivo) {
                esMagico = false;
                break;
            }
        }

        for (int j = 0; j < n && esMagico; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) {
                sumaCol += m[i][j];
            }
            if (sumaCol != sumaObjetivo) {
                esMagico = false;
                break;
            }
        }

        int sumaDiag1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag1 += m[i][i];
        }
        if (sumaDiag1 != sumaObjetivo) {
            esMagico = false;
        }

        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag2 += m[i][n - 1 - i];
        }
        if (sumaDiag2 != sumaObjetivo) {
            esMagico = false;
        }

        if (esMagico) {
            System.out.println("El array ES un cuadro mágico.");
        } else {
            System.out.println("El array NO es un cuadro mágico.");
        }
    }
}
