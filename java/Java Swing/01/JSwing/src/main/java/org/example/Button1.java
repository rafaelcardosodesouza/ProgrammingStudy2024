package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Botão pressionado");
        String st  = "UIIIII APERTOU O BOTAO NEH!! HEHE";

        JOptionPane.showMessageDialog(null, st);
    }
}
