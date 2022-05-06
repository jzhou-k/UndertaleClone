public class Player extends CombatObject {

    /** The current health of the player */
    private int health = 20;
    /** The max health of the player */
    private int maxHealth = 20;
    /** whether the player is dead or not*/
    private boolean death = false;   

    /**
     * This is the constuctor for Player
     * @param <<PLEASE INCLUDE THE OTHER ATTRIBUTES OF THE SUPERCLASS>>
     * @param health - the health of the player
     */
    public Player (String name) {

        super(name);

    }


    // MUTATORS //

    /**
     * the method sets a new health for the player depending on if they have taken a health potion
     * @param newHealth - the new helth of the player
     */
    public void setHealth (int newHealth) {

        if (newHealth < 0)
        {
            this.health = 0;
        }
        else if (newHealth < maxHealth)
        {
            this.health = health + newHealth;
        }
        else
        {
            this.health = maxHealth;
        }

    }

    public void useConsumable(Consumable item){
        if((this.health += item.getHealAmount()) != maxHealth){
            this.health += item.getHealAmount();
        }else{
            this.health = maxHealth;
        }
        
    }
    


    // OTHER METHODS //

    /**
     * this method makes
     * @param int playerHealth - the current health of the player
     */
    public void takeDamage(int damageTaken){
        this.health -= damageTaken;
    }

    /**
     * this method determines of the player is dead depending on their health
     * @param int playerHealth - the current health of the player
     */
    public boolean checkDeath () {

        if (health <= 0) {

            death = true;

        }else {

            death = false;

        }

        return death;
    }

    /*
    Accessors
    */

    /**
    gets the health of the player
    @return the health of the player
    */
    public int getHealth(){
        return health;
    }
}
