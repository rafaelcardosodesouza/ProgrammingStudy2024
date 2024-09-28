package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Teste");



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
/*
        JButton button = new JButton("Nortth");
        JButton button1 = new JButton("West");
        JButton button2 = new JButton("South");
        JButton button3 = new JButton("Center");
        JButton button4 = new JButton("East");
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.getContentPane().add(BorderLayout.WEST, button1);
        frame.getContentPane().add(BorderLayout.SOUTH, button2);
        frame.getContentPane().add(BorderLayout.CENTER, button3);
        frame.getContentPane().add(BorderLayout.EAST, button4);
*/


        JPanel panel = new JPanel();

        panel.add(new JButton("Click me 1")).setPreferredSize(new Dimension(100, 50));
        panel.add(new JButton("Click me 2")).setPreferredSize(new Dimension(100, 50));

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));


        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setVisible(true);
    }
}