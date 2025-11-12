package Ejercicios_de_clase.Arrays;

import java.util.Arrays;


public class PruebasArrays {

    public static void main(String[] args) {

        int[] notasHugo = new int[5];
        notasHugo[0] = 8;
        notasHugo[1] = 10;
        notasHugo[2] = 3;
        notasHugo[3] = 7;
        notasHugo[4] = 9;
        System.out.println(Arrays.toString(notasHugo));
        int[] notasHugoAuxiliares = notasHugo;
        notasHugo = new int[6];
        //Copiamos los valores
        for (int i = 0; i < notasHugoAuxiliares.length; i++) {
            notasHugo[i] = notasHugoAuxiliares[i];
        }
        notasHugo[5] = 5;
        System.out.println("notasHugo :: " + Arrays.toString(notasHugo));
        System.out.println("notasHugoAuxiliares :: " + Arrays.toString(notasHugoAuxiliares));

        // ya tenemos en notasHugo los 4 valores
    }

}
