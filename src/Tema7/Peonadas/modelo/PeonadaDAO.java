package Tema7.Peonadas.modelo;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.*;
import java.time.LocalDate;

public class PeonadaDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/bd";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private Connection conexion;

    public void conectar () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Error, Clase no encontrada :: " + e.getMessage());
        } catch (SQLException e1) {
            System.err.println("Error, No se puedo conectar a la base de  datos :: " + e1.getMessage());
        }
    }

    public void desconectar () {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error, No se pudo insertar en la base de datos :: " + e.getMessage());
        }
    }

    public void insertar (LocalDate fecha, String nombre_empleado, String parque, int horas) {
        try {
            PreparedStatement pstmt = new PreparableStatement("INSERT INTO ");
            Statement stmt1 = new Statement(1, fecha);
            Statement stmt2 = new Statement(2, nombre_empleado);
            Statement stmt3 = new Statement(3, parque);
            Statement stmt4 = new Statement(4, horas);
        } catch (SQLException e) {
            System.err.println("Error, No se pudo insertar en la base de datos :: " + e.getMessage());
        }
    }

    public void leer () {
        try {

        } catch (SQLException e) {
            System.err.println("Error, No se pudo leer la base de datos :: " + e.getMessage());
        }
    }

    public void vaciar () {
        try {
            PreparedStatement pstmt = new PreparableStatement("DELETE * FROM Peonadas");
        } catch (SQLException e) {
            System.err.println("Error, No se vaciar la base de datos :: " + e.getMessage());
        }
    }
    
}
