package Tema4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UT4_Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento (En numero)");
        int dia = sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento (En numero)");
        int mes = sc.nextInt();
        sc.close();

        LocalDate cumple = LocalDate.of(LocalDate.now().getYear(), mes, dia);
        LocalDate hoy = LocalDate.now();

        Period p = Period.between(hoy, cumple);

        System.out.println(p.getMonths() + " meses y " + p.getDays() + " días");
    }

}
