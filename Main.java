import javax.sound.midi.Soundbank;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args){
        System.out.println("Our code demo");
        
        Player playerDemo = new Player("PAT");
        Consumable water = new Consumable("water", 1);
        Weapon stick = new Weapon("stick", 1);
        Armor tutu = new Armor("tutu", 20);
        Bullet bullet = new Bullet ("bullet");

        playerDemo.takeDamage(bullet);
        playerDemo.useConsumable(water);
                  
        playerDemo.pickUpItem(tutu);
        playerDemo.pickUpItem(stick);
        playerDemo.equipArmor(tutu);
        playerDemo.equipWeapon(stick);

        //Testing Merchant npc 
        String[] MerchantDialogue = {"You","want","buy?"};
        Weapon balletShoes = new Weapon("Ballet Shoes", 7);
        Armor  cowboyHat = new Armor("Cowboy Hat", 12);
        Consumable nice = new Consumable("Nice Cream", 15);
        Item[] pearsonMerchInventory = {balletShoes,cowboyHat,nice};

        //setting random prices on these items
        for (int i=0; i< pearsonMerchInventory.length; i++){
            pearsonMerchInventory[i].setPrice(20 + i);
        }

        //player cannot handle more than 5 items, it bugs out 
        Merchant pearson = new Merchant("Pearson", MerchantDialogue, pearsonMerchInventory);
        //pearson.talk();
        System.out.println(pearson.getMerchasString());
        playerDemo.earnGold(20);
        pearson.sell(0, playerDemo);

        //playerDemo.printInventory();
        System.out.print(playerDemo);
        System.out.println(pearson);

    

        
        //Testing npc dialogue 
        String[] dialogue = {"MrLee","is","emotionally tall"};
        int[] NPCoord = {1,2};
        int[] NPCsize = {10,10};
        Npc npcLucifer = new Npc ("lucifer",NPCoord,NPCsize,dialogue);
        Item item = new Item("Kock", NPCoord, NPCsize, "This is kock", 20);
        //  PRESS A to talk
        npcLucifer.talk(); 

        System.out.println("");

        //changing dialogue 
        npcLucifer.setDialogue("emotionally numb", 2);
        System.out.println(npcLucifer);
        System.out.println("");
        System.out.println(item);
        //System.out.println(npcLucifer);

        npcLucifer.npcShoot(bullet,playerDemo);
        System.out.println(playerDemo.getHealth());
       
        // This is our graphics section that we gave up after sprint 2 
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setResizable(false);
        window.setTitle("Undertale");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel); //equivolent of adding a normal jpanel 

        window.pack();
        gamePanel.startGamePanel();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
         
      
    
    }
}
