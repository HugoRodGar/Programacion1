import java.util.Scanner;

public class PruebasConElse {

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();

        //if anidados
        if (edad >= 18) {
            if (edad >= 65) {
                System.out.println("Eres mayor de edad, y jubilado");
            } else {
                System.out.println("Eres mayor de edad");
            }
        } else {
            System.out.println("Eres menor de edad");
        }

        //if encadenados
        if (edad >= 65) {
            System.out.println("Estas jubilado");
        } else if (edad >= 18) {
            System.out.println("Eres trabajador");
        } else {
            System.out.println("Eres menor de edad");
        }

        //if encadenados, en este caso no funciona el orden de los datos importan
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 65) {
            System.out.println("Estas jubilado");
        } else {
            System.out.println("Eres menor de edad");
        }
        sc.close();

    }

}
