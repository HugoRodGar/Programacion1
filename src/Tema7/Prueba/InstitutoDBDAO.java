package Tema7.Prueba;

import java.sql.*;

public class InstitutoDBDAO {

    Connection conexion;

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    Constants.URL,
                    Constants.USUARIO,
                    Constants.PASSWORD
            );
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar");
        }
    }

    public void registrarAlumno(String nombre, String email) {
        try {
            PreparedStatement pstmt = conexion.prepareStatement(
                    "INSERT INTO alumnos(nombre, email) VALUES (?, ?)"
            );
            pstmt.setString(1, nombre);
            pstmt.setString(2, email);
            int filas = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar alumno: " + e.getMessage());
        }
    }

    public void mostrarAlumnos() {
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM alumnos");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.err.println("Error al mostrar los alumnos, " + e.getMessage());
        }
    }
}