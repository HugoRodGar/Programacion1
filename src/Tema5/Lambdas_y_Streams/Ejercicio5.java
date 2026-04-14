package Tema5.Lambdas_y_Streams;

import java.util.Comparator;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

        List<Double> precios = List.of(19.99, 5.50, 45.0, 120.95, 89.0, 2.30);

        List<Double> topPrecios = precios.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(topPrecios);

    }

}
