import java.awt.Rectangle;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
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



    public void falling () {
        this.y += 10;
    }


    public void draw(Graphics g) {

        g.setColor(this.color);
        g.fillRect (this.x, this.y, this.width, this.height);

    }



}


