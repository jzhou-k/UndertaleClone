public class Player extends GameObject {

    /** The current health of the player */
    private int health = 20;
   
    /** The max health of the player */
    private int maxHealth = 20;
    
    /** whether the player is dead or not*/
    private boolean death = false;   
    
    /** this is the speed of the player */
    private int speed = 10; 

    /** this is the inventory of the player */
    private Item[] inventory = new Item[5];
    
    /** this is the attack damage of the player */
    private int attackDmg = 0;
    
    /** this is the defense of the player */
    private int defense = 0;

    / ** this is the gold of the player */
    private int gold = 0;



    /**
     * This is the constuctor for Player
     * @param name - the name of the player
     */
    public Player (String name) {

        super(name);
    }


    /** ACESSORS */

    /**
     * gets the inventory of the player
     * @return inventory - the inventory of the player
     */
    public Item[] getInventory() {
       
        return inventory;
    }
    
    /**
     * gets the health of the player
     * @return health - the health of the player
     */
    public int getHealth() {
        
        return health;
    }

    /**
     * gets the speed of the player
     * @return speed - the speed of the player
     */
    public int getSpeed() {
        
        return speed;
    }
    
    /**
     * gets the max health of the player
     * @return maxHealth - the max health of the player
     */
    public int getMaxHealth(){
        return maxHealth;
    }
    
    /**
     * gets the gold of the player
     * @return gold - the gold of the player
     */
    public int getGold() {
        return gold;
    }


    // MUTATORS //

    /**
     * the method sets a new health for the player depending on if they have taken a health potion
     * @param newHealth - the new helth of the player
     */
    public void setHealth (int newHealth) {

        // this if statement block sets the correct health value for different situations.
        if (newHealth < 0) {

            this.health = 0;
        }
       
        else if (newHealth < maxHealth) {
            
            this.health = health + newHealth;
        }
        
        else {
            
            this.health = maxHealth;
        }
    }


    /** Other Methods */

    /**
     * this is the method for using comsumable items
     * @param item - this is the consumable item the player is using
     */
    public void useConsumable(Consumable item){

        // this if statement block determines what happens to the health when it is at max or below max
        if (this.health == this.maxHealth) {

            // prints out health prompt
            System.out.println ("Health potion was not equipped. Health is already at max.");
        }
        
        else if (this.health < this.maxHealth) {

            // adds the consumable health boost to the players health
            this.health = this.health + item.getHealAmount();

            // this if statement block determines is what happens to the players health if it is over max or smaller than max and prints the respective prompt
            if (this.health > this.maxHealth) {

                // makes players health max
                this.health = this.maxHealth;

                System.out.println ("Health Potion was equipped. Health has increased to " + this.health);
            }

            else if (this.health < this.maxHealth) {

                System.out.println ("Health Potion was equipped. Health has increased to " + this.health);
            }

            else {

                // nothing
            }
        }
    }

    /**
     * This is the method for equipping weapons to the player
     * @param weapon - this is the weapons equipped to the player
     */
    public void equipWeapon( Weapon weapon){
        
        // this calculates the new attack damage of the player
        this.attackDmg = this.attackDmg + weapon.getAttackDmg();;

        // prints out the attack damage prompt
        System.out.println ("A weapon was equipped. Attack damage has increased to " + this.attackDmg);
    }

    /**
     * this is the method for equipping armour to the player
     * @param armor - this is the armour equipped to the player
     */
    public void equipArmor (Armor armor){
    
        // this calculates the new defense stat of the player
        this.defense = this.defense + armor.getDefense();

        // prints out the defense prompt
        System.out.println ("Armour was equipped. Defense has increased to " + this.defense);
    }

    /**
     * this is the method for the player picking up object
     * @param item - this is the item the player picks up
     */
    public void pickUpItem(Item item){
        
        //This for loop looks for the closest empty index and adds the item to inventory array.
        for (int i = 0; i < inventory.length; i++){
            
            if (inventory[i] == null) {
                
                inventory[i] = item;
                
                break;
            }
        }
    }

    /**
     * this is the method for printing out the player's inventory
     */
    public void printInventory(){
        System.out.println("----------\nPLAYER INVENTORY");
        for(int i=0; i< inventory.length; i++){
            
            if(inventory[i] != null){
                
                System.out.println(inventory[i].getName());
            }
            
            else{
              
                System.out.println("empty slot");
            }  
        }
    }

    
    /**
     * this method gets the list of inventory items of the player
     * @return inventoryString - the string of inventory items of the player
     */
    public String getInventoryAsString(){
       
        String inventoryString = "\n----------\nPLAYER INVENTORY"; 

        // this for loop puts the inventory items into a variable 
        for(int i=0; i< inventory.length; i++) {
          
            // if statement block checks array items and puts the item into the variable
            if(inventory[i] != null) {
                
                inventoryString += ("\n" + (i+1) + ": " + inventory[i].getName()); 
            }
            
            else {
            
                inventoryString += ("\nempty slot");
            }
        }

        // returns the list of the inventory items
        return inventoryString;
    }


    /** 
     * Player damage when hit by bullet 
     * @param bullet the bullet object the player got hit by
     */
    public void takeDamage(Bullet bullet) {
        
        this.health = this.health - bullet.getBulletDmg();
        System.out.println("Player got hit! damage taken: " + bullet.getBulletDmg());
    }

    /**
     * this method determines of the player is dead depending on their health
     * @param int playerHealth - the current health of the player
     */
    public boolean checkDeath () {

        // this if statement block checks for player death
        if (health <= 0) {

            death = true;
        }
        
        else {

            death = false;
        }

        return death;
    }

    /**
     * this method returns the stats of the player
     */
    public String toString() {
        
        String inventoryString = getInventoryAsString();
        
        return super.toString() + "\nHealth: " + health + "\nDeath: " + death + "\nSpeed: " + speed + "\nGold: " + gold + 
        "\nAttack Damage: " + attackDmg + "\nDefense: " + defense + inventoryString;
    }

    /**
     * this is the method for the player earning gold
     * @param goldEarned - the gold earned by the player
     */
    public void earnGold(int goldEarned){

        this.gold = this.gold + goldEarned;
    }

    /**
     * this is the method for the player losing gold
     * @param goldLost - the gold lost by the player
     */
    public void loseGold(int goldLost){
        
        this.gold = this.gold - goldLost;
    }
}
