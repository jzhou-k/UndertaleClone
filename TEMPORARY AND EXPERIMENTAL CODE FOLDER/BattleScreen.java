import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class BattleScreen extends JFrame {

    Image image;
    Graphics graphics;
    Bullet bullet;
    boolean bulletFalling = false;
    int randomXValue = (int)(Math.random() * 880) + 11;
    int bulletStartingPoint = 11;


    BattleScreen() {

        bullet = new Bullet(randomXValue, bulletStartingPoint, 30, 30, Color.white);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 600);
        this.setVisible(true);
    }

    public void paint(Graphics g) {

       // image = createImage(this.getWidth(), this.getHeight());
      //  graphics = image.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, 900, 600);

        //g.drawImage(image, 0, 0, this);
        bulletFalling = true;
        bullet.draw(g);

        if (bulletFalling == true) {

            for (int falling = bulletStartingPoint; falling >= 600; falling = falling + 70) {

                bullet.setY(bulletStartingPoint + 70);
                bullet.draw(g);
                

            }
        }

        else {

            // nothing
        }

    }
}




/** 

        if (bulletFalling == true) {

            int movingHeight = 11;

            for (int FT = movingHeight; movingHeight >= 600; FT = FT + 50) {
            
                movingHeight = movingHeight + 50;
                repaint();

            }

        }


    }

    
    public void checkCollision() {


    }

    
   // public class ActionListener extends KeyAdapter {


   // }

}
*/
