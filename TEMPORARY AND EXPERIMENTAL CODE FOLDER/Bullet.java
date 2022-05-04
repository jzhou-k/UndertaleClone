import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Bullet extends Rectangle {

    Color color;

    private int damage;

    Bullet(int xLocation, int yLocation, int width, int height, Color color) {

        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.width = width;
        this.height = height;
        this.color = color;

        this.xLocation = (int)(Math.random() * 300) + 11;
        this.yLocation = 11;

    }


    public void draw(Graphics g) {

        g.setColor(this.color);
        g.fillRect (this.xLocation, this.yLocation, this.width, this.height);

    }



}

