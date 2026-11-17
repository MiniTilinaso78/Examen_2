package com.banco.app;

import com.banco.modelo.CuentaBancaria;
import com.banco.util.CalculadoraInteres;
import com.banco.modelo.Auxiliar;

public class MainP3 {

    public static void main(String[] args){
        com.banco.modelo.CuentaBancaria cuenta1 = new CuentaBancaria("NM-098","Tilinaso78",1330.5);
        com.banco.modelo.CuentaBancaria cuenta2 = new CuentaBancaria("NM-078","Tilinaso77",17236.7);
        cuenta1.retirar(234);
        cuenta1.depositar(77);
        cuenta2.retirar((233));
        cuenta2.depositar(199);

        com.banco.modelo.Auxiliar.modificar(cuenta1);
        System.out.println(com.banco.util.CalculadoraInteres.getOperacionesRealizadas());
    }
}
