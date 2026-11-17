package com.banco.modelo;

public class CuentaBancaria {
    private final String numeroCuenta;
    private String titular;
    private double saldo;
    public CuentaBancaria(String numeroCuenta,String titular,double saldo){
        if (numeroCuenta.isBlank()){
            throw new IllegalArgumentException("No puede estar vacio");
        }else{
            this.numeroCuenta=numeroCuenta.strip();
        }
        if (titular.isBlank()){
            throw new IllegalArgumentException("No puede estar vacio");
        }
        if (saldo<0.0){
            throw new IllegalArgumentException("No se puede tener saldo negativo");
        }else{
            this.saldo=saldo;
        }


    }
    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setTitular(String titular){
        if (titular.isBlank()){
            throw new IllegalArgumentException("No puede estar vacío");
        }else{
            this.titular=titular;
        }
    }
    public void depositar(double monto){
        if (monto>0){
            this.saldo+=monto;
        }else{
            System.out.println("El monto no puede ser menor a cero");
        }
    }
    public void retirar(double monto){
        if (monto>0 && monto<=saldo){
            this.saldo-=monto;
        } else if (monto<=0) {
            System.out.println("El monto debe ser mayor a cero");

        }else{
            System.out.println("Saldo insuficiente");
        }
    }

}
