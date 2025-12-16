package Tema3.UT3_Ejemplos;

public class Libro {

    String titulo;
    String autor;
    String anyo;
    String editorial;
    int ISBN;

    public Libro(String titulo, String autor, String anyo, String editorial, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyo = anyo;
        this.editorial = editorial;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anyo='" + anyo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}
