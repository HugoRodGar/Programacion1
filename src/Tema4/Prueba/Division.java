package Tema4.Prueba;

public class Division {

    public static void main(String[] args) {
        try {
            double resultado = dividir(3,0);
            System.out.println("El resultado es: " + resultado);
        } catch (IllegalArgumentException e){

        }
    }

    public static double dividir(double arriba, double abajo) {
        if (abajo == 0)
            throw new IllegalArgumentException("No se puede dividir por cero");
        return arriba / abajo;
    }

}
