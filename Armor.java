
/*
 * Name: Julia Zhou
 * Date: 5/07/2022
 * Description: This Armor class is a child class to Item 
 */


public class Armor extends Item {
    
    /** defense number */
    private int defense; 

    /**
     * Initialize armor with name, coord, size, description, price and defense number
     * @param name
     * @param coord
     * @param size
     * @param description
     * @param price
     * @param defense the defense number of armor 
     */
    public Armor(String name, int[] coord, int[] size, String description, int price, int defense){
        super(name, coord, size, description, price);
        this.defense = defense;
    }

    /**
     * Default constructor if folks are too lazy, they just pass in name and defense number 
     * and other things will be set to default values
     * @param name
     * @param defense
     */
    public Armor(String name, int defense){
        super(name);
        this.defense = defense;
    }

    
    /** 
     * Return defense number 
     * @return defense number 
     */
    public int getDefense() {
        return defense;
    }

    
    /** 
     * Returns formatted attributes. 
     * @return String of formatted attributes in this class
     */
    @Override
    public String toString() {
        return super.toString() + "\nDefense: " + defense; 
    }

}
