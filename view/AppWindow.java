package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AppWindow extends JFrame {
    
    public AppCanvas canvas = new AppCanvas();

    public void init() {
        var cp = getContentPane();
        cp.add(canvas, BorderLayout.NORTH);
    }
}
