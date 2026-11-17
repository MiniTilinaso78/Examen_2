/* Ejercicio 1.2
a) Falla de compilacion de javac
b) La delegacion debe darse antes de realizar cualquier accion dentro del constructor
c) Mover a la primera linea del codigo del constructor

 */
public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, String autor, double precio) {
        this(titulo, autor);
        if (precio < 0) {
            precio = 0.0;
        }

        this.precio = precio;
    }

}
