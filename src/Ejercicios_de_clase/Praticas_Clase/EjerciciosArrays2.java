package Ejercicios_de_clase.Praticas_Clase;

import java.util.Arrays;
import java.util.Random;

public class EjerciciosArrays2 {

    public static void main(String[] args) {
        // Declaramos un array de 4 elementos
        int[] numero = new int[4];

        // Llenamos el array con números aleatorios entre 0 y 4
        Random r = new Random();
        for (int i = 0; i < numero.length; i++) {
            numero[i] = r.nextInt(6);
        }

        // Mostramos el array generado
        System.out.println(Arrays.toString(numero));

        // Verificamos si está ordenado
        if (estaOrdenadoSecuencia(numero)) {
            System.out.println("El array está en secuencia ascendente (1,2,3,4...).");
        } else if (estaOrdenadoSecuenciaDesc(numero)) {
            System.out.println("El array está en secuencia descendente (4,3,2,1...).");
        } else {
            System.out.println("El array no está en secuencia.");
        }
    }

    // Función para verificar si el array está ordenado ascendentemente
    public static boolean estaOrdenadoSecuencia(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return false;
            }
        }
        return true;
    }

    // Función para verificar si el array está ordenado descendentemente
    public static boolean estaOrdenadoSecuenciaDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] - 1) {
                return false;
            }
        }
        return true;
    }

}

