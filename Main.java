import javax.swing.JFrame;


public class Main {
    public static void main(String[] args){
        System.out.println("Our code demo");
        
        Player playerDemo = new Player("PAT");
        Consumable water = new Consumable("water", 1);
        Weapon stick = new Weapon("stick", 1);
        Armor tutu = new Armor("tutu", 20);
<<<<<<< HEAD

        playerDemo.takeDamage(15);
        playerDemo.useConsumable(water);
        System.out.println(playerDemo.getHealth());
        
           
=======
        Bullet bullet = new Bullet ("bullet");

        
        
        playerDemo.takeDamage(bullet);          
>>>>>>> Eric-Repo3
        playerDemo.pickUpItem(tutu);
        playerDemo.pickUpItem(stick);
        playerDemo.equipArmor(tutu);
        playerDemo.equipWeapon(stick);

        //System.out.println(playerDemo.getHealth());

<<<<<<< HEAD
        //System.out.println(playerDemo.getHealth());

        String[] dialogue = {"MrLee","is","emotionally tall"};
=======
        playerDemo.useConsumable(water);
        //System.out.println(playerDemo.getHealth());

        String[] dialogue = {"1","2","3"};
>>>>>>> Eric-Repo3
        int[] NPCoord = {1,2};
        int[] NPCsize = {10,10};
        Npc npcLucifer = new Npc ("lucifer",NPCoord,NPCsize,dialogue);
        Item item = new Item("Kock", NPCoord, NPCsize, "This is kock", 20);
        //  PRESS A to talk
        npcLucifer.talk(); 
<<<<<<< HEAD
        npcLucifer.setDialogue("emotionally numb", 2);
        System.out.println(npcLucifer);
=======
>>>>>>> Eric-Repo3
        //System.out.println(npcLucifer);

       
        // This is our graphics section that we gave up after sprint 2 
<<<<<<< HEAD
        
=======
        /** 
>>>>>>> Eric-Repo3
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
<<<<<<< HEAD
        
=======
        */
>>>>>>> Eric-Repo3

      
    
    }
}
