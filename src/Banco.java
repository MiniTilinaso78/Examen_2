/*Ejercicio 1.1
a) Error de compilacion ya que para un metodo estatico las variables que no son estaticas no las "Ve"
b) Puesto a que un metodo estatico no se interesa por variables de instancia no puede ser llamada en un contexto estatico
c) Eliminar la palabra static de la declaracion del metodo
 */


public class Banco {

    private double tasaInteresGlobal = 0.05;
    private static int totalCuentas = 0;

    public void registrarCuenta() {
        totalCuentas++;
        double tasa = this.tasaInteresGlobal;
    }

}
