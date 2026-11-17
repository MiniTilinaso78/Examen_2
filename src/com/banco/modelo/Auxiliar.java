package com.banco.modelo;
import com.banco.modelo.CuentaBancaria;
public class Auxiliar {
    private Auxiliar(){}

    public static void modificar(CuentaBancaria cuenta1){
        cuenta1.saldo=1200;
        cuenta1.titular="No-mini";
    }

}
