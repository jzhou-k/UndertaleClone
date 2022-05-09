public class Enemy {
    
    /*
    Attributes
    */

    /** name of the enemy */
    private String name;
    /** health points of the enemy */
    private int health;
    /** the max health points of the enemy */
    private int maxHealth;

    /*
    Constructor
    */

    public Enemy(String name, int health, int maxHealth)
    {
        this.name = name;
        
        if(health < 0)
        {
            this.health = 1;
        }
        else if (health > maxHealth)
        {
            this.health = maxHealth;
        }
        else
        {
            this.health = health;
        }
        this.maxHealth = maxHealth;
    }

    /*
    Accessors
    */

    /**
    gets the name of the enemy
    @return the name of the enemy
    */
    public String getName()
    {
        return this.name;
    }

    /**
    gets the health of the enemy
    @return the health of the enemy
    */
    public int getHealth()
    {
        return this.health;
    }

    /**
    gets the max health of the enemy
    @return the max health of the enemy
    */
    public int getMaxHealth()
    {
        return this.maxHealth;
    }

    /*
    Mutators
    */

    /**
    changes the health of the enemy
    @param newHealth the new health of the enemy
    */
    public void setHealth(int newHealth)
    {
        if(newHealth < 0)
        {
            this.health = 0;
        }
        else if(newHealth > maxHealth)
        {
            this.health = maxHealth;
        }
        else
        {
            this.health = newHealth;
        }
    }

    /**
    changes the max health of the enemy
    @param newMaxHealth the max new health of the enemy
    */
    public void setMaxHealth(int newMaxHealth)
    {
        if(newMaxHealth < 0)
        {
            //invalid - nothing happens
        }
        else
        {
            this.maxHealth = newMaxHealth;
        }
    }

    /*
    Methods
    */

    /**
    * returns all the attributes of the enemy in a String
    * @return all the enemy's attributes
    */
   public String toString() {
    String attributes;
    attributes = ("Name: " + name + "\nHealth: " + health);
  
    return attributes; 
   }

   /**
    * the enemy drains the player's health to heal themselves
    * @param drain the amount of damage the player takes and the enemy drains
    */
    public void drainHealth(int drain) {

        if(drain < 0){
            // invalid - nothing happens
        }
        else{
            if(player.getHealth() < drain){
                player.setHealth(0);
            
                if(health+drain > maxHealth){
                    this.health = maxHealth;
                }
                else{
                    this.health = health+drain;
                }
            }
            else{
                player.setHealth(player.getHealth()-drain);
                if(health+drain > maxHealth){
                    this.health = maxHealth;
                }
                else{
                    this.health = health+drain;
                }
            }

       }
    }

    /**
    * the enemy poisons the player's consumables
    */
    public void poison() {

        consumable.setHealAmount(-2);

    }


}
