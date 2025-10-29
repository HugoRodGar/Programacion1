package Ejercicios_de_clase.Ejercicios_Recursivos;

public class Ejercicio1 {

    public static void main(String[] args) {

        int factorial5 = factorial(5);
        System.out.println(factorial5);

    }

    static int factorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

}
