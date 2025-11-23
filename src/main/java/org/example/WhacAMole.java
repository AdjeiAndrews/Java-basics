package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class WhacAMole {

    int boardWidth = 600;
    int boardHeight = 650;

    JFrame frame = new JFrame("Mario: Whack A Mole");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    public WhacAMole(){
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Score: 0");
        textLabel.setOpaque(true);

        textPanel.add(textLabel);
        textPanel.setLayout(new BorderLayout());
        frame.add(textPanel, BorderLayout.NORTH);
    }
}
