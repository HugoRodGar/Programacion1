package Tema5.Persona;

import java.util.Scanner;

public class PersonaTest {
    static void main() {

        Scanner sc = new Scanner(System.in);

        //1
        System.out.println("Introduce el nombre de la persona 1:");
        String nombre = sc.next();
        System.out.println("Introduce la edad de la persona 1:");
        int edad = sc.nextInt();
        System.out.println("Introduce el sexo (H/M) de la persona 1:");
        char sexo = sc.next().charAt(0);
        System.out.println("Introduce el peso en kg de la persona 1:");
        double peso = sc.nextDouble();
        System.out.println("Introduce la altura en metros de la persona 1:");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        //2
        System.out.println("Introduce el nombre de la persona 2:");
        nombre = sc.next();
        System.out.println("Introduce la edad de la persona 2:");
        edad = sc.nextInt();
        System.out.println("Introduce el sexo (H/M) de la persona 2:");
        sexo = sc.next().charAt(0);

        Persona p2 = new Persona(nombre, edad, sexo);

        //3
        System.out.println("Introduce el nombre de la persona 3:");
        nombre = sc.next();

        Persona p3 = new Persona(nombre);

        int[] imc = new int[3];
        imc[0] = p1.calcularIMC();
        imc[1] = p2.calcularIMC();
        imc[2] = p3.calcularIMC();

        for (int i = 1; i <= imc.length; i++) {
            if (imc[i - 1] == -1) {
                System.out.println("La persona numero: " + i + " está en infrapeso");
            } else if (imc[i - 1] == 0) {
                System.out.println("La persona numero: " + i + " está en peso normal");
            } else {
                System.out.println("La persona numero: " + i + " está en sobrepeso");
            }
        }

        System.out.println(p1.getNombre() + " es mayor de edad: " + p1.esMayorDeEdad());
        System.out.println(p2.getNombre() + " es mayor de edad: " + p2.esMayorDeEdad());
        System.out.println(p3.getNombre() + " es mayor de edad: " + p3.esMayorDeEdad());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
