public class Settings
{
    /*
    Attributes
    */

    /** the width of the combat screen */
    private int combatScreenX;
    /** the hight of the combat screen */
    private int combatScreenY;
    /** the movement speed of the player */
    private int playerSpeed;
    /** the health of the player */
    private int playerHealth;
    /** the movement speed of the bullet */
    private int bulletSpeed;

    /*
    Constructor
    */

    public Settings(int combatScreenX, int combatScreenY, int playerSpeed, int playerHealth, int bulletSpeed)
    {
        if(combatScreenX < 0)
        {
            this.combatScreenX = 1;
        }
        else
        {
            this.combatScreenX = combatScreenX;
        }

        if(combatScreenY < 0)
        {
            this.combatScreenY = 1;
        }
        else
        {
            this.combatScreenY = combatScreenY;
        }

        if(playerSpeed < 0)
        {
            this.playerSpeed = 1;
        }
        else
        {
            this.playerSpeed = playerSpeed;
        }

        if(playerHealth< 0)
        {
            this.playerHealth = 1;
        }
        else
        {
            this.playerHealth = playerHealth;
        }
        
        if(bulletSpeed < 0)
        {
            this.bulletSpeed = 1;
        }
        else
        {
            this.bulletSpeed = bulletSpeed;
        }
    }

    /*
    Accessors
    */

    /**
    gets the width of the combat screen
    @return the width of the combat screen
    */
    public int getCombatScreenX()
    {
        return this.combatScreenX;
    }

    /**
    gets the length of the combat screen
    @return the length of the combat screen
    */
    public int getCombatScreenY()
    {
        return this.combatScreenY;
    }

    /**
    gets the speed of the player
    @return the speed of the player
    */
    public int getPlayerSpeed()
    {
        return this.playerSpeed;
    }

    /**
    gets the health of the player
    @return the health of the player
    */
    public int getPlayerHealth()
    {
        return this.playerHealth;
    }

    /**
    gets the speed of the bullet
    @return the speed of the bullet
    */
    public int getBulletSpeed()
    {
        return this.bulletSpeed;
    }

    /*
    Mutators
    */

    /**
    changes the width of the combat screen
    @param newCombatScreenX the new width of the comobat screen
    */
    public void setCombatScreenX(int newCombatScreenX)
    {
        if(combatScreenX < 0)
        {
            //nothing happens - invalid
        }
        else
        {
            this.combatScreenX = newCombatScreenX;
        }
    }

    /**
    changes the hight of the combat screen
    @param newCombatScreenY the new hight of the comobat screen
    */
    public void setCombatScreenY(int newCombatScreenY)
    {
        if(combatScreenY < 0)
        {
            //nothing happens - invalid
        }
        else
        {
            this.combatScreenY = newCombatScreenY;
        }
    }

    /**
    changes the speed of the player
    @param newPlayerSpeed the new speed of the player
    */
    public void setPlayerSpeed(int newPlayerSpeed)
    {
        if(newPlayerSpeed < 0)
        {
            //nothing happens - invalid
        }
        else
        {
            this.playerSpeed = newPlayerSpeed;
        }
    }

    /**
    changes the health of the player
    @param newPlayerHealth the new health of the player
    */
    public void setPlayerHealth(int newPlayerHealth)
    {
        if(newPlayerHealth < 0)
        {
            //nothing happens - invalid
        }
        else
        {
            this.playerHealth = newPlayerHealth;
        }
    }

    /**
    changes the speed of the bullet
    @param newBulletSpeed the new speed of the bullet
    */
    public void setBulletSpeed(int newBulletSpeed)
    {
        if(newBulletSpeed < 0)
        {
            //nothing happens - invalid
        }
        else
        {
            this.bulletSpeed = newBulletSpeed;
        }
    }

    /*
    Methods
    */
    

}