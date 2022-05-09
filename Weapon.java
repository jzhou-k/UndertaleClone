
/*
 * Name: Julia Zhou
 * Date: 5/07/2022
 * Description: This weapon class is a child class to Item 
 */


public class Weapon extends Item {
    
    //Attributes

    /**weapon's attackDmg */
    private int attackDmg;


    //Constructors
    /**
     * Initialize weapon with name, coord, size, description, price and attack damage
     * @param name
     * @param coord
     * @param size
     * @param description
     * @param price
     * @param attackDmg Attack damage of weapon 
     */
    public Weapon(String name, int[] coord, int[] size, String description, int price, int attackDmg){
        super(name, coord, size, description, price);
        this.attackDmg = attackDmg;
    }

    /**
     * Default constructor if folks are too lazy, they just pass in name and defense number 
     * and other things will be set to default values
     * @param name
     * @param attackDmg
     */
    public Weapon(String name, int attackDmg){
        super(name);
        this.attackDmg = attackDmg;
    }

    
    /** 
     * Let user set attackDmg of each item
     * @param attackDmg item's attackDmg
     */
    //Mutators
    public void setAttackDmg(int attackDmg){
        this.attackDmg = attackDmg;
    }

    
    /** 
     * returns item's attackDmg
     * @return int attackDmg
     */
    public int getAttackDmg() {
        return attackDmg;
    }

    /** 
     * returns a formated list of attributes for item
     * @return String
     */
    public String toString(){
        return super.toString() + "\nAttack Damage: " + attackDmg;
    }
}


