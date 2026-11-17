/*Ejercicio 1.1
a)
 */


public class Banco {

    private double tasaInteresGlobal = 0.05;
    private static int totalCuentas = 0;

    public static void registrarCuenta() {
        totalCuentas++;
        double tasa = this.tasaInteresGlobal;
    }

}
