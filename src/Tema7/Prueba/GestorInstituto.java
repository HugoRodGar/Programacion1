package Tema7.Prueba;

import java.io.File;
import java.util.Scanner;

public class GestorInstituto {

    public static void main(String[] args) {

        InstitutoDBDAO logica = new InstitutoDBDAO();
        logica.conectar();

        try (Scanner sc = new Scanner(new File("alumnos.txt"))) {

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();

                // Separar por ;
                String[] partes = linea.split(";");

                String nombre = partes[0];
                String email = partes[1];

                // Insertar en BD
                logica.registrarAlumno(nombre, email);
            }

            System.out.println("Datos insertados correctamente");

        } catch (Exception e) {
            System.out.println("Error leyendo fichero: " + e.getMessage());
        }

        logica.desconectar();
    }
}

//logica.conexion.setAutoCommit(false);
//
// inserts
//
//logica.conexion.commit();