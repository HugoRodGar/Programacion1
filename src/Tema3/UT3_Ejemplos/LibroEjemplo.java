package Tema3.UT3_Ejemplos;

public class LibroEjemplo {

    public static void main(String[] args) {

        Libro libro1 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                "1967",
                "Editorial Sudamericana",
                97884397
        );

        Libro libro2 = new Libro(
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                "1605",
                "Francisco de Robles",
                9788420
        );

        Libro libro3 = new Libro(
                "La sombra del viento",
                "Carlos Ruiz Zafón",
                "2001",
                "Editorial Planeta",
                97884080
        );

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

    }

}
