package Tema5.Ejercicios4;

import org.w3c.dom.ls.LSOutput;

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
