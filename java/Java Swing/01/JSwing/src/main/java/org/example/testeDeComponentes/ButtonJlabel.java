package org.example.testeDeComponentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonJlabel implements ActionListener {

    private JTextField usuario;
    private JTextField senha;
    private JLabel resultado;
    private String nomeUser = "rafael";
    private String senhaUser = "123";

    public ButtonJlabel(JTextField campoDeTexto, JTextField senha, JLabel resultado) {
        this.usuario = campoDeTexto;
        this.senha = senha;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuarioTexto = usuario.getText().trim();
        String senhaTexto = senha.getText().trim();

        if (usuarioTexto.isEmpty() || senhaTexto.isEmpty()) {
            resultado.setText("Preencha ambos os campos.");
            System.out.println("nao preenchido");
        } else if (usuarioTexto.equals(nomeUser) && senhaTexto.equals(senhaUser)) {
            resultado.setText("Bem vindo Sr. " + nomeUser);
            System.out.println("logado");
        } else {
            resultado.setText("Usuário ou Senha incorretos.");
            System.out.println("erro");
        }
    }
}
