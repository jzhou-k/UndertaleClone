public class HealingItem {
    
    /*
    Attributes
    */

    /** name of the item */
    private String name;
    /** how much the item heals the player */
    private int healAmount;

    /*
    Constructor
    */

    public HealingItem(String name, int healAmount)
    {
        this.name = name;
        this.healAmount = healAmount;
    }

    /*
    Accessors
    */

    /**
    gets the heal amount of the item
    @return the heal amount of the item
    */
    public int getHealAmount()
    {
        return this.healAmount;
    }
    /**
    gets the name of the item
    @return the name of the item
    */
    public String getName()
    {
        return this.name;
    }

    /*
    Mutators
    */

    /**
    changes the amount the item heals you
    @param newHealAmount the new amount the item will heal
    */
    public void setHealAmount(int newHealAmount)
    {
        this.healAmount = newHealAmount;
    }
    /**
    changes the name of the item
    @param newName the new name of the item
    */
    public void setName(String newName)
    {
        this.name = newName;
    }
}