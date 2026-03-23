package Tema5.Ejercicios4;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {

    static void main() {

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(45);
        numeros.add(12);
        numeros.add(89);
        numeros.add(3);
        numeros.add(22);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }

}
