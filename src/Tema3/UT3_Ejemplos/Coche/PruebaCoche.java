package Tema3.UT3_Ejemplos.Coche;

public class PruebaCoche {

    public static void main(String[] args) {

        Coche cocheLaura = new Coche("5554ABF", "azul", "ford");
        System.out.println(cocheLaura);
        cocheLaura.conducir(120);
        System.out.println(cocheLaura);
        cocheLaura.conducir(120);
        System.out.println(cocheLaura);

        Coche cocheMartin = cocheLaura;
        cocheMartin.conducir(100);
        System.out.println(cocheMartin);

        Coche cocheJoseLuis = new Coche("4546BDH", "verde", "Opel", 34000);
        System.out.println(cocheJoseLuis);

        cocheMartin = new Coche("7867BDH", "rojo", "peugeot", 45000);
        System.out.println("Martin :: " + cocheMartin);
        System.out.println("Laura :: " + cocheLaura);
        System.out.println(cocheMartin);
        cocheMartin.conducir(100);
        System.out.println("Martin :: " + cocheMartin);
        System.out.println("Laura :: " + cocheLaura);

        cocheJoseLuis = new Coche("4546BDH", "rojo", "ferrari", 12000);
        System.out.println(cocheJoseLuis);
    }

}
