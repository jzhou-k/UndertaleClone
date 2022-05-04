import java.awt.*;
//import java.awt.event.*;
//import java.util.*;

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

    public void setY (int newY) {

        this.y = newY;

    }

/**
    public void falling (boolean bulletFalling) {

        if (bulletFalling == true) {

            for (int FT = this.y; this.y >= 600; FT = FT + 10) {
            
                this.y = y + 10;

            }
        }
    }
*/

    public void draw(Graphics g) {

        g.setColor(this.color);
        g.fillRect (this.x, this.y, this.width, this.height);

    }



}

