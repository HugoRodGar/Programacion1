package Tema7.Peonadas.modelo;

import Peonadas.datos.Peonada;

import javax.imageio.IIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV {

    static void main() {
        Path peonadasCSV = Paths.get("peonadas.csv");

        List<Peonada> leidas = new ArrayList<>();

        try {
            Files.readAllLines(peonadasCSV);
            leidas.add();
        } catch (IIOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

}

