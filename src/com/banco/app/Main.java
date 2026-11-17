/* Ejercicio 1.3
a) Falla de diseño
b) Debido a la falta de la palabra reservada public en el constructor no se puede instanciar y al no ser publico el atributo codigoIdentificacion no se puede acceder a el desde fuera del paquete
c) Agregar la palabra public a la declaración del constructor y de la variable
 */

package com.banco.app;
import com.banco.modelo.Cliente;
public class Main {
    public static void main(String[] args){
        Cliente c = new Cliente("CLI-101","Ana Gómez");
        System.out.println(c.codigoIdentificacion);
    }
}
