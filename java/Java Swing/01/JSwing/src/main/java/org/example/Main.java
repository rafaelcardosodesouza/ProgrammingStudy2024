package org.example;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        // Criar a janela principal
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Criar o painel para os botões
        JPanel panel = new JPanel();

        // Criar o botão 1 e adicionar ao painel
        JButton button1 = new JButton("Clique em mim - Botão 1");
        button1.addActionListener(new Button1()); // Usando a classe Button1
        panel.add(button1);

        // Criar o botão 2 e adicionar ao painel
        JButton button2 = new JButton("Clique em mim - Botão 2");
        button2.addActionListener(new Button2()); // Usando a classe Button2
        panel.add(button2);

        // Adicionar o painel à janela
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setVisible(true);
    }
}