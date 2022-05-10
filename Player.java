public class Player extends CombatObject {

    /** The health of the player */
    private int health = 20;
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
     * @param newHealth - if the player used a health postion or not
     
    public void setHealth (boolean useHealthPotion) {

        if (useHealthPotion == true) {

            this.health = (this.health + 10);

        }

    }
    */


    // OTHER METHODS //

<<<<<<< Updated upstream
    public void takeDamage(int damageTaken){
        this.health -= damageTaken;
=======
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
       
        String inventoryString = ""; 

        // this for loop puts the inventory items into a variable 
        for(int i=0; i< inventory.length; i++) {
          
            // if statement block checks array items and puts the item into the variable
            if(inventory[i] != null) {
                
                inventoryString += ("\n" + (i + 1) + ": " + inventory[i].getName()); 
            }
            
            else {
            
                inventoryString += ("\nempty slot");
            }
        }

        // returns the list of the inventory items
        return inventoryString;
    }

    /**
     * this method applys damage taken to the player's health
     */
    public void takeDamage(Bullet bullet){
        
        this.health = this.health - bullet.getBulletDmg();
>>>>>>> Stashed changes
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

    public int getHealth(){
        return health;
    }
}
