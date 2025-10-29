package Ejercicios_de_clase.EjerciciosIniciales;

public class OperadorTemario {

    public static void main(String[] args) {

        boolean tengoEfectivo = false;
        boolean tengoTarjeta = true;

        String puedoPagar = tengoEfectivo || tengoTarjeta ? "sí" : "no";
        System.out.println(puedoPagar);
    }
}
