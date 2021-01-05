package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Catalogo implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton Nikebutton = new JButton("Nike");
    JButton Adidas = new JButton("Adidas");
    JButton Panther = new JButton("Panther");
    JButton Comfort = new JButton("Comfort");
    JButton Diesel = new JButton("Diesel");
    JButton GAP = new JButton("GAP");
    JButton Hunter = new JButton("Hunter");

    public static void lista(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        Nikebutton.setBounds(100,500,20,20);
        Nikebutton.setFocusable(false);
        Nikebutton.addActionListener(this);

        Adidas.setBounds(100,400,20,20);






        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);


        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Nikebutton){

            frame.dispose();
        }


    }

}