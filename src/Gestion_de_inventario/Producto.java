package Gestion_de_inventario;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (stock > cantidad) {
            stock -= cantidad;
            System.out.println("La compra se ha realizado con exito, Stock restante: " + stock);
        } else {
            System.out.println("Stock insuficiente para realizar la compra");
        }
    }

    public void reponer(int cantidad) {
        stock += cantidad;
        System.out.println("El stock se ha aumentado en " + cantidad + ",  Stock actual: " + stock);
    }

    public void mostarInfo() {
        System.out.printf("Nombre: " + nombre + "| Precio: " + precio + "| Stock: " + stock);
    }

}