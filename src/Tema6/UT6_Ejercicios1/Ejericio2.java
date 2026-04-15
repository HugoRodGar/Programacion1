package Tema6.UT6_Ejercicios1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class Ejericio2 {

    public static void main(String[] args) {

        File carpeta1 = new File("Ficheros");
        File carpeta2 = new File(carpeta1, "Diario");
        File diario = new File(carpeta2, "diario.txt");

        if (!carpeta1.exists()) carpeta1.mkdir();
        if (!carpeta2.exists()) carpeta2.mkdir();

        try {
            if (!diario.exists()) diario.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path ruta = Paths.get("Ficheros/Diario/diario.txt");
        String nuevaLinea;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Escribe una linea");
                nuevaLinea = sc.nextLine();

                try {
                    if (!nuevaLinea.equals("FIN")) {
                        Files.write(ruta, Arrays.asList(nuevaLinea), StandardOpenOption.APPEND);
                        System.out.println("Linea añadida");
                    } else {
                        System.out.println("Has finalizado la escritura");
                    }
                } catch (IOException e) {
                    System.out.println("Error, " + e.getMessage());
                }
            } while (!nuevaLinea.equals("FIN"));
        }



        //Sacar texto del diario

    }
}
