package Ejercicios_de_clase.RepasoFinalArraysAndFunciones.EjerciciosArraysRepasoFinal;

public class Ejercicio8 {

    public static void main(String[] args) {

        int suma = 0;
        int[][] notas = new int[2][3];
        notas[0][0] = 5;
        notas[0][1] = 8;
        notas[0][2] = 7;
        notas[1][0] = 6;
        notas[1][1] = 9;
        notas[1][2] = 4;

        int k = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("notas[" + i + "][" + j + "] = " + notas[i][j]);
            }
        }

    }

}
