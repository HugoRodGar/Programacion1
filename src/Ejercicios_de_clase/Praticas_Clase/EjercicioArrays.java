package Ejercicios_de_clase.Praticas_Clase;

import java.util.Arrays;
import java.util.Random;

public class EjercicioArrays {

    public static void main(String[] args) {

        //Decralamos un array de 20
        int[] numero = new int[20];

        for (int i = 0; i < numero.length; i++) {
            Random r = new Random();
            numero[i] = r.nextInt(10);
        }

        Arrays.sort(numero);

        System.out.println(Arrays.toString(numero));

    }

}
