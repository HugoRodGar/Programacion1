package Ejercicios4_Arrays;

/*
Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro mágico aquel en el que las filas,
las columnas y las diagonales suman igual.
 */

public class Ejercicio8 {
    public static void main(String[] args) {

        // Matriz del ejemplo (puedes cambiarla)
        int[][] m = {
                { 1, 5, 8, 24, 17 },
                {16,14, 7,  5, 23 },
                {20,21,13,  6,  4 },
                { 3,19,12,  9, 10 },
                { 9, 2,25, 18, 11 }
        };

        int n = 5; // tamaño del cuadro

        // 1. Sumar la primera fila → valor de referencia
        int sumaObjetivo = 0;
        for (int j = 0; j < n; j++) {
            sumaObjetivo += m[0][j];
        }

        boolean esMagico = true;

        // 2. Comprobar filas
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

        // 3. Comprobar columnas
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

        // 4. Comprobar diagonal principal
        int sumaDiag1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag1 += m[i][i];
        }
        if (sumaDiag1 != sumaObjetivo) {
            esMagico = false;
        }

        // 5. Comprobar diagonal secundaria
        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag2 += m[i][n - 1 - i];
        }
        if (sumaDiag2 != sumaObjetivo) {
            esMagico = false;
        }

        // 6. Resultado final
        if (esMagico) {
            System.out.println("El array ES un cuadro mágico.");
        } else {
            System.out.println("El array NO es un cuadro mágico.");
        }
    }
}
