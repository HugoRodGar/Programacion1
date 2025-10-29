package Tema1.UT1_Ejercicios1;

public class Ejercicio9B {

    public static void main(String[] args) {

        int A, B, C, D;
        int aux;

        A = 10;
        B = 20;
        C = 30;
        D = 40;

        aux = B;
        B = C;
        C = aux;
        System.out.println("El valor de B ahora es: " + B);

        aux = C;
        C = A;
        A = aux;
        System.out.println("El valor de C ahora es: " + C);

        aux = A;
        A = D;
        D = aux;
        System.out.println("El valor de A ahora es: " + A);

        aux = D;
        D = B;
        B = aux;
        System.out.println("El valor de D ahora es: " + D);

    }
}
