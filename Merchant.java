public class Merchant extends Npc {
    
    //this merchant npc will sell player a array of items 

    private Item[] merchInventory = new Item[5];

    public Merchant(String name, int[] coord, int[] size, String[] dialogue, Item[] merchInventory){
        super(name, coord, size, dialogue);
        this.merchInventory = merchInventory;
    }

    //default constructor 
    public Merchant(String name, String[] dialogue, Item[] merchInventory){
        super(name, dialogue);
        this.merchInventory = merchInventory;

    }

    public String getMerchasString(){
        String merchString = "----------\n" + name + "'s inventory"; 
        for(int i=0; i< merchInventory.length; i++){
            merchString += "\n" + i + " " + (merchInventory[i].getName()) + " " + merchInventory[i].getPrice() + "G" ;
        }

        return merchString;
    }

    //this method will bug out if merchIndex is outta bounds 
    //this method depend on player class (Eric's class)
    //this method also depend on the Item class (my class)
    public void sell(int merchIndex, Player player){
        
        //if player has enough gold to buy 
        if(player.getGold() >= merchInventory[merchIndex].getPrice()){
            //player gets item in their inventory 
            player.loseGold(merchInventory[merchIndex].getPrice());
            System.out.println("player bought " + merchInventory[merchIndex].getName());
            player.pickUpItem(merchInventory[merchIndex]);
           
            this.merchInventory[merchIndex] = null;
            
        }else{
            System.out.println("not enough gold");
        }
    }
}
