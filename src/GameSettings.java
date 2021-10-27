import java.awt.Dimension;

public class GameSettings {

    Dimension resolution;
    GameControls controller;

    private boolean isFullscreen = false;
    private int fps = 60;


    //restore defaults
    public void RestoreDefaults(){
        DefaultControlsPC();
        DefaultResolution();
        DefaultGamepadControls();
    }

    public void DefaultControlsPC(){
        // TODO: 2021-10-27 add default controls to controller class
    }

    public void DefaultGamepadControls(){
        // TODO: 2021-10-27 set default gamepad or game controller controls
    }

    public void DefaultResolution(){
        resolution = new Dimension(800, 800);
    }

    // Set Preferences




}
