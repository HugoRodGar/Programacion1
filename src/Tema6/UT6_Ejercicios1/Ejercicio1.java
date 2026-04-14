package Tema6.UT6_Ejercicios1;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {

        File carpeta = new File("MiDirectorioDAM");
        File archivo1 = new File(carpeta,"datos.txt");
        File archivo2 = new File(carpeta,"config.ini");

        if (!carpeta.exists()) carpeta.mkdir();

        CrearFichero(archivo1);
        CrearFichero(archivo2);

        System.out.println(carpeta.listFiles());
        System.out.println("Tamaño: " + archivo1.length());
        System.out.println("Tamaño: " + archivo2.length());

    }

    public static void CrearFichero (File a) {
        try {
            if (!a.exists()) a.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
