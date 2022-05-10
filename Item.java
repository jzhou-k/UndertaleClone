/*
 * Name: Julia Zhou
 * Date: 5/07/2022
 * Description: This item class is a child class to GameObject
 */


public class Item extends GameObject{

    /** decription of item */
    private String description;
    /** price of item */
    private int price;


    /*
    constructor
    */

    public Item(String name, int[] coord, int[] size, String description, int price){
        super(name, coord, size);
        this.description = description;
        this.price = price;
        
    }
    
    public Item(String name){
        super(name);
    }

    
    /** 
     * let user set description for item
     * @param description item description
     */
    public void setDescription(String description){
        this.description = description;
    }

    
    /** 
     * Let user set item price
     * @param price item price
     */
    public void setPrice(int price){
        this.price = price; 
    }

        //getters 
    /** 
     * gets the price of items
     * @return int
     */
    public int getPrice() {
        return price;
    }

    
    /** 
     * gets the item description 
     * @return String
     */
    public String getDescription() {
        return description;
    }
    
    /** 
     * returns a formated list of attributes for item
     * @return String
     */
    public String toString(){
        return super.toString() + "\nDescription: " + description + "\nPrice: " + price;
    }
   

}
