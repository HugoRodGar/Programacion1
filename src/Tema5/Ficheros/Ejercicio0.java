package Tema5.Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();

        File archivo = new File(nombre);
        try {

            if (!archivo.exists()) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
                    System.out.println("Introduce el texto");
                    String texto = sc.nextLine();
                    sc.close();
                    bw.write(texto);
                }
            } else {
                System.out.println(archivo.getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("Error al crear el archivo" + e.getMessage());
        }

    }

}
