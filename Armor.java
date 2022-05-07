import java.lang.management.ThreadInfo;

/*
 * Name: Julia Zhou
 * Date: 5/07/2022
 * Description: This Armor class is a child class to Item 
 */


public class Armor extends Item {
    
    /** defense number */
    private int defense; 

    public Armor(String name, int[] coord, int[] size, String description, int price, int defense){
        super(name, coord, size, description, price);
        this.defense = defense;
    }

    public Armor(String name, int defense){
        super(name);
        this.defense = defense;
    }

    
    /** 
     * @return int
     */
    public int getDefense() {
        return defense;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\nDefense: " + defense; 
    }

}
