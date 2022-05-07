public class Player extends GameObject {

    /** The current health of the player */
    private int health = 20;
    /** The max health of the player */
    private int maxHealth = 20;
    /** whether the player is dead or not*/
    private boolean death = false;   
    
    private int speed = 10; 

    private Item[] inventory = new Item[5];
    
    int attackDmg = 0;
    int defense = 0;


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

    public void equipWeapon( Weapon weapon){
        this.attackDmg = weapon.getAttackDmg();
    }

    public void equipArmor (Armor armor){
        this.defense = armor.getDefense();
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void pickUpItem(Item item){
        
        //This for loop looks for the closest empty index and adds the 
        //the item to inventory array. (use Array list next time maybe?)
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i] == null) {
                inventory[i] = item;
                break;
            }

        }
    
    }

    //equip item

    public void printInventory(){
        for(int i=0; i< inventory.length; i++){
            if(inventory[i] != null){
                System.out.println(inventory[i].getName());
            }else{
                System.out.println("empty slot");
            }
            
        }

    }
    
    public String getInventoryAsString(){
        String inventoryString = ""; 
        for(int i=0; i< inventory.length; i++){
            //
            if(inventory[i] != null){
                inventoryString += ("\n" + (i+1) + ": " + inventory[i].getName());
            }else{
                inventoryString += ("\nempty slot");
            }
        }

        return inventoryString;
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

    public int getSpeed(){
        return speed;
    }

     @Override
    public String toString() {
        // TODO Auto-generated method stub
        String inventoryString = getInventoryAsString();
        return super.toString() + "\nHealth: " + health + "\nDeath: " + death + "\nSpeed: " + speed + 
        "\nAttack Damage: " + attackDmg + "\nDefense: " + defense + "\nInventory: " + inventoryString;
    }
    
}
