/*Ejercicio 1.4
a) Fuga de encampsulamiento
b) Se debe a que el constructor y el getter reciben direcciones de la memoria heap por lo que el objeto puede mutar
c) Usar el metodo .clone()
 */

public class HistorialTransacciones {
    private String[] operaciones;

    public HistorialTransacciones(String[] operaciones) {
        this.operaciones = operaciones.clone();
    }

    public String[] getOperaciones() {
        return this.operaciones.clone();
    }

}
