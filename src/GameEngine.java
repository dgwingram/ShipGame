

public class GameEngine implements Runnable{

    private Thread thread;
    private boolean isRunning = false;

    private GamePanel panel;
    private GameSettings settings; // TODO: 2021-10-27 GameSettings holds global settings that are changealbe like FPS and screensize
    private GameControls controller; //TODO: implement controller to be swappable with keyboard and mouse OR game controller.

    //Constructor
    public GameEngine (GameSettings settings){
        this.settings = settings;
        this.controller = settings.controller;
    }


    @Override
    public void run() {
        // TODO: 2021-10-27 Gameloop 
    }

    public void update(){
        // TODO: 2021-10-27 update game resources with thread
    }

    public void render(){
        // TODO: 2021-10-27  Render graphics to the screen
    }
}
