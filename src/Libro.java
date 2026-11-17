/* Ejercicio 1.2
a)

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
        if (precio < 0) {
            precio = 0.0;
        }
        this(titulo, autor);
        this.precio = precio;
    }

}
