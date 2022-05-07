public class Item extends GameObject{

    /** decription of item */
    String description;
    /** price of item */
    int price;


    public Item(String name, int[] coord, int[] size, String description, int price){
        super(name, coord, size);
        this.description = description;
        this.price = price;
        
    }
    
    public Item(String name){
        super(name);
    }

    
    /** 
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }

    
    /** 
     * @param price
     */
    public void setPrice(int price){
        this.price = price; 
    }

   

}
