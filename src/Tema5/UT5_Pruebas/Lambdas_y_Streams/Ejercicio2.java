package Tema5.UT5_Pruebas.Lambdas_y_Streams;

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
