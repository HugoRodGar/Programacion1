package Tema4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class UT4_Ejercicio1 {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        System.out.println("Hoy es: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(fecha));
    }
}

