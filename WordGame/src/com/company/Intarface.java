package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Intarface extends JFrame {
    private JButton start;
    private JButton next;
    private JButton check;
    private JTextField word;
    private JTextField translation;

    public Intarface() throws IOException {
        setTitle("Word Game");
        BufferedImage img = ImageIO.read(new File("src/E.gpg"));
        MyPanel panel = new MyPanel(img);
        panel.setLayout(null);
        word = new JTextField("Word");
        translation = new JTextField("лово (перевод слова)");

        word.setLayout(null);
        translation.setLayout(null);

        word.setBounds(100 ,90 ,200 ,30);
        translation.setBounds(100,130,200,30);

        word.setFont(new Font( "Arial" , Font.ROMAN_BASELINE,16));
        translation.setFont(new Font("Arial", Font.ROMAN_BASELINE,16));

        start = new JButton("начать");

        start.setLayout(null);
        start.setBounds(100,130,200,30);
        start.setBackground(new Color(273,54,53));
        start.setBackground(Color.WHITE);
        start.setFont(new Font("Arial", Font.BOLD,26));
        start.setFocusPainted(false);

        setContentPane(panel);
        setSize(1920, 1080);
        setVisible(true);
    }
    public static void main(String[]args) throws IOException {
        new Intarface();
    }
}