package Ejercicios1;

public class Ejercicio9 {

    public static void main(String[] args) {

        int A, B, C, D;

        A = 10;
        B = 20;
        C = 30;
        D = 40;

        B = C;
        System.out.println("El valor de B ahora es: " + B);

        C = A;
        System.out.println("El valor de C ahora es: " + C);

        A = D;
        System.out.println("El valor de A ahora es: " + A);

        D = B;
        System.out.println("El valor de D ahora es: " + D);
    }
}
