package Tema2.UT2_Ejercicios1;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sumaAux = 0;
        double numero;
        double cantidadNumeros;
        double media;

        System.out.println("Introduce con cuantos numeros vas a hacer la media");
        cantidadNumeros = sc.nextDouble();

        System.out.println("Introduce los numeros");
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("Numero " + i + ": ");
            numero = sc.nextDouble();
            sumaAux = sumaAux + numero;
        }

        media = sumaAux / cantidadNumeros;
        System.out.println("La media de los numeros es: " + media);

        sc.close();

    }

}
