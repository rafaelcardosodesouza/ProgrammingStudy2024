package org.example.aplicacao;

import org.example.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Rafael Cardoso", "rafael@gmail.com");
        Pessoa p2 = new Pessoa(2, "Maria Eduarda", "maria@gmail.com");
        Pessoa p3 = new Pessoa(3, "Joelma Marques", "joelma@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }
}