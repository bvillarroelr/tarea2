package org.example;

public class Main {
    public static void main(String[] args) {
        // Creación de los objetos a utilizar
        Expendedor vendomatica = new Expendedor(3,800);
        Moneda milPesos = new Moneda1000();

        System.out.println("En la máquina hay "+vendomatica.getNumcoca()+" cocacolas y "+vendomatica.getNumsprite()+" sprites.");
    }
}