package controller;

import javax.swing.JFrame;

import model.PacmanGame;
import view.AppWindow;

public class App {

    public static AppWindow win = new AppWindow();
    public static PacmanGame game = new PacmanGame();

    public static void main(String[] args) {
        
        win.init();
        win.setLocation(300, 200);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        win.pack();
        win.setVisible(true);

    }
    
}