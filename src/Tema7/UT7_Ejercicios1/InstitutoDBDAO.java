package Tema7.UT7_Ejercicios1;

import java.sql.*;

public class InstitutoDBDAO {

    Connection conexion;

    public void mostrarAlumnos() {
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs  stmt.executeQuery("SELECT * FROM alumnos");
        } catch (SQLException e) {
            System.out.println("Error :: " + e.getMessage());
        }

    }

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(Constants.URL, Constants.USUARIO, Constants.PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("No se ha encontrado al driver de MySQL :: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de SQL al conectar :: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error de SQL al desconectar :: " + e.getMessage());
        }
    }


    public void registrarAlumno(String nombre, String email) throws SQLException {
        try {
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO Alumnos(nombre, email) VALUES (?, ?)");
            statement.setString(1, nombre);
            statement.setString(2, email);
            int filas = statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar un alumno :: " + e.getMessage());
            throw e;
        }
    }

    public void matriculaAlumno(int idAlumno, int idAsignatura) {
        try {
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO matriculas(idalumno, idasignatura) VALUES (?, ?)");
            statement.setInt(1, idAlumno);
            statement.setInt(2, idAsignatura);
            int filas = statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar un alumno :: " + e.getMessage());
            throw e;
        }
    }

    public void mostrarAsignaturaDeAlumno(int idAlumno) {
        try {
            PreparedStatement stmt = conexion.prepareStatement(""
                    select alumnos.nombre as alumno
                    statement.setInt(1, idAlumno);
            statement.setInt(2, idAsignatura);
            int filas = statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar un alumno :: " + e.getMessage());
            throw e;
        }
    }

}
