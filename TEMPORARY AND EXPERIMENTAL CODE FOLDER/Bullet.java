import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Bullet extends Rectangle {

    Color color;

   // private int damage;

    Bullet (int x, int y, int width, int height, Color color) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;

    }

    public void spawn (boolean spawnBullet) {

        if (spawnBullet == true) {

            this.x = (int)(Math.random() * 300) + 11;
            this.y = 11;

        }

        else {

            // nothing
        }
    }


    public void draw(Graphics g) {

        g.setColor(this.color);
        g.fillRect (this.x, this.y, this.width, this.height);

    }



}

