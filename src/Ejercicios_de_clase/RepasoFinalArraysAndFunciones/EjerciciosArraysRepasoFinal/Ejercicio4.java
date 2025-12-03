package Ejercicios_de_clase.RepasoFinalArraysAndFunciones.EjerciciosArraysRepasoFinal;

public class Ejercicio4 {

    public static void main(String[] args) {

        int[] notas = {4, 9, 7, 5, 10};
        int contador = 0;

        for (int nota : notas) {
            if (nota >= 5) {
                contador++;
            }
        }

        System.out.println(contador);

    }

}
