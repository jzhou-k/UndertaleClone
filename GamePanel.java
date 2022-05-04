import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel  extends JPanel implements Runnable{
    
    //game panel is a subclass of Jpanel 
    //SCREEN SETTINGS

    //we are using tiles that are 16*  16
    final int screenWidth = 16 * 20 ;
    final int screenHeight = 16 * 20;

    //player default position 
    Player player1 = new Player("juan");
    int playerX = 200;
    int playerY = 200;

    //what is gameThread its something to do with time and fps? 
    Thread gameThread;
    KeyHandler keyH = new KeyHandler();

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //make game run better 
        this.addKeyListener(keyH);
        this.setFocusable(true); //12:45 Game loop and key input 
    }

    //what happens when you implement something? 
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(gameThread != null){
            //System.out.println("game loop is running");
            update();
            repaint();
        }
        
    }

    public void startGamePanel() {
        gameThread = new Thread(this);
        gameThread.start(); //this calls the run method 

    }

    public void update() {
        
        if(keyH.upPressed == true){
            playerY -= ((CombatObject)player1).getSpeed(); //* need to cast it to super class
            //System.out.println("key pressed");
        }
        


    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //this section need to be changed 
        g.setColor(Color.WHITE);
        g.fillRect(playerX, playerY, 20, 20); //need to set player width!!! 
        g.dispose();
    }

}
