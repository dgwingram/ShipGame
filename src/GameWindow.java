import javax.swing.JFrame;


import java.awt.Dimension;
import java.awt.Toolkit;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GameWindow extends JFrame {


    GamePanel screen;
    GraphicsDevice device;
    Dimension currentDimensions, fullscreenDimensions, defaultScreenSize;


    //Constructor
    public GameWindow(){
        defaultScreenSize = new Dimension(800,600);
        fullscreenDimensions = Toolkit.getDefaultToolkit().getScreenSize();


    }

    //Initializing Window
    private void init(int width, int height){
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.device = graphics.getDefaultScreenDevice();


        //Set window Information
        setTitle("Ship Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(width, height));

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //Set Screen to Fullscreen
    public void setFullscreen(){

        this.device.setFullScreenWindow(this);
    }
}
