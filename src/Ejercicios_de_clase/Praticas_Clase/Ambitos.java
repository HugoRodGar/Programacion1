package Ejercicios_de_clase.Praticas_Clase;

public class Ambitos {

    //Ambito global: ¡Peligroso! variable accesible (Acceso a la información muy facil)
    //static float pension = 1734.5f;

    public static void main(String[] args) {

        int edad = 74;

        if (edad > 65) {
            System.out.println();
            //Ambito local
            float pension = calculopension(edad);
            System.out.println(pension);
        }

        //Como esta fuera del ambito local donde se encuentra el float pension no funciona
        //System.out.println(pension);
    }

    static float calculopension(int edad) {
        edad++;
        return edad * 10;
    }
}
