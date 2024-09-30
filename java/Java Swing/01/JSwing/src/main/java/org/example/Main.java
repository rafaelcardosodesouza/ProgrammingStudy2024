package org.example;

import org.example.testeDeComponentes.ButtonJlabel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Criar a janela principal
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        // Criar o painel para os componentes com GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 2));

        // Criação dos JLabels e JTextField
        JLabel label = new JLabel("Qual o usuario: ");
        JTextField campoDeUsuario = new JTextField(10);
        JLabel label1 = new JLabel("Senha: ");
        JPasswordField campoDeSenha = new JPasswordField(10);


        // Resultado JLabel
        JLabel resultado = new JLabel("");

        // Definir o tamanho preferido dos campos de texto (altura mais compacta)
        campoDeUsuario.setPreferredSize(new Dimension(150, 20));
        campoDeSenha.setPreferredSize(new Dimension(150, 20));

        // Adicionando os componentes ao painel
        panel.add(label);
        panel.add(campoDeUsuario);
        panel.add(label1);
        panel.add(campoDeSenha);
        panel.add(new JLabel("")); // Espaço vazio
        frame.getContentPane().add(BorderLayout.CENTER, resultado);

        // Adiciona o painel ao frame
        frame.getContentPane().add(BorderLayout.NORTH, panel);

        // Botão Enviar
        JButton buttonJLabel = new JButton("Enviar");
        buttonJLabel.addActionListener(new ButtonJlabel(campoDeUsuario, campoDeSenha, resultado));
        frame.getContentPane().add(BorderLayout.SOUTH, buttonJLabel);

        frame.setVisible(true);
    }
}
