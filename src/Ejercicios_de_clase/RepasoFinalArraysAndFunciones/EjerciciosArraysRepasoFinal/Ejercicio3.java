package Ejercicios_de_clase.RepasoFinalArraysAndFunciones.EjerciciosArraysRepasoFinal;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[] notas = {4, 9, 7, 5, 10};
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            suma += notas[i];
        }

        double media = suma / (double) notas.length;
        System.out.println("Media: " + media);

    }

}
