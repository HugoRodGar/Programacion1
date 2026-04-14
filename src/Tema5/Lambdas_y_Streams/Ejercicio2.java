package Tema5.Lambdas_y_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> alumnos = List.of("ana","luis","guzmán","marta");

        List<String> alumnosMayusculas = alumnos.stream()
                .map(cadena -> cadena.toUpperCase())
                .toList();
        System.out.println(alumnosMayusculas);
    }

}
