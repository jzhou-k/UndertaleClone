import javax.swing.JFrame;


public class Main {
    public static void main(String[] args){

        
        Player playerDemo = new Player("PAT");
        Consumable water = new Consumable("water", 1);
        Weapon stick = new Weapon("stick", 1);
        Armor tutu = new Armor("tutu", 20);
        playerDemo.takeDamage(15);
        //System.out.println(playerDemo.getHealth());

        playerDemo.useConsumable(water);
        //System.out.println(playerDemo.getHealth());

        String[] dialogue = {"1","2","3"};
        int[] NPCoord = {1,2};
        int[] NPCsize = {10,10};
        Npc npcLucifer = new Npc ("lucifer",NPCoord,NPCsize,dialogue);
        npcLucifer.talk(); 

        System.out.println(npcLucifer);

        /** 
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
        */

        System.out.println("demo");
        
    
    }
}
