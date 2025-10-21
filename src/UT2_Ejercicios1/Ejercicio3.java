package UT2_Ejercicios1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saver a que numero de la semana corresponde");
        int numero = sc.nextInt();
        String dia = null;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println("El numero " + numero + " es un numero invalido, el numero introducido deve estar entre el 1 y el 7");
        }

        System.out.println("El numero " + numero + " corresponde al " + dia);
        sc.close();
    }
}
