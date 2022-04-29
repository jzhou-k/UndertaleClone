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

    public int getBulletDmg(){
        return damage;
    }

    // OTHER METHODS //


}