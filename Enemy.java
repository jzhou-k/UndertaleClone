public class Enemy{
    
    /*
    Attributes
    */

    /** name of the enemy */
    private String name;
    /** health points of the enemy */
    private int health;

    /*
    Constructor
    */

    public Enemy(String name, int health)
    {
        this.name = name;
        
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
