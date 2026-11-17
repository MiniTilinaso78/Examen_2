package com.banco.util;

public class CalculadoraInteres {
    private static int operacionesRealizadas = 0;
    private CalculadoraInteres(){}
    public static double calcularProyeccion(double saldoActual, double tasaAnual,int anios){
        return (saldoActual)*(1+(CalculadoraInteres.potencia(tasaAnual,anios)));
    }
    private static double potencia(double base, int exponente){
        int contador = 0;
        double numeroFinal = 1;
        while (contador<exponente){
            numeroFinal=numeroFinal*base;
            contador++;
        }
        return numeroFinal;
    }
    public static int getOperacionesRealizadas(){
        return operacionesRealizadas;
    }
}
