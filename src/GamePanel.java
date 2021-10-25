import javax.swing.JPanel;
import java.awt.Dimension;

public class GamePanel extends JPanel {

    Dimension screenRes;

    public GamePanel(int width, int height){
        screenRes = new Dimension(width, height);
    }

    public GamePanel(Dimension screen){
        this.screenRes = screen;
    }
}
