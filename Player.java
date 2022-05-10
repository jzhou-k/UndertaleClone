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

    public void move(int x, int y) {
        //coord of this particular object is changed
        coord[0] = x;
        coord[1] = y;
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


    public void equipItem (String itemName, int itemType, int ItemStats) {

        if (itemType == 1) {

            this.attackDmg = this.attackDmg + ItemStats;

            System.out.println ("A weapon was equipped. Attack damage has increased to " + this.attackDmg);

        }

        if (itemType == 2) {

            this.defense = this.defense + ItemStats;

            System.out.println ("Armour was equipped. Defense has increased to " + this.defense);

        }

        if (itemType == 3 && this.health != this.maxHealth) {

            this.health = this.health + ItemStats;

            if (this.health > this.maxHealth) {

                this.health = this.maxHealth;
            }

            else {

                // Nothing
            }

            System.out.println ("Health Potion was equipped. Defense has increased to " + this.health);
        }

        else if (this.health == this.maxHealth) {

            System.out.println ("Health potion was not equipped. Health is already at max.");
        }

        else {

            System.out.println ("Health potion was unable to be equipped. Health has not changed.");
        }
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
