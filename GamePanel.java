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

    //FPS
    int FPS = 60;

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

        double drawInterval = 1000000000/FPS; //0.01666 seconds
        double nextDrawTime = System.nanoTime() + drawInterval;

        while(gameThread != null){
            
            //System.out.println("game loop is running");
            update();

            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;

                if(remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval; 

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        
    }

    public void startGamePanel() {
        gameThread = new Thread(this);
        gameThread.start(); //this calls the run method 

    }

    public void update() {
        
        if(keyH.upPressed == true){
            if (playerY - (player1).getSpeed() > 0)
            {
                playerY -= (player1).getSpeed();
            }
            else if(playerY - (player1).getSpeed() < 0){
                playerY = 0;
            }
        }
        else if(keyH.downPressed == true){
            if (playerY + (player1).getSpeed() < screenHeight-20)
            {
                playerY += (player1).getSpeed();
            }
            else if(playerY + (player1).getSpeed() > screenHeight-20){
                playerY = screenHeight-20;
            }
        }
        else if(keyH.leftPressed == true){
            if (playerX + (player1).getSpeed() < screenWidth-20){
                playerX += (player1).getSpeed();
            }
            else if(playerX + (player1).getSpeed() > screenWidth-20){
                playerX = screenWidth-20;
            }
                
        }
        else if(keyH.rightPressed == true){
            if (playerX - (player1).getSpeed() > 0){
                playerX -= (player1).getSpeed();
            }
            else if (playerX - (player1).getSpeed() < 0){
                playerX = 0;
            }
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
