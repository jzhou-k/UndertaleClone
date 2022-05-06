public class Item extends GameObject{

    String description;
    int price;


    public Item(String name, int[] coord, int[] size, String description, int price){
        super(name, coord, size);
        this.description = description;
        this.price = price;
        
    }
    
    public Item(String name){
        super(name);
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(int price){
        this.price = price; 
    }

   

}
