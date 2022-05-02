import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel  extends JPanel implements Runnable{
    
    //game panel is a subclass of Jpanel 
    //SCREEN SETTINGS

    //we are using tiles that are 16*  16
    final int screenWidth = 16 * 20 ;
    final int screenHeight = 16 * 20;

    //what is gameThread its something to do with time and fps? 
    Thread gameThread;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //make game run better 
    }

    //what happens when you implement something? 
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }


}
