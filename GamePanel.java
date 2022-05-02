import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel  extends JPanel {
    
    //game panel is a subclass of Jpanel 
    //SCREEN SETTINGS

    //we are using tiles that are 16*  16
    final int screenWidth = 16 * 20 ;
    final int screenHeight = 16 * 20;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //make game run better 
    }


}
