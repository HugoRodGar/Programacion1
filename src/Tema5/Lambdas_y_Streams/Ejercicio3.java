package Tema5.Lambdas_y_Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ejercicio3 {

    public static void main(String[] args) {

        List<String> palabras = List.of("Java","Programación","Stream","Código","DAM");

        Optional<String> palabrasMasLarga = palabras.stream()
                .max(Comparator.comparing(String::length));
        System.out.println(palabrasMasLarga);
    }

}