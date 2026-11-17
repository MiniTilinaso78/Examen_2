package com.banco.app;
import com.banco.modelo.Cliente;
public class Main {
    public static void main(String[] args){
        Cliente c = new Cliente("CLI-101","Ana Gómez");
        System.out.println(c.codigoIdentificacion);
    }
}
