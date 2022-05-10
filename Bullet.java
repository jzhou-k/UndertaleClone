//import java.util.*;

public class Bullet extends GameObject {

    /** this is the damage of the bullet */
    private int damage;
    private int speed;

    /**
     * this is the constructor for Bullet
     * @param <<CombatObject Attributes>>
     * @param damage - this is the damage of the bullet
     */
    public Bullet (String name, int damage) {

        super(name);
        this.damage = 5;
        
    }

    public int getBulletDmg(){
        return damage;
    }

    // OTHER METHODS //
    public void move(int x, int y) {
        //coord of this particular object is changed
        coord[0] = x;
        coord[1] = y;
    }

}