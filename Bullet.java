//import java.util.*;

public class Bullet extends CombatObject {

    /** this is the damage of the bullet */
    private int damage;

    /**
     * this is the constructor for Bullet
     * @param <<CombatObject Attributes>>
     * @param damage - this is the damage of the bullet
     */
    public Bullet (String name, int damage) {

        super(name);
        this.damage = 5;

    }

    // OTHER METHODS //

    public void spawn (int x, int y) {
        this.coord[0] = x;
        this.coord[1] = y;
        //xCoordinate = (int)(Math.random() * <<LENGTH OF THE SCREEN>>);
        //yCoordinate = (int)(Math.random() * <<WIDTH OF THE SCREEN>>);
    }

}