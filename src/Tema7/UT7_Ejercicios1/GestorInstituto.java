package Tema7.UT7_Ejercicios1;

import java.sql.*;

public class GestorInstituto {

    // TODO Paso 1: Crear el método conectar() y desconectar()
    // Mantenemos una única conexión en toda la aplicación

    // TODO Paso 2: Crear el método registrarAlumno(String nombre, String email)
    // Alta de un alumno en su tabla correspondiente

    // TODO Paso 3: Crear el método matricularAlumno(int idAlumno, int idAsignatura)
    // Aquí estamos insertando una relación N:N

    // TODO Paso 4: Crear el método mostrarAsignaturasDeAlumno(int idAlumno)
    // Select con join...

    // TODO Paso 5: Crear el método darDeBajaAlumno(int idAlumno)
    // Delete...

    public static void main(String[] args) {
        GestorInstituto gestor = new GestorInstituto();
        // Aquí iremos probando los métodos paso a paso

        InstitutoDBDAO logica = new InstitutoDBDAO();
        logica.conectar();
        System.out.println("Estamos conectados a la base de datos");


//        try {
//            conexion.setAutoCommit(false);
//            registrarAlumno("Rafa2", "rafa2@educa.jcyl.es");
//            conexion.commit();
//            registrarAlumno("Laura2", "laura@educa.jcyl.es");
//            conexion.commit();
//            registrarAlumno("Blanca2", "blanca@educa.jcyl.es");
//            conexion.commit();
//            System.out.println("");
//        } catch (SQLException e) {
//            System.err.println("Error al inserttar los alumnos :: " + e.getMessage());
//            try {
//                conexion.rollback();
//            } catch (SQLException ex) {
//                System.err.println("Error al hacer rollback :: " + ex.getMessage());
//            }
//        }

        try {
            matricularAlumno(7, 2);
        } catch (SQLException e) {
            System.err.println();
        }
        logica.mostrarAsignaturasDeAlumno(7);
        logica.mostrarAsignaturasDeAlumno(7);

        logica.mostrarAlumnos();
        logica.mostrarAsignaturas();

        logica.desconectar();

    }

}
