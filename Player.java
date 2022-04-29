public class Player extends CombatObject {

    /** The health of the player */
    private int health;

    /**
     * This is the constuctor for Player
     * @param <<PLEASE INCLUDE THE OTHER ATTRIBUTES OF THE SUPERCLASS>>
     * @param health - the health of the player
     */
    private Player (<<CombatObject Attributes>>, int health) {

        super(<<CombatObject Attributes>>);
        this.health = 100;

    }


    // MUTATORS //

    /**
     * the method sets a new health for the player depending on if they have taken a health potion
     * @param newHealth - if the player used a health postion or not
     */
    public void setHealth (boolean useHealthPotion) {

        if (useHealthPotion == true) {

            this.health = (this.health + 10);

        }

    }

    // OTHER METHODS //

    /**
     * this method determines of the player is dead depending on their health
     * @param int playerHealth - the current health of the player
     */
    public boolean isThereDeath (int playerHealth) {

        boolean death = false;

        if (playerHealth = 0 || playerHealth < 0) {

            death == true;

        }

        else {

            death == false

        }

        return death;

    }