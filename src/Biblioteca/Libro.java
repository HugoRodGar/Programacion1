package Biblioteca;

public class Libro {

    private String titulo;
    private boolean prestado;
    private Autor escritor;

    public Libro(String titulo, Autor escritor) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Has alquilado: " + titulo);
        } else {
            System.out.println("Error: " + titulo + " no esta disponible");
        }
    }

    public void devolver() {
        prestado = false;
        System.out.println("Has devuelto: " + titulo + " correctamente");
    }

    public void informacion() {
        System.out.println("Titulo: " + titulo + " Del Escritor: " + escritor.mostrarAutor());
    }

}
