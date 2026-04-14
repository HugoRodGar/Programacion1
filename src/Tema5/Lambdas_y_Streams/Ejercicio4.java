package Tema5.Lambdas_y_Streams;

import java.util.List;
import java.util.OptionalDouble;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(10,20,30,40,50);

        int suma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();

        OptionalDouble media = numeros.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media.orElse(0));
    }

}
