//import java.util.*;

public class Bullet extends CombatObject {

    /** this is the damage of the bullet */
    private int damage = 5;

<<<<<<< Updated upstream
=======
    /** this is the speed of the bullet */
    private int speed = 3;

>>>>>>> Stashed changes
    /**
     * this is the constructor for Bullet
     * @param <<CombatObject Attributes>>
     * @param damage - this is the damage of the bullet
     */
<<<<<<< Updated upstream
    public Bullet (String name, int damage) {

        super(name);
        this.damage = 5;

    }

    public int getBulletDmg(){
        return damage;
=======
    public Bullet (String name) {

        super(name);
    }

    /**
     * this gets the value of the damage of the bullet
     */
    public int getBulletDmg() {
        
        return this.damage;
>>>>>>> Stashed changes
    }

    // OTHER METHODS //


}