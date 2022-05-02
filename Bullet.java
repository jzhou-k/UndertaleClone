//Patrick test test 
//import java.util.*;

public class Bullet extends CombatObject {

    /** this is the damage of the bullet */
    private int damage;

    /**
     * this is the constructor for Bullet
     * @param <<CombatObject Attributes>>
     * @param damage - this is the damage of the bullet
     */
    private Bullet (<<CombatObject Attributes>>, int damage) {

        super(<<CombatObject Attributes>>);
        this.damage = 5;

    }

    // OTHER METHODS //

    public int spawn () {

        int xCoordinate;
        int yCoordinate;

        xCoordinate = (int)(Math.random() * <<LENGTH OF THE SCREEN>>);
        yCoordinate = (int)(Math.random() * <<WIDTH OF THE SCREEN>>);

    }

    


}