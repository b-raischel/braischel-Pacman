package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import view.statePattern.GameState;
import view.statePattern.GameStateInit;

public class AppWindow extends JFrame {
    
    public AppCanvas canvas = new AppCanvas();

    private GameState state = new GameStateInit();
    
    public void init() {
        var cp = getContentPane();
        cp.add(canvas, BorderLayout.NORTH);

        updateWindow();
    }

    public void goNextState() {
        state.goNext(this);
    }

    public GameState getGameState() {
        return state;
    }

    public void setGameState(GameState state) {
        this.state = state;
    }

    public void updateWindow() {
        canvas.repaint();
    }

}
