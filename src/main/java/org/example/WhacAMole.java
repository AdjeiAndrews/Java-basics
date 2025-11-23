package org.example;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class WhacAMole {

    int boardWidth = 600;
    int boardHeight = 650;

    JFrame frame = new JFrame("Mario: Whack A Mole");

    WhacAMole(){
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

    }
}
