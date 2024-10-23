package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class AppCanvas extends JPanel {
    
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    public AppCanvas() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Ariel", Font.BOLD, 16));
    }
}
