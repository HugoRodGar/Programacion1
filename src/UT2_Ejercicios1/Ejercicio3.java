package UT2_Ejercicios1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saver a que numero de la semana corresponde");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El numero " + numero + " corresponde al Lunes");
                break;
            case 2:
                System.out.println("El numero " + numero + " corresponde al Martes");
                break;
            case 3:
                System.out.println("El numero " + numero + " corresponde al Miércoles");
                break;
            case 4:
                System.out.println("El numero " + numero + " corresponde al Jueves");
                break;
            case 5:
                System.out.println("El numero " + numero + " corresponde al Viernes");
                break;
            case 6:
                System.out.println("El numero " + numero + " corresponde al Sábado");
                break;
            case 7:
                System.out.println("El numero " + numero + " corresponde al Domingo");
                break;
            default:
                System.out.println("El numero " + numero + " es un numero invalido, el numero introducido deve estar entre el 1 y el 7");
        }

    }
}
