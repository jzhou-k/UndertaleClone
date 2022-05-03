public class Enemy {
    
    /*
    Attributes
    */

    /** health points of the enemy */
    private int health;

    /*
    Constructor
    */

    public Enemy(int health)
    {
        if(health < 0)
        {
            this.health = 1;
        }
        else
        {
            this.health = health;
        }
    }

    /*
    Accessors
    */

    /**
    gets the health of the enemy
    @return the health of the enemy
    */
    public int getHealth()
    {
        return this.health;
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
            //nothing happens - invalid
        }
        else
        {
            this.health = newHealth;
        }
    }
}
