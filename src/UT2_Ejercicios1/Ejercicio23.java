package UT2_Ejercicios1;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        int numero;
        int i = 0;
        double suma = 0;

        Scanner sc = new Scanner(System.in);

        while (i < 5) {
            System.out.println("Introduce un numero, cuando introduzcas un total de 5 ceros se parara y se sumaran todos los numero introducidos anteriormente");
            numero = sc.nextInt();

            if (numero == 0) {
                i++;
            } else {
                suma += numero;
            }
        }

        System.out.println("La suma da: " + suma);
        sc.close();
    }

}
