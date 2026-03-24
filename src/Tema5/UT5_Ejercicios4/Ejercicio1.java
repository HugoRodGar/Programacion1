package Tema5.UT5_Ejercicios4;

import java.util.HashSet;

public class Ejercicio1 {

    static void main() {
        HashSet<String> invitados = new HashSet<>();
        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");

        System.out.println(invitados.size());
        System.out.println(invitados);
    }






}
