package Tema7.Peonadas.datos;

import java.time.LocalDate;

public class Peonada {

    private LocalDate fecha;
    private String nombreEmpleado;
    private String parque;
    private int horas;

    public Peonada(LocalDate fecha, String nombreEmpleado, String parque, int horas) {
        this.fecha = fecha;
        this.nombreEmpleado = nombreEmpleado;
        this.parque = parque;
        this.horas = horas;
    }

    //Getters y Setters

    @Override
    public String toString() {
        return "Peonada{" +
                "fecha=" + fecha +
                '}';
    }
}
