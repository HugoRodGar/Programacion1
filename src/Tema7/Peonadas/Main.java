package Tema7.Peonadas;

import javax.imageio.IIOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    static void main() {

        Main Logica = new Main();

        LocalDate fecha = LocalDate.parse("15/01/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Logica.conectar();
        Logica.vaciar();

        try {
            conexion.setAutoCommit(false);
            Logica.insertar();
            conexion.commit();
        } catch (IIOException e) {
            System.out.println("Error :: " + e.getMessage());
        }

        Logica.desconectar();

    }

}
